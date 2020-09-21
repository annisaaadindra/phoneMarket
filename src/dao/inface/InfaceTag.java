package dao.inface;

import java.util.List;

import entity.Tag;

public interface InfaceTag {
    public int addTag(Tag tag) throws Exception;
    public int update(int idTag, String newDesc) throws Exception;
    public int delete(int idTag) throws Exception;

    public List<Tag> showAllTag() throws Exception;
}
