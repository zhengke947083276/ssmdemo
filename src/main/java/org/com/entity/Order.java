package org.com.entity;

/**
 * 订单类
 */
public class Order {
    private int order_id;//订单id
    private int shopper_Id;//消费者id
    private int goods_id;//商品id
    private int order_state;//订单状态
    private int goods_number;//商品数量
    private int order_time;//下单时间

    public int getOrder_id() {
        return order_id;
    }

    public int getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(int goods_number) {
        this.goods_number = goods_number;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getShopper_Id() {
        return shopper_Id;
    }

    public void setShopper_Id(int shopper_Id) {
        this.shopper_Id = shopper_Id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getOrder_state() {
        return order_state;
    }

    public void setOrder_state(int order_state) {
        this.order_state = order_state;
    }


    public int getOrder_time() {
        return order_time;
    }

    public void setOrder_time(int order_time) {
        this.order_time = order_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", shopper_Id=" + shopper_Id +
                ", goods_id=" + goods_id +
                ", order_state=" + order_state +
                ", goods_number=" + goods_number +
                ", order_time=" + order_time +
                '}';
    }
}

