package com.example.hiphip.mapper;

import com.example.hiphip.Entity.GoodOrder;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单dao层
 */
public interface GoodOrderMapper {
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    /**
     * 保存订单，返回包含主键
     */
    int orderinsert(GoodOrder goodOrder);

    /**
     * 根据主键查找订单
     * @param id
     * @return
     */
    GoodOrder orderIdget(int id);

    /**
     * 根据交易订单号查找订单
     * @param outTradeNo
     * @return
     */
    GoodOrder orderouttradenoget(String outTradeNo);

    /**
     * 逻辑删除订单
     * @param id
     * @param userId
     * @return
     */
    int orderdelete (@Param("id") int id,@Param("userId") int userId);

    /**
     * 查找我的全部订单
     * @param userId
     * @return
     */
    List<GoodOrder> myorderget (int userId);

    /**
     * 根据流水号更新订单
     * @param goodOrder
     * @return
     */
    int orderouttradenoupdate(GoodOrder goodOrder);
}
