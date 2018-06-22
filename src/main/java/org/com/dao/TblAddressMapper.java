package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblAddress;
import org.com.entity.TblAddressExample;

public interface TblAddressMapper {
    long countByExample(TblAddressExample example);

    int deleteByExample(TblAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(TblAddress record);

    int insertSelective(TblAddress record);

    List<TblAddress> selectByExample(TblAddressExample example);

    TblAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") TblAddress record, @Param("example") TblAddressExample example);

    int updateByExample(@Param("record") TblAddress record, @Param("example") TblAddressExample example);

    int updateByPrimaryKeySelective(TblAddress record);

    int updateByPrimaryKey(TblAddress record);
}