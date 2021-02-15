package com.brainelixir.ecommerce.repository;

import com.brainelixir.ecommerce.model.OrderProduct;
import com.brainelixir.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
