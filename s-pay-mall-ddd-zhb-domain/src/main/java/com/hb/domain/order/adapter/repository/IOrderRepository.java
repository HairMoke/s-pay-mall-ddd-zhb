package com.hb.domain.order.adapter.repository;

import com.hb.domain.order.model.aggregate.CreateOrderAggregate;
import com.hb.domain.order.model.entity.OrderEntity;
import com.hb.domain.order.model.entity.ShopCartEntity;

public interface IOrderRepository {

    OrderEntity queryUnPayOrder(ShopCartEntity shopCartEntity);

    void doSaveOrder(CreateOrderAggregate orderAggregate);
}
