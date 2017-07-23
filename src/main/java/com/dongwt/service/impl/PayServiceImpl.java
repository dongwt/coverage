package com.dongwt.service.impl;

import com.dongwt.service.PayService;

/**
 * Created by dongwt on 2017/7/23.
 */
public class PayServiceImpl implements PayService {

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

}
