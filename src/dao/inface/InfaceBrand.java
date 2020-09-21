package dao.inface;

import java.util.List;

import entity.Brand;

public interface InfaceBrand {
    public int addBrand(Brand brand) throws Exception;
    public int updBrand(Brand brand) throws Exception;
    public int delBrand(int idBrand) throws Exception;

    public List<Brand> showAllBrand() throws Exception;
}
