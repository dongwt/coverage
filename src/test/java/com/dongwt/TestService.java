package com.dongwt;

import com.dongwt.service.PayService;
import com.dongwt.service.RefundService;
import com.dongwt.service.impl.PayServiceImpl;
import com.dongwt.service.impl.RefundServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dongwt on 2017/7/21.
 */
public class TestService extends BaseTest{

    @Autowired
    PayService payService ;
    @Autowired
    RefundService refundService ;

    @Test
    public void testPay(){
        payService.pay(true);
        payService.pay(false);
    }

    @Test
    public void testAliPay(){
        payService.aliPay();
    }

    @Test
    public void testWeiXinPay(){
        payService.weiXinPay();
    }

    @Test
    public void testCmbPay(){
        payService.cmbPay();
    }


    @Test
    public void testAliRefund(){
        refundService.aliRefund();
    }

    @Test
    public void testWeiXinRefund(){
        refundService.weiXinRefund();
    }
}
