package entity;

public class Varian {
    private int idVarian;
    private String varName;

    public Varian() {
    }

    public Varian(int idVarian, String varName) {
        this.idVarian = idVarian;
        this.varName = varName;
    }

    public int getIdVarian() {
        return idVarian;
    }

    public void setIdVarian(int idVarian) {
        this.idVarian = idVarian;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
