package org.com.entity;

public class TblShops {
    private Integer shopsId;

    private String shopsTelnum;

    private String shopsPassword;

    public Integer getShopsId() {
        return shopsId;
    }

    public void setShopsId(Integer shopsId) {
        this.shopsId = shopsId;
    }

    public String getShopsTelnum() {
        return shopsTelnum;
    }

    public void setShopsTelnum(String shopsTelnum) {
        this.shopsTelnum = shopsTelnum == null ? null : shopsTelnum.trim();
    }

    public String getShopsPassword() {
        return shopsPassword;
    }

    public void setShopsPassword(String shopsPassword) {
        this.shopsPassword = shopsPassword == null ? null : shopsPassword.trim();
    }
}