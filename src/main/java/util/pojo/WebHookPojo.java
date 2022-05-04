package util.pojo;

public class WebHookPojo {
    private String username;
    private String content;
    private String avatar_url;
    private EmbedPojo[] embeds;

    public WebHookPojo() {
    }

    public WebHookPojo(EmbedPojo[] embeds) {
        this.embeds = embeds;
    }


    public EmbedPojo[] getEmbeds() {
        return embeds;
    }

    public void setEmbeds(EmbedPojo[] embeds) {
        this.embeds = embeds;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
