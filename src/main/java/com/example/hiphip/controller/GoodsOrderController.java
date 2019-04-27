package com.example.hiphip.controller;

import com.example.hiphip.Entity.GoodOrder;
import com.example.hiphip.Service.GoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class GoodsOrderController {
    @Autowired
    private GoodOrderService goodOrderService;
    @GetMapping("orderinsert")
    public boolean orderinsert(GoodOrder goodOrder){
        return goodOrderService.orderinsert(goodOrder);
    }
    @GetMapping("orderIdget")
    public GoodOrder orderIdget(int id){
        return goodOrderService.orderIdget(id);
    }
    @GetMapping("orderouttradenoget")
    public GoodOrder orderouttradenoget(String outTradeNo){
        return goodOrderService.orderouttradenoget(outTradeNo);
    }
    @PostMapping("orderdelete")
    public boolean orderdelete(int id, int userId){
        return goodOrderService.orderdelete(id, userId);
    }
    @GetMapping("myorderget")
    public List<GoodOrder> myorderget(int userId){
        return goodOrderService.myorderget(userId);
    }
    @PostMapping("orderouttradenoupdate")
    public boolean orderouttradenoupdate(GoodOrder goodOrder){
        return goodOrderService.orderouttradenoupdate(goodOrder);
    }

}
