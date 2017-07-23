package com.dongwt.service;

/**
 * Created by dongwt on 2017/7/22.
 */
public interface PayService {

    void pay(boolean flag);

    void aliPay();

    void weiXinPay();

    void cmbPay();
}
