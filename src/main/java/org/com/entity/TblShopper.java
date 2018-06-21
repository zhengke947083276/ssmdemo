package org.com.entity;

public class TblShopper {
    private Integer shopperId;

    private String shopperTelnum;

    private String shopperPassword;

    private Boolean shopperSex;

    private Integer shopperAge;

    private String shopperJob;

    public Integer getShopperId() {
        return shopperId;
    }

    public void setShopperId(Integer shopperId) {
        this.shopperId = shopperId;
    }

    public String getShopperTelnum() {
        return shopperTelnum;
    }

    public void setShopperTelnum(String shopperTelnum) {
        this.shopperTelnum = shopperTelnum == null ? null : shopperTelnum.trim();
    }

    public String getShopperPassword() {
        return shopperPassword;
    }

    public void setShopperPassword(String shopperPassword) {
        this.shopperPassword = shopperPassword == null ? null : shopperPassword.trim();
    }

    public Boolean getShopperSex() {
        return shopperSex;
    }

    public void setShopperSex(Boolean shopperSex) {
        this.shopperSex = shopperSex;
    }

    public Integer getShopperAge() {
        return shopperAge;
    }

    public void setShopperAge(Integer shopperAge) {
        this.shopperAge = shopperAge;
    }

    public String getShopperJob() {
        return shopperJob;
    }

    public void setShopperJob(String shopperJob) {
        this.shopperJob = shopperJob == null ? null : shopperJob.trim();
    }
}