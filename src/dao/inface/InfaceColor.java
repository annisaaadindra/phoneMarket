package dao.inface;

import java.util.List;

import entity.Color;

public interface InfaceColor {
    public int addColor(Color color) throws Exception;
    public int updColor(Color color) throws Exception;
    public int delColor(int idColor) throws Exception;

    public List<Color> showAllColor() throws Exception;
    public Color selectOneColor(int idCOlor) throws Exception;
}
