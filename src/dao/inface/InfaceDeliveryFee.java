package dao.inface;

import java.util.List;
import entity.DeliveryFee;

public interface InfaceDeliveryFee {
    public int insertFee(int idCity, int idCourier, int idFee, int feeAmount);
    public int updateFee(DeliveryFee deliveryFee);
    public int deleteFee(DeliveryFee deliveryFee);

    public List<DeliveryFee> compareFeeCityBased(int idCity);
    public List<DeliveryFee> listCourierAllCity(int idCourier);
    public DeliveryFee selectCourierCity(int idCity, int idCourier);
}
