package dao.inface;

import java.util.List;

import entity.Province;

public interface InfaceProv {
    public int insert(Province prov) throws Exception;
    public int update(int idProv, String provName) throws Exception;
    public int delete(int idProv) throws Exception;

    public List<Province> findAll() throws Exception;
    public Province viewOneByID(int idProv) throws Exception;
    public Province viewProvByCity(int idCity) throws Exception;
}
