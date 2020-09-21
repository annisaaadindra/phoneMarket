package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceTag;
import entity.Tag;

public class ImplTag implements InfaceTag {
    private Connection conn;

    public ImplTag(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int addTag(Tag tag) throws Exception {
        String sql = "insert into tag(nama) values (?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, tag.getTagName());
        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public int delete(int idTag) throws Exception {
        String sql = "delete from tag where idTag = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idTag);

        System.out.println("Data berhasil dihapus");

        return pst.executeUpdate();
    }

    @Override
    public List<Tag> showAllTag() throws Exception {
        List<Tag> listofTag = new ArrayList<Tag>();
        String sql = "Select * from tag";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan daftar tag**");
        System.out.println("DAFTAR TAG \n==============================");
        System.out.println("ID \t Deskripsi Tag");
        while (rs.next()) {
            Tag tag = new Tag();
            tag.setIdTag(rs.getInt("idTag"));
            tag.setTagName(rs.getString("nama"));

            listofTag.add(tag);
            System.out.println(tag.getIdTag() + " \t " + tag.getTagName());
        }
        System.out.println("-----------------------------");

        return listofTag;
    }

    @Override
    public int update(int idTag, String newDesc) throws Exception {

        String query = "update tag set nama = ? where idTag = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(2, idTag);
        pst.setString(1, newDesc);
        System.out.println("Data berhasil diperbaharui");
        return pst.executeUpdate();
    }

}
