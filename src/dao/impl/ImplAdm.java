package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceAdm;
import entity.Administrator;

public class ImplAdm implements InfaceAdm {
    private Connection conn;

    public ImplAdm(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int idAdmin) throws Exception {
        String sql = "delete from administrator where idAdministrator = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idAdmin);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil diperbaharui");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public Administrator findByID(int id) throws Exception {
        Administrator adm = null;
        String sql = "Select * from administrator where idAdministrator = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            adm = new Administrator();
            adm.setIdAdmin(rs.getInt("idAdministrator"));
            adm.setEmail(rs.getString("email"));
            adm.setName(rs.getString("name"));
            adm.setPassword(rs.getString("password"));
        }

        System.out.println("**show administrator's profile**");
        System.out.println("--------------------------");
        System.out.println("ID Administrator: " + adm.getIdAdmin());
        System.out.println("Nama: " + adm.getName());
        System.out.println("Email: " + adm.getEmail());
        System.out.println("Password: " + adm.getPassword());

        return adm;
    }

    @Override
    public int insert(Administrator adm) throws Exception {
        String sql = "insert into administrator(name, email, password) values (?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, adm.getName());
        pst.setString(2, adm.getEmail());
        pst.setString(3, adm.getPassword());

        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public int update(int idAdmin, String newEmail, String newName, String password) throws Exception {
        Administrator adm = findByID(idAdmin);
        adm.setEmail(newEmail);
        adm.setName(newName);
        adm.setPassword(password);

        String sql ="update administrator set name = ?, email = ?, password = ? where idAdministrator = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, adm.getName());
        pst.setString(2, adm.getEmail());
        pst.setString(3, adm.getPassword());
        pst.setInt(4, idAdmin);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public List<Administrator> showAll() throws Exception {
        List<Administrator> listOfAdmins = new ArrayList<Administrator>();
        String sql = "Select * from administrator";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        System.out.println("===================\n**menampilkan daftar administrator**");
        System.out.println("DAFTAR ADMINISTRATOR \n==============================");
        System.out.println("ID \t Nama \t\t Email");

        while (rs.next())
        {
            Administrator adm = new Administrator();
            adm.setEmail(rs.getString("email"));
            adm.setIdAdmin(rs.getInt("idAdministrator"));
            adm.setName(rs.getString("name"));

            listOfAdmins.add(adm);
            System.out.println(adm.getIdAdmin() + " \t " + adm.getName() + " \t " + adm.getEmail());
        }

        System.out.println("-----------------------------");
        return listOfAdmins;
    }

}
