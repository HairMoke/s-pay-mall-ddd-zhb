package com.hb.domain.order.service;

import com.alipay.api.AlipayApiException;
import com.hb.domain.order.model.entity.PayOrderEntity;
import com.hb.domain.order.model.entity.ShopCartEntity;

public interface IOrderService {

    PayOrderEntity createOrder(ShopCartEntity shopCartEntity) throws AlipayApiException;

}
