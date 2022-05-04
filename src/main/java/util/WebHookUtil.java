package util;

import com.google.gson.Gson;
import util.pojo.WebHookPojo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebHookUtil {
    public static void execute(String url, WebHookPojo webhook) throws IOException {
        URL webHookURL = new URL(url);
        HttpURLConnection http = (HttpURLConnection)webHookURL.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        // without this user agent you will get 403.
        http.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0)");
        http.setRequestProperty("Content-Type", "application/json");

        String fromPojo = new Gson().toJson(webhook);
        byte[] out = fromPojo.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);
        stream.flush();
        stream.close();
        http.getResponseMessage(); // this is needed.
        http.disconnect();
    }
}
