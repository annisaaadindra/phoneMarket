package dao.inface;

import java.util.List;

import entity.Courier;

public interface InfaceCourier {
    public int insert(Courier kurir);
    public int update(Courier kurir);
    public int delete(Courier kurir);

    public Courier viewCourierProfile(int id);
    public List<Courier> showAllCourier();
}
