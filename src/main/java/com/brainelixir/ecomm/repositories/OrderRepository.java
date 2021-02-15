package com.brainelixir.ecomm.repositories;


import com.brainelixir.ecomm.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}
