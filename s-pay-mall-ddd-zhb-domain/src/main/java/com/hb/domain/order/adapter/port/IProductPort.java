package com.hb.domain.order.adapter.port;

import com.hb.domain.order.model.entity.ProductEntity;

public interface IProductPort {
    ProductEntity queryProductByProductId(String productId);
}
