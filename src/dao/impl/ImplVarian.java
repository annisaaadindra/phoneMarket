package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceVarian;
import entity.Varian;

public class ImplVarian implements InfaceVarian {
    private Connection conn;

    public ImplVarian(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int add(Varian var) throws Exception {
        String sql = "insert into varian(nama) values (?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, var.getVarName());
        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public int delete(int idVar) throws Exception {
        String sql = "delete from varian where idVarian = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idVar);

        System.out.println("Data berhasil dihapus");

        return pst.executeUpdate();
    }

    @Override
    public Varian getVarianByID(int id) throws Exception {
        Varian var = null;
        String sql = "Select * from varian where idVarian = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            var = new Varian();
            var.setIdVarian(rs.getInt("idVarian"));
            var.setVarName(rs.getString("nama"));
        }

        System.out.println("**show one varian**");
        System.out.println("-------------------------");
        System.out.println("ID Varian: " + var.getIdVarian());
        System.out.println("Deskripsi: " + var.getVarName());
        return var;
    }

    @Override
    public List<Varian> showAll() throws Exception {
        List<Varian> listofVarian = new ArrayList<Varian>();
        String sql = "Select * from varian";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        System.out.println("============\n**menampilkan daftar varian**");
        System.out.println("DAFTAR KOTA \n==============================");
        System.out.println("ID \t Deskripsi Varian");
        while (rs.next()) {
            Varian var = new Varian();
            var.setIdVarian(rs.getInt("idVarian"));
            var.setVarName(rs.getString("nama"));

            listofVarian.add(var);
            System.out.println(var.getIdVarian() + " \t " + var.getVarName());
        }
        System.out.println("-----------------------------");

        return listofVarian;
    }

    @Override
    public int update(int idVarian, String nama) throws Exception {
        Varian var = getVarianByID(idVarian);
        var.setVarName(nama);
        
        String sql ="update varian set idVarian = ?, nama=? where idVarian = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setInt(1, var.getIdVarian());
        pst.setString(2, var.getVarName());
        pst.setInt(3, idVarian);

        System.out.println("Data di atas berhasi diubah");

        return pst.executeUpdate();
    }
}
