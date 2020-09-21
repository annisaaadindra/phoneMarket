package dao.inface;

import java.util.List;

import entity.Color;

public interface InfaceColor {
    public int addColor(Color color);
    public int updColor(Color color);
    public int delColor(Color color);

    public List<Color> showAllColor();
}
