package com.example.hiphip.Service;

import com.example.hiphip.Entity.GoodOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GoodOrderService {
    /**
     * 保存订单，返回包含主键
     */
    boolean orderinsert(GoodOrder goodOrder);

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
    public boolean orderdelete (@Param("id") int id, @Param("userId") int userId);

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
    public boolean orderouttradenoupdate(GoodOrder goodOrder);
}
