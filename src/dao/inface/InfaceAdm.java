package dao.inface;

import java.util.List;

import entity.Administrator;

public interface InfaceAdm {
    public int insert(Administrator adm) throws Exception;
    public int update(int idAdmin, String newEmail, String newName, String password) throws Exception;
    public int delete(int idAdmin) throws Exception;
    public Administrator findByID (int id) throws Exception;
    public List<Administrator> showAll() throws Exception;
}
