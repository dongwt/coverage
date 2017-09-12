package com.dongwt.service.impl;

import com.dongwt.service.AliPayService;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2017/9/12.
 */
@Service
public class AliPayServiceImpl implements AliPayService {
    @Override
    public String pay(Integer id) {
        return "aliPay";
    }
}
