package org.com.service.impl;

import org.com.dao.TblGoodsMapper;
import org.com.entity.TblGoods;
import org.com.entity.TblGoodsExample;
import org.com.service.TblGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblGoodsServiceImpl implements TblGoodsService {
    //注入
    @Autowired
    TblGoodsMapper tblGoodsMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<TblGoods> selectAll() {
        return tblGoodsMapper.selectByExample(null);
    }

    /**
     * 根据前台传来的商品名模糊查询
     * @param goodsName
     * @return
     */
    @Override
    public List<TblGoods> selectByName(String goodsName) {
        TblGoodsExample tblGoodsExample = new TblGoodsExample();
        TblGoodsExample.Criteria criteria = tblGoodsExample.createCriteria();
        criteria.andGoodsNameLike("%"+goodsName+"%");
        return tblGoodsMapper.selectByExample(tblGoodsExample);
    }

    /**
     * 通过前台选择的商品类型查询出所有商品
     * @param goodstypeId
     * @return
     */
    @Override
    public List<TblGoods> selectByType(int goodstypeId) {
        TblGoodsExample tblGoodsExample = new TblGoodsExample();
        TblGoodsExample.Criteria criteria = tblGoodsExample.createCriteria();
        criteria.andGoodstypeIdEqualTo(goodstypeId);
        return tblGoodsMapper.selectByExample(tblGoodsExample);
    }
}
