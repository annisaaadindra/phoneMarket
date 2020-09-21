package app;

import dao.MySQLConnection;
import dao.impl.ImplVarian;
import dao.inface.InfaceVarian;
import entity.Varian;

public class MainAddVarian {
    public static void main(String[] args) throws Exception {
        InfaceVarian varDAO = new ImplVarian(MySQLConnection.getConnection());
        
        Varian newvar = new Varian();
        newvar.setVarName("10000 mAh");

        varDAO.add(newvar);
    }
}
