package app;

import dao.MySQLConnection;
import dao.impl.ImplColor;
import dao.inface.InfaceColor;
import entity.Color;

public class MainAddColor {
    public static void main(String[] args) throws Exception {
        InfaceColor colorDAO = new ImplColor(MySQLConnection.getConnection());
        Color color = new Color();
        color.setColorName("Silver");
        colorDAO.addColor(color);
    }
}
