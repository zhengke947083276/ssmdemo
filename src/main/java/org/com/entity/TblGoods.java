package org.com.entity;

public class TblGoods {
    private Integer goodsId;

    private String goodsName;

    private Integer goodsNumber;

    private Double goodsPrice;

    private Integer goodstypeId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodstypeId() {
        return goodstypeId;
    }

    public void setGoodstypeId(Integer goodstypeId) {
        this.goodstypeId = goodstypeId;
    }
}