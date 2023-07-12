package com.jiumi.goods.mapper;

import java.util.List;
import com.jiumi.goods.domain.OmsGoodsType;

/**
 * 商品类型Mapper接口
 *
 * @author jiumi
 * @date 2021-11-19
 */
public interface OmsGoodsTypeMapper
{
    /**
     * 查询商品类型
     *
     * @param id 商品类型主键
     * @return 商品类型
     */
    public OmsGoodsType selectOmsGoodsTypeById(String id);

    /**
     * 查询商品类型列表
     *
     * @param omsGoodsType 商品类型
     * @return 商品类型集合
     */
    public List<OmsGoodsType> selectOmsGoodsTypeList(OmsGoodsType omsGoodsType);

    /**
     * 新增商品类型
     *
     * @param omsGoodsType 商品类型
     * @return 结果
     */
    public int insertOmsGoodsType(OmsGoodsType omsGoodsType);

    /**
     * 修改商品类型
     *
     * @param omsGoodsType 商品类型
     * @return 结果
     */
    public int updateOmsGoodsType(OmsGoodsType omsGoodsType);

    /**
     * 删除商品类型
     *
     * @param id 商品类型主键
     * @return 结果
     */
    public int deleteOmsGoodsTypeById(String id);

    /**
     * 批量删除商品类型
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOmsGoodsTypeByIds(String[] ids);
}
