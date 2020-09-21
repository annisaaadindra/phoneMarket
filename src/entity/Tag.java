package entity;

public class Tag {
    private int idTag;
    private String tagName;

    public Tag() {
    }

    public Tag(int idTag, String tagName) {
        this.idTag = idTag;
        this.tagName = tagName;
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    
}
