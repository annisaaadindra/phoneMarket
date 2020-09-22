package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.inface.InfaceCategory;
import entity.Category;

public class ImplCategory implements InfaceCategory {
    private Connection conn;

    public ImplCategory(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Category selectOneCat(int idCat) throws Exception {
        Category cat = null;

        String sql = "Select * from jenisbarang where idJenisBarang = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCat);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            cat = new Category();
            cat.setCatName(rs.getString("nama"));
            cat.setIdCat(rs.getInt("idJenisBarang"));
        }

        System.out.println("**menampilkan satu category**");
        System.out.println("--------------------------");
        System.out.println("ID Jenis: " + cat.getIdCat());
        System.out.println("Deskripsi: " + cat.getCatName());
        return cat;
    }

    @Override
    public int addCategory(Category cat) throws Exception {
        String sql = "insert into jenisbarang(nama) values (?)";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cat.getCatName());

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil ditambahkan");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public int deleteCategory(int idCat) throws Exception {
        String sql = "delete from jenisbarang where idJenisBarang = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCat);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil dihapus");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public List<Category> showAllCategory() throws Exception {
        List<Category> listOfCats = new ArrayList<Category>();
        String sql = "Select * from jenisbarang";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan semua kategori**");

        System.out.println("DAFTAR BRAND \n==============================");

        System.out.println("ID \t Deskripsi Kategori");

        while (rs.next())
        {
            Category cat = new Category();
            cat.setIdCat(rs.getInt("idJenisBarang"));
            cat.setCatName(rs.getString("nama"));
            listOfCats.add(cat);

            System.out.println(cat.getIdCat() + " \t " + cat.getCatName());
        }
        System.out.println("-----------------------------");
        return listOfCats;
    }

    @Override
    public int updateCategory(Category cat) throws Exception {
        String sql = "update jenisbarang set nama=? where idJenisBarang = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cat.getCatName());
        pst.setInt(2, cat.getIdCat());

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

            return rowAffected;
    }
}
