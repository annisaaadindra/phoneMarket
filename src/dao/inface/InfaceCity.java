package dao.inface;

import java.util.List;
import entity.City;

public interface InfaceCity {
    public int add(City city) throws Exception;
    public int delete(int idCity) throws Exception;
    public int update(int idCity, String newName) throws Exception;

    public List<City> showAllCity() throws Exception;
    public City findByID(int id) throws Exception;
    public City findByKecamatan(int idKec) throws Exception;
}
