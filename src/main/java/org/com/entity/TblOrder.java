package org.com.entity;

import java.util.Date;

public class TblOrder {
    private Integer orderId;

    private Integer shopperId;


    private Integer goodsId;
    private TblGoods tblGoods;

    public TblGoods getTblGoods() {
        return tblGoods;
    }

    public void setTblGoods(TblGoods tblGoods) {
        this.tblGoods = tblGoods;
    }

    private Integer orderState;

    private Integer goodsNumber;

    private Date orderTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getShopperId() {
        return shopperId;
    }

    public void setShopperId(Integer shopperId) {
        this.shopperId = shopperId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "TblOrder{" +
                "orderId=" + orderId +
                ", shopperId=" + shopperId +
                ", goodsId=" + goodsId +
                ", orderState=" + orderState +
                ", goodsNumber=" + goodsNumber +
                ", orderTime=" + orderTime +
                '}';
    }
}