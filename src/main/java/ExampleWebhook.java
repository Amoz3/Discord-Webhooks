import com.google.gson.Gson;
import util.WebHookUtil;
import util.pojo.EmbedPojo;
import util.pojo.FieldPojo;
import util.pojo.WebHookPojo;

import java.io.IOException;

public class ExampleWebhook {
    public static void main(String[] args) throws IOException {
        // Fields
        FieldPojo lvlField = new FieldPojo("level", "99", true);
        FieldPojo gpField = new FieldPojo("gp made", "2.4b", true);
        FieldPojo runtime = new FieldPojo("runtime", "10 hours bonidled", false);
        FieldPojo[] fieldPojos = new FieldPojo[]{lvlField, gpField, runtime};

        // Embeds
        EmbedPojo embedPojo = new EmbedPojo("this is the embed title", "this is the embeds description", fieldPojos);
        EmbedPojo[] embedPojos = new EmbedPojo[]{embedPojo};

        // the whole webhook
        WebHookPojo webHook = new WebHookPojo(embedPojos);

        String url = "https://discord.com/api/webhooks/970722479259672596/di0OYb5znkklT8tlgmNzrD3_xFSwW2wkFKQTXC8QXq0YIDM2AYKpdr7Jsa165t-Yg8ii";
        WebHookUtil.execute(url, webHook);
    }

}