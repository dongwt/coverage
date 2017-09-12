package com.dongwt.service.impl;

import com.dongwt.service.WeiXinPayService;
import org.springframework.stereotype.Service;

/**
 * Created by dongwt on 2017/9/12.
 */
@Service
public class WeiXinPayServiceImpl implements WeiXinPayService {
    @Override
    public String pay(Integer id) {
        return "weiXin";
    }
}
