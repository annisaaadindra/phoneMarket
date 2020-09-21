package dao.inface;

import java.util.List;

import entity.Bill;
import entity.Order;

public interface InfaceBill {
    public int addBill(Order order, int deliveryFee, int totalBayar);

    public List<Bill> showAllBill();
    public List<Bill> showBillByCst(int idCst);
}
