package com.github.vetordev.jspringboot.model.repositories;

import com.github.vetordev.jspringboot.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
