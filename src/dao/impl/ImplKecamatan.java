package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceKecamatan;
import entity.Kecamatan;

public class ImplKecamatan implements InfaceKecamatan {
    private Connection conn;

    public ImplKecamatan(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int add(Kecamatan kec) throws Exception {
        String query = "insert into kecamatan(nama) values (?)";
        PreparedStatement pst = this.conn.prepareStatement(query);
        pst.setString(1, kec.getNama());

        return pst.executeUpdate();
    }

    @Override
    public List<Kecamatan> showAll() throws SQLException {
        List<Kecamatan> listOfKec = new ArrayList<Kecamatan>();
        String query = "select * from kecamatan";
        PreparedStatement pst = this.conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        System.out.println("DAFTAR KECAMATAN \n=============================");
        System.out.println("ID \t Nama Kecamatan");
        while (rs.next()) {
            Kecamatan kec = new Kecamatan();
            kec.setIdKec(rs.getInt("idKecamatan"));
            kec.setNama(rs.getString("nama"));
            listOfKec.add(kec);
            System.out.println(kec.getIdKec() + " \t " + kec.getNama());
        }

        System.out.println("-----------------------------");
        return listOfKec;
    }

    @Override
    public int update(int id, String nama) throws Exception {
        String query = "update kecamatan set nama = ? where idKecamatan = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(2, id);
        pst.setString(1, nama);
        return pst.executeUpdate();
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from kecamatan where idKecamatan = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        return pst.executeUpdate();
    }

    @Override
    public Kecamatan getKecFromPostalCode(String postalCode) throws Exception {
        Kecamatan kec = null;
        String sql = "SELECT kecamatan.nama, kodePos.* FROM `kodepos` JOIN kecamatan ON kodePos.idKecamatan = kecamatan.idKecamatan WHERE kodePos = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, postalCode);
        ResultSet rs = pst.executeQuery();
       
        if (rs.next())
        {
            kec = new Kecamatan();
            kec.setIdKec(rs.getInt("idKecamatan"));
            kec.setNama(rs.getString("nama"));
        }

        return kec;
    }
}
