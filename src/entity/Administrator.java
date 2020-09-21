package entity;

public class Administrator{
    private int idAdmin;
    private String name;
    private String email;
    private String password;

    public Administrator() {
    }

    public Administrator(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    // private static ArrayList customerList;

    // public static void main(String[] args) {
    // customerList = new ArrayList();

    // Customer cst = new Customer(1, "0863562172", "Annisaa", "Daulay",
    // "hbds@ddnj.njs", "*****");
    // Customer cst2 = new Customer(2, "0863562172", "Anni", "Daula", "hbs@dnj.ns",
    // "*****");

    // customerList.add(cst);
    // customerList.add(cst2);

    // for(int i = 0; i < customerList.size();i++)
    // {
    // // System.out.println(((Customer)customerList.get(i)).firstName);
    // System.out.println(((Customer)customerList.get(i)).email);
    // }
    // }
}
