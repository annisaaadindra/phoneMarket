package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceCustomer;
import entity.Customer;

public class ImplCustomer implements InfaceCustomer {
    private Connection conn;

    public ImplCustomer(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int idCustomer) throws Exception {
        String sql = "delete from customer where idCustomer = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCustomer);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil dihapus");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public int insert(Customer cst) throws Exception {
        String sql = "insert into customer(firstName, lastName, email, password, phoneNumber) values (?, ?, ?, ?, ?)";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cst.getFirstName());
        pst.setString(2, cst.getLastName());
        pst.setString(3, cst.getEmail());
        pst.setString(4, cst.getPassword());
        pst.setString(5, cst.getPhoneNumber());

        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public List<Customer> showAllCst() throws Exception {
        List<Customer> listOfCustomers = new ArrayList<Customer>();

        String sql = "Select * from customer";

        PreparedStatement pst = this.conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        System.out.println("===================\n**menampilkan daftar customer**");
        System.out.println("DAFTAR CUSTOMER \n=======================================");
        System.out.println("ID \t Nama Depan \t Nama Belakang \t Email \t\t Phone Number ");

        while (rs.next()) {
            Customer cst = new Customer();

            cst.setEmail(rs.getString("email"));
            cst.setFirstName(rs.getString("firstName"));
            cst.setLastName(rs.getString("lastName"));
            cst.setIdCustomer(rs.getInt("idCustomer"));
            cst.setPhoneNumber(rs.getString("phoneNumber"));
            listOfCustomers.add(cst);

            System.out.println(cst.getIdCustomer() + " \t " + cst.getFirstName() + " \t " + cst.getLastName() + " \t "
                    + cst.getEmail() + " \t " + cst.getPhoneNumber());
        }

        System.out.println("----------------------------------------");

        return listOfCustomers;
    }

    @Override
    public Customer showProfile(int idCustomer) throws Exception {
        Customer cst = null;

        String sql = "Select * from customer where idCustomer = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idCustomer);

        ResultSet rs = pst.executeQuery();

        if (rs.next())
        {
            cst = new Customer();

            cst.setIdCustomer(rs.getInt("idCustomer"));
            cst.setFirstName(rs.getString("firstName"));
            cst.setLastName(rs.getString("lastName"));
            cst.setPhoneNumber(rs.getString("phoneNumber"));
            cst.setEmail(rs.getString("email"));
        }

        // System.out.println("**show customer's profile**");
    
        // System.out.println("--------------------------");
        // System.out.println("ID Customer: " + cst.getIdCustomer());
        // System.out.println("First name: " + cst.getFirstName());
        // System.out.println("Last name: " + cst.getLastName());
        // System.out.println("Phone number: " + cst.getPhoneNumber());
        // System.out.println("Email: " + cst.getEmail());

        return cst;
    }

    @Override
    public int update(Customer cst) throws Exception {
        cst.setEmail("dgsjh@jhd.ds");
        cst.setFirstName("Bintang");
        cst.setLastName("Oyhjkwee");
        cst.setPhoneNumber("0876545678");
        cst.setPassword("8ybhsmji8");

        String sql ="update customer set firstName = ?, lastName = ?, password = ?, phoneNumber = ?, email = ? where idCustomer = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, cst.getFirstName());
        pst.setString(2, cst.getLastName());
        pst.setString(3, cst.getPassword());
        pst.setString(4, cst.getPhoneNumber());
        pst.setString(5, cst.getEmail());
        pst.setInt(6, cst.getIdCustomer());
        
        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }
}