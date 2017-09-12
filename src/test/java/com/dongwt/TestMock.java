package com.dongwt;

import com.dongwt.service.AliPayService;
import com.dongwt.service.PayService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.annotation.Resource;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by dongwt on 2017/7/24.
 */
public class TestMock extends BaseTest{

    @Mock
    private AliPayService aliPayService;

    @InjectMocks
    @Resource(name="payServiceImpl")
    private PayService payService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);//初使化Mock
    }


    @Test
    public void mackPay(){

        when(aliPayService.pay(any(Integer.class))).thenReturn("aliPayForMack");

        String response =  payService.mackPay();
        System.out.println(response);
    }

}
