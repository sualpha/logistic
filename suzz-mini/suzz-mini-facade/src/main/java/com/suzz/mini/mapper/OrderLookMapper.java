package com.suzz.mini.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suzz.mini.domain.OrderLook;

/**
 * @author subo
 * @date 2022/7/31 10:54
 **/
public interface OrderLookMapper extends BaseMapper<OrderLook> {

    OrderLook queryLock(OrderLook orderLook);
}
