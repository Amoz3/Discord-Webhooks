package util.pojo;

public class EmbedPojo {
    private String title = "embed title";
    private String type = "rich";
    private String description = "embed desc.";
    private int color = 1127128;
    private FieldPojo[] fields;

    public EmbedPojo(String title, String description, FieldPojo[] fields) {
        this.title = title;
        this.description = description;
        this.fields = fields;
    }

    public EmbedPojo() {
    }

    public EmbedPojo(String title, String type, String description, int color, FieldPojo[] fields) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.color = color;
        this.fields = fields;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public FieldPojo[] getFields() {
        return fields;
    }

    public void setFields(FieldPojo[] fields) {
        this.fields = fields;
    }
}
