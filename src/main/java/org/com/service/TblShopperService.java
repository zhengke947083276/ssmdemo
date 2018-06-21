package org.com.service;

import org.com.entity.TblShopper;

public interface TblShopperService {
    /**
     * 注册
     * @return
     */
    public int resign(TblShopper shopper);

    /**
     * 登录
     * @param shopperTelnum
     * @param shopperPassword
     * @return
     */
    public TblShopper select(String shopperTelnum, String shopperPassword);
    /**
     * 修改个人信息
     */
    public int update(TblShopper shopper);
}
