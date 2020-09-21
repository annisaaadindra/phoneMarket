package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceBrand;
import entity.Brand;

public class ImplBrand implements InfaceBrand {
    private Connection conn;

    public ImplBrand(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int addBrand(Brand brand) throws Exception {
        String sql = "insert into merk(nama) values (?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, brand.getNama());

        return pst.executeUpdate();
    }

    @Override
    public int delBrand(int idBrand) throws Exception {
        String sql = "delete from merk where idMerk = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idBrand);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil dihapus");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public List<Brand> showAllBrand() throws Exception {
        List<Brand> listOfBrands = new ArrayList<Brand>();
        String sql = "Select * from merk";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan daftar brand**");

        System.out.println("DAFTAR BRAND \n==============================");

        System.out.println("ID \t Nama Brand");

        while (rs.next()) {
            Brand brand = new Brand();
            brand.setIdMerk(rs.getInt("idMerk"));
            brand.setNama(rs.getString("nama"));

            listOfBrands.add(brand);

            System.out.println(brand.getIdMerk() + " \t " + brand.getNama());
        }

        System.out.println("-----------------------------");

        return listOfBrands;
    }

    @Override
    public int updBrand(Brand brand) throws Exception {
        brand.setNama("iPhone");
        String sql = "update merk set nama=? where idMerk = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, brand.getNama());
        pst.setInt(2, brand.getIdMerk());

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

            return rowAffected;
    }

}
