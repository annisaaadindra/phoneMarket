package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceProv;
import entity.Province;

public class ImplProv implements InfaceProv {
    private Connection conn;

    public ImplProv(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int idProv) throws Exception {
        String sql = "delete from provinsi where idProvinsi = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idProv);

        System.out.println("Data berhasil dihapus");

        return pst.executeUpdate();
    }

    @Override
    public List<Province> findAll() throws Exception {
        List<Province> listOfProvinces = new ArrayList<Province>();
        String sql = "Select * from provinsi";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        System.out.println("===================\n**menampilkan daftar provinsi**");
        System.out.println("DAFTAR PROVINSi \n==============================");
        System.out.println("ID \t Nama Provinsi");

        while (rs.next()) {
            Province prov = new Province();
            prov.setIdProv(rs.getInt("idProvinsi"));
            prov.setProvName(rs.getString("nama"));

            listOfProvinces.add(prov);
            System.out.println(prov.getIdProv() + " \t " + prov.getProvName());
        }

        System.out.println("-----------------------------");

        return listOfProvinces;
    }

    @Override
    public int insert(Province prov) throws Exception {
        String sql = "insert into provinsi(nama) values (?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, prov.getProvName());
        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public int update(int idProv, String provName) throws Exception {
        String query = "update provinsi set nama = ? where idProvinsi = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(2, idProv);
        pst.setString(1, provName);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil diperbaharui");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public Province viewOneByID(int idProv) throws Exception {
        Province prov = null;
        String sql = "Select * from provinsi where idProvinsi = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idProv);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            prov = new Province();
            prov.setIdProv(rs.getInt("idProvinsi"));
            prov.setProvName(rs.getString("nama"));
        }

        // System.out.println("**show one province**");
        // System.out.println("--------------------------");
        // System.out.println("ID Provinsi: " + prov.getIdProv());
        // System.out.println("Nama: " + prov.getProvName());
        return prov;
    }

    @Override
    public Province viewProvByCity(int idCity) throws Exception {
        Province prov = null;
        String sql = "SELECT kota.*, kotaprov.idProvinsi FROM kota LEFT JOIN kotaprov ON kota.idKota = kotaprov.idKota WHERE kota.idKota = ?";
        
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCity);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) 
        {
            prov = viewOneByID(rs.getInt("idProvinsi"));
        }

        return prov;
    }

}
