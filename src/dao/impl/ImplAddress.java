package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.inface.InfaceAddress;
import dao.inface.InfaceCity;
import dao.inface.InfaceCustomer;
import dao.inface.InfaceKecamatan;
import dao.inface.InfaceProv;
import entity.Address;
import entity.City;
import entity.Customer;
import entity.Kecamatan;
import entity.Province;

public class ImplAddress implements InfaceAddress {
    private Connection conn;

    public ImplAddress(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int idAdr) throws Exception {
        String sql = "delete from alamatPengiriman where idAlamatPengiriman = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idAdr);

        int rowAffected = pst.executeUpdate();
        if (rowAffected > 0)
            System.out.println("Data berhasil dihapus");

        else
            System.out.println("Ada yang salah, periksa lagi querynya");

        return rowAffected;
    }

    @Override
    public List<Address> findByCustAddresses(int idCst) throws Exception {
        List<Address> listOfAddresses = new ArrayList<Address>();
        String sql = "select * from alamatpengiriman where idCustomer = ?";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        pst.setInt(1, idCst);
        
        ResultSet rs = pst.executeQuery();
        InfaceCustomer cstDAO = new ImplCustomer(this.conn);

        InfaceCity cityDAO = new ImplCity(this.conn);
        InfaceKecamatan kecDAO = new ImplKecamatan(this.conn);
        InfaceProv provDAO = new ImplProv(this.conn);

        System.out.println("===================\n**menampilkan daftar alamat customer**");
        Customer cst = cstDAO.showProfile(idCst);
        
        System.out.println("=======================================");
        System.out.println("ID Alamat \t Detail Alamat \t\t Kode Pos \t Kecamatan \t Kota \t\t\t Provinsi \t Nomor Telepon ");

        while(rs.next())
        {
            Address adr = new Address();
            adr.setIdAddress(rs.getInt("idAlamatPengiriman"));
            adr.setCst(cst);
            adr.setAddress(rs.getString("alamat"));
            adr.setCity(null);
            adr.setKodePos(rs.getString("kodePos"));
            adr.setNoTelfon(rs.getString("noTelfonPenerima"));
            adr.setProv(null);
            
            Kecamatan kec = kecDAO.getKecFromPostalCode(adr.getKodePos());
            adr.setKec(kec);

            City city = cityDAO.findByKecamatan(kec.getIdKec());
            adr.setCity(city);

            Province prov = provDAO.viewProvByCity(city.getIdKota());
            adr.setProv(prov);
            
            System.out.println(adr.getIdAddress() + " \t\t " + adr.getAddress() + " \t " + adr.getKodePos() + " \t\t " + adr.getKec().getNama() + " \t " + adr.getCity().getNamaKota() + " \t " + adr.getProv().getProvName() + " \t\t " + adr.getNoTelfon());
            listOfAddresses.add(adr);
        }

        return listOfAddresses;
    }

    @Override
    public int insert(Customer cst, Address adr) throws Exception {
        String sql = "insert into alamatpengiriman(idCustomer, alamat, noTelfonPenerima, kodePos) values (?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, cst.getIdCustomer());
        pst.setString(2, adr.getAddress());
        pst.setString(3, adr.getNoTelfon());
        pst.setString(4, adr.getKodePos());

        System.out.println("Data berhasil ditambahkan ");
        return pst.executeUpdate();
    }

    @Override
    public Address selectAddress(int idAdr) throws Exception {
        Address adr = null;
        String sql = "select * from alamatpengiriman where idALamatPengiriman = ?";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        pst.setInt(1, idAdr);
        
        ResultSet rs = pst.executeQuery();
        InfaceCustomer cstDAO = new ImplCustomer(this.conn);

        InfaceCity cityDAO = new ImplCity(this.conn);
        InfaceKecamatan kecDAO = new ImplKecamatan(this.conn);
        InfaceProv provDAO = new ImplProv(this.conn);

        System.out.println("===================\n**menampilkan alamat pengiriman yang dipilih**");

        if(rs.next())
        {
            adr = new Address();
            adr.setIdAddress(rs.getInt("idAlamatPengiriman"));

            Customer cst = cstDAO.showProfile(rs.getInt("idCustomer"));
            adr.setCst(cst);
            adr.setAddress(rs.getString("alamat"));
            adr.setCity(null);
            adr.setKodePos(rs.getString("kodePos"));
            adr.setNoTelfon(rs.getString("noTelfonPenerima"));
            adr.setProv(null);
            
            Kecamatan kec = kecDAO.getKecFromPostalCode(adr.getKodePos());
            adr.setKec(kec);

            City city = cityDAO.findByKecamatan(kec.getIdKec());
            adr.setCity(city);

            Province prov = provDAO.viewProvByCity(city.getIdKota());
            adr.setProv(prov);
        }

        System.out.println("**show one full address profile**");
        System.out.println("--------------------------");
        System.out.println("Customer's name: " + adr.getCst().getFirstName() + adr.getCst().getLastName());
        System.out.println("Email: " + adr.getCst().getEmail());
        System.out.println("Receiver's contact: " + adr.getNoTelfon());
        System.out.println("Address: "+ adr.getAddress());
        System.out.println("City: "+ adr.getCity().getNamaKota());
        System.out.println("Province: " + adr.getProv().getProvName());

        return adr;
    }

    @Override
    public int update(Address adr) throws Exception {
       adr.setAddress("Jalan Hujan");
       adr.setNoTelfon("087521562345");
       adr.setKodePos("11710");

       String sql ="update alamatPengiriman set alamat = ?, noTelfonPenerima = ?, kodePos = ? where idAlamatPengiriman = ?";

       PreparedStatement pst = conn.prepareStatement(sql);
       pst.setString(1, adr.getAddress());
       pst.setString(2, adr.getNoTelfon());
       pst.setString(3, adr.getKodePos());
       pst.setInt(4, adr.getIdAddress());

        
       int rowAffected = pst.executeUpdate();
       if (rowAffected > 0)
           System.out.println("Data di atas telah diperbaharui, silahkan cek kembali");

       else
           System.out.println("Ada yang salah, periksa lagi querynya");

       return rowAffected;
    }
}
