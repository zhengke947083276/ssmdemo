package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblOrder;
import org.com.entity.TblOrderExample;

public interface TblOrderMapper {
    long countByExample(TblOrderExample example);

    int deleteByExample(TblOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(TblOrder record);

    int insertSelective(TblOrder record);

    List<TblOrder> selectByExample(TblOrderExample example);

    TblOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByExample(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByPrimaryKeySelective(TblOrder record);

    int updateByPrimaryKey(TblOrder record);
}