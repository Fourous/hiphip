package com.example.hiphip.Service;

import com.example.hiphip.Entity.GoodOrder;
import com.example.hiphip.Entity.User;
import com.example.hiphip.mapper.GoodOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodOrderServicempl implements GoodOrderService {
    @Autowired
    private GoodOrderMapper goodOrderMapper;
    @Override
    public boolean orderinsert(GoodOrder goodOrder) {
        if(goodOrderMapper.orderinsert(goodOrder)>0)
            return true;
        else
            return false;
    }

    @Override
    public GoodOrder orderIdget(int id) {
        return goodOrderMapper.orderIdget(id);
    }

    @Override
    public GoodOrder orderouttradenoget(String outTradeNo) {
        return goodOrderMapper.orderouttradenoget(outTradeNo);
    }

    @Override
    public boolean orderdelete(int id, int userId) {
        if(goodOrderMapper.orderdelete(id, userId)>0)
            return true;
        else
            return false;
    }

    @Override
    public List<GoodOrder> myorderget(int userId) {
        return goodOrderMapper.myorderget(userId);
    }

    @Override
    public boolean orderouttradenoupdate(GoodOrder goodOrder) {
        if(goodOrderMapper.orderouttradenoupdate(goodOrder)>0)
            return true;
        else
            return false;
    }
}
