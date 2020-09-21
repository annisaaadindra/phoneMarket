package entity;

public class Color {
    private int idColor;
    private String colorName;

    public Color() {
    }

    public Color(int idColor, String colorName) {
        this.idColor = idColor;
        this.colorName = colorName;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    
}
