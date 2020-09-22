package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceColor;
import entity.Color;

public class ImplColor implements InfaceColor {
    private Connection conn;

    public ImplColor(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int addColor(Color color) throws Exception {
        String sql = "insert into refwarna(nama) values (?)";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, color.getColorName());

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil ditambahkan");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public int delColor(int idColor) throws Exception {
        String sql = "delete from refwarna where idWarna = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idColor);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil dihapus");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public Color selectOneColor(int idCOlor) throws Exception {
        Color color = null;

        String sql = "Select * from refwarna where idWarna = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCOlor);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            color = new Color();
            color.setIdColor(rs.getInt("idWarna"));
            color.setColorName(rs.getString("nama"));

            // System.out.println("**menampilkan satu warna**");

            // System.out.println("--------------------------");
            // System.out.println("ID: " + color.getIdColor());

            // System.out.println("Detail warna: " + color.getColorName());
        }

        return color;
    }

    @Override
    public List<Color> showAllColor() throws Exception {
        List<Color> allColor = new ArrayList<Color>();

        String sql = "Select * from refwarna";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan semua warna**");

        System.out.println("DAFTAR WARNA \n==============================");

        System.out.println("ID \t Warna");

        while (rs.next()) {
            Color color = new Color();
            color.setColorName(rs.getString("nama"));
            color.setIdColor(rs.getInt("idWarna"));
            allColor.add(color);
            System.out.println(color.getIdColor() + "\t" + color.getColorName());
        }

        System.out.println("-----------------------------");
        return allColor;
    }

    @Override
    public int updColor(Color color) throws Exception {
        String sql = "update refwarna set nama=? where idWarna = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, color.getColorName());
        pst.setInt(2, color.getIdColor());

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }
}
