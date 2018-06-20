package org.com.dao;

import org.com.entity.Order;

import java.util.List;

public interface OrderMapper {
    /**
     * 添加订单
     * @param order
     * @return
     */
    public int insert(Order order);

    /**
     * 修改订单
     * @param order
     * @return
     */
    public int update(Order order);

    /**
     * 删除订单
     * @param order_id
     * @return
     */
    public int delete(int order_id);

    /**
     * id查询订单
     * @param order_id
     * @return
     */
    public Order selectById(int order_id);

    /**
     * 查询所有订单
     * @return
     */
    public List<Order> selectAll();

}
