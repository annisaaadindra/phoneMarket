package app;

import dao.MySQLConnection;
import dao.impl.ImplTag;
import dao.inface.InfaceTag;
import entity.Tag;

public class MainAddTag {
    public static void main(String[] args) throws Exception
    {
        Tag tag = new Tag();
        tag.setTagName("Xiaomi Redmi");

        InfaceTag tagDAO = new ImplTag(MySQLConnection.getConnection());
        tagDAO.addTag(tag);
    }
}
