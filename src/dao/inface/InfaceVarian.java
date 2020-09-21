package dao.inface;

import java.util.List;

import entity.Varian;

public interface InfaceVarian {
    public int add(Varian var) throws Exception;
    public int update(int idVar, String newNama) throws Exception;
    public int delete(int idVar) throws Exception;

    public List<Varian> showAll() throws Exception;
    public Varian getVarianByID(int id) throws Exception;
}
