package org.com.service;

import org.com.entity.TblOrder;

import java.util.List;

public interface TblOrderService {
    /**
     * 添加订单
     * */
    public int add(TblOrder tblOrder);
    /**
     * 修改订单信息
     * */
    public int update(TblOrder tblOrder);
    /**
     * 删除订单
     * */
    public int delete(int orderId);
    /**
     * 查询订单
     * */
    public List<TblOrder> select(int shopperId);
}
