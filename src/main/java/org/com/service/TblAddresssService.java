package org.com.service;

import org.com.entity.TblAddress;

import java.util.List;

public interface TblAddresssService {
    /**
     * 添加收货地址
     * @param tblAddress
     * @return
     */
    public int add(TblAddress tblAddress);

    public int update(TblAddress tblAddress);

    public int delete(int addressId);

    public List<TblAddress> selectByshopperId(int shopperId);

    public TblAddress selectByaddressId(int addressId);
}
