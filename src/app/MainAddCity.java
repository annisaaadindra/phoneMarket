package app;

import dao.MySQLConnection;
import dao.impl.ImplCity;
import dao.inface.InfaceCity;
import entity.City;

public class MainAddCity {
    public static void main(String[] args) throws Exception {
        City newCity = new City();
        newCity.setNamaKota("Pematangsiantar");

        InfaceCity cityDAO = new ImplCity(MySQLConnection.getConnection());
        cityDAO.add(newCity);
        System.out.println("Data berhasil ditambahkan");
    }
}
