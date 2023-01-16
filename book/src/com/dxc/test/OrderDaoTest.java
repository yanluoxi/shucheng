package com.dxc.test;

import com.dxc.dao.OrderDao;
import com.dxc.dao.impl.OrderDaoImpl;
import com.dxc.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoTest {

    @Test
    public void saveOrder() {
        OrderDao orderDao =new OrderDaoImpl();
        orderDao.saveOrder(new Order("213325432",new Date(),new BigDecimal(100),0,1));
    }
}