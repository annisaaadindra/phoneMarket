package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceCity;
import entity.City;

public class ImplCity implements InfaceCity {
    private Connection conn;

    public ImplCity(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int add(City city) throws Exception {
        String sql = "insert into kota(nama) values (?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, city.getNamaKota());

        return pst.executeUpdate();
    }

    @Override
    public City findByID(int id) throws Exception {
        City city = null;
        String sql = "Select * from kota where idKota = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            city = new City();
            city.setIdKota(rs.getInt("idKota"));
            city.setNamaKota(rs.getString("nama"));
        }

        // System.out.println("ID kota: " + city.getIdKota());
        // System.out.println("Nama: " + city.getNamaKota());
        return city;
    }

    @Override
    public List<City> showAllCity() throws Exception {
        List<City> listofCities = new ArrayList<City>();
        String sql = "Select * from kota";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan daftar kota**");
        System.out.println("DAFTAR KOTA \n==============================");
        System.out.println("ID \t Nama Kota");
        while (rs.next()) {
            City city = new City();
            city.setIdKota(rs.getInt("idKota"));
            city.setNamaKota(rs.getString("nama"));

            listofCities.add(city);
            System.out.println(city.getIdKota() + " \t " + city.getNamaKota());
        }
        System.out.println("-----------------------------");

        return listofCities;
    }

    @Override
    public int update(int idCity, String newName) throws Exception {
        City city = findByID(idCity);
        String sql = "update kota set idKota = ?, nama=? where idKota = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, city.getIdKota());
        pst.setString(2, newName);
        pst.setInt(3, idCity);

        System.out.println("Data di atas berhasi diubah");

        return pst.executeUpdate();
    }

    @Override
    public int delete(int idCity) throws Exception {
        String sql = "delete from kota where idKota = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCity);

        System.out.println("Data berhasil dihapus");

        return pst.executeUpdate();
    }

    @Override
    public City findByKecamatan(int idKec) throws Exception {
        City city = null;
        String sql = "SELECT kecamatan.*, keckota.idKota FROM kecamatan LEFT JOIN keckota ON keckota.idKecamatan = kecamatan.idKecamatan where kecamatan.idKecamatan = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idKec);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            city = findByID(rs.getInt("idKota"));
        }

        return city;
    }
}
