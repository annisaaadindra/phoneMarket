package dao.inface;

import java.sql.SQLException;
import java.util.List;

import entity.Kecamatan;

public interface InfaceKecamatan {
    public int add(Kecamatan kecamatan) throws Exception;
    public int update(int id, String nama) throws Exception;
    public int delete(int id) throws Exception;

    public List<Kecamatan> showAll() throws SQLException;
    public Kecamatan getKecFromPostalCode(String postalCode) throws Exception;
}
