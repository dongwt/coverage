package com.dongwt.service.impl;

import com.dongwt.service.AliPayService;
import com.dongwt.service.PayService;
import com.dongwt.service.WeiXinPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2017/9/12.
 */
@Service
public class FastPayServiceImpl implements PayService{

    @Autowired
    private AliPayService aliPayService;
    @Autowired
    private WeiXinPayService weiXinPayService;

    @Override
    public void pay(boolean flag) {

    }

    @Override
    public void aliPay() {

    }

    @Override
    public void weiXinPay() {

    }

    @Override
    public void cmbPay() {

    }

    @Override
    public String mackPay() {
        String aliPayResult = aliPayService.pay(1);
        String weiXinPayResult = weiXinPayService.pay(2);
        return aliPayResult + weiXinPayResult;
    }
}
