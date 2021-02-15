package com.brainelixir.ecommerce.repository;

import com.brainelixir.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
