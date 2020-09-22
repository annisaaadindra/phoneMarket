package app;

import dao.MySQLConnection;
import dao.impl.ImplColor;
import dao.inface.InfaceColor;
import entity.Color;

public class MainUpdColor {
    public static void main(String[] args) throws Exception {
        InfaceColor colorDAO = new ImplColor(MySQLConnection.getConnection());
        Color color = colorDAO.selectOneColor(1);
        color.setColorName("black");
        colorDAO.updColor(color);
    }
}
