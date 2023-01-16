package com.dxc.test;

import com.dxc.dao.OrderItemDao;
import com.dxc.dao.impl.OrderItemDaoImpl;
import com.dxc.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoImplTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null,"java从入门的放弃",1,new BigDecimal(100),new BigDecimal(100),"213325432"));
        orderItemDao.saveOrderItem(new OrderItem(null,"javaSciprt从入门的放弃",2,new BigDecimal(100),new BigDecimal(100),"213325432"));
        orderItemDao.saveOrderItem(new OrderItem(null,"Netty入门  ",1,new BigDecimal(100),new BigDecimal(100),"213325432"));
    }
}