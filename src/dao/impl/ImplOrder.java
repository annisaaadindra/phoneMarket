package dao.impl;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import dao.inface.InfaceOrder;
import entity.Order;

public class ImplOrder implements InfaceOrder {
    private Connection conn;

    public ImplOrder(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int addOrder(int idCst, int idOrder, int idAddress, Date dateOrder, int total) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countSubtotalPrize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Order> showAllOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> showOrderByCst(int idCst) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> showOrderByDate(Date dateOrder) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
