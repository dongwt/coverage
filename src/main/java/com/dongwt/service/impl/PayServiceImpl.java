package com.dongwt.service.impl;

import com.dongwt.service.AliPayService;
import com.dongwt.service.PayService;
import com.dongwt.service.WeiXinPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2017/7/23.
 */
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private AliPayService aliPayService;
    @Autowired
    private WeiXinPayService weiXinPayService;


    @Override
    public void pay(boolean flag){
        if(flag){
            aliPay();
        }else{
            weiXinPay();
        }
    }

    @Override
    public void aliPay(){
        System.out.println("aliPay");
    }


    @Override
    public void weiXinPay(){
        System.out.println("weiXinPay");
    }

    @Override
    public void cmbPay() {
//        int a = 1/0;
        System.out.println("weiXinPay");
    }

    @Override
    public String mackPay() {
        String aliPayResult = aliPayService.pay(1);
        String weiXinPayResult = weiXinPayService.pay(2);
        return aliPayResult + weiXinPayResult;
    }


}
