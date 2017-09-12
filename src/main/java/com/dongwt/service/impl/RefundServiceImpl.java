package com.dongwt.service.impl;

import com.dongwt.service.RefundService;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2017/7/23.
 */
@Service
public class RefundServiceImpl implements RefundService {
    @Override
    public void aliRefund(){
        System.out.println("aliRefund");
    }

    @Override
    public void weiXinRefund(){
        System.out.println("weiXinRefund");
    }

}
