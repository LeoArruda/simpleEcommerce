package com.brainelixir.ecommerce.repository;

import com.brainelixir.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
