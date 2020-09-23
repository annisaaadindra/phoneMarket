package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceAddress;
import dao.inface.InfaceCustomer;
import dao.inface.InfaceOrder;
import entity.Address;
import entity.Customer;
import entity.Order;

public class ImplOrder implements InfaceOrder {
    private Connection conn;

    public ImplOrder(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Order> showAllOrder() throws Exception {
        List<Order> listofOrders = new ArrayList<Order>();
        String sql = "select * from t_order";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        InfaceCustomer cstDAO = new ImplCustomer(this.conn);
        InfaceAddress adrDAO = new ImplAddress(this.conn);

        System.out.println("===================\n**menampilkan semua order**");

        System.out.println("=======================================");
        System.out.println("ID \t Customer \t\t Detail Alamat \t\t Kode Pos \t Kota \t\t\t Provinsi \t Nomor Telepon");

        while(rs.next())
        {
            Order order = new Order();
            order.setIdOrder(rs.getInt("idOrder"));
            
            Customer cst = cstDAO.showProfile(rs.getInt("idCustomer"));
            order.setCst(cst);

            Address adr =adrDAO.selectAddress(rs.getInt("idAlamatPengiriman"));
            order.setAdr(adr);

            order.setDateOrder(rs.getDate("orderDate"));
            order.setTotalHarga(rs.getInt("jumlahTransaksi"));

            System.out.println(order.getIdOrder() + " \t " + order.getCst().getFirstName() + " " + order.getCst().getLastName() + " \t " + order.getAdr().getAddress() + " \t " + order.getAdr().getKodePos() + " \t\t " + order.getAdr().getCity().getNamaKota() + " \t " + order.getAdr().getProv().getProvName() + " \t\t " + order.getAdr().getNoTelfon());
            System.out.println("\t Tanggal order " + order.getDateOrder());
            System.out.println("\t Subtotal Transaksi: " + order.getTotalHarga() + "\n");
            listofOrders.add(order);
        }
        
        return listofOrders;
    }

    @Override
    public List<Order> showOrderByCst(int idCst) throws Exception {
        List<Order> listOrderByCst = new ArrayList<Order>();

        String sql = "select * from t_order where idCustomer = ?";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        pst.setInt(1, idCst);

        ResultSet rs = pst.executeQuery();
        InfaceCustomer cstDAO = new ImplCustomer(this.conn);
        InfaceAddress adrDAO = new ImplAddress(this.conn);
        System.out.println("===================\n**menampilkan semua order dari salah satu customer**");

        System.out.println("=======================================");
        System.out.println("ID \t Customer \t\t Detail Alamat \t\t Kode Pos \t Kota \t\t\t Provinsi \t Nomor Telepon");
        while(rs.next())
        {
            Order order = new Order();
            order.setIdOrder(rs.getInt("idOrder"));
            Customer cst = cstDAO.showProfile(rs.getInt("idCustomer"));
            order.setCst(cst);
            Address adr =adrDAO.selectAddress(rs.getInt("idAlamatPengiriman"));
            order.setAdr(adr);
            order.setDateOrder(rs.getDate("orderDate"));
            order.setTotalHarga(rs.getInt("jumlahTransaksi"));
            System.out.println(order.getIdOrder() + " \t " + order.getCst().getFirstName() + " " + order.getCst().getLastName() + " \t " + order.getAdr().getAddress() + " \t " + order.getAdr().getKodePos() + " \t\t " + order.getAdr().getCity().getNamaKota() + " \t " + order.getAdr().getProv().getProvName() + " \t\t " + order.getAdr().getNoTelfon());
            System.out.println("\t Tanggal order " + order.getDateOrder());
            System.out.println("\t Subtotal Transaksi: " + order.getTotalHarga() + "\n");
            listOrderByCst.add(order);
        }
        return listOrderByCst;
    }

    @Override
    public int countSubtotalPrize(int idOrder) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int addOrder(Order order, Customer cst) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
}
