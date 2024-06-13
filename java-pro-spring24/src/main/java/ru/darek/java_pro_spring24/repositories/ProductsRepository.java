package ru.darek.java_pro_spring24.repositories;

import org.springframework.stereotype.Repository;
import ru.darek.java_pro_spring24.entities.Product;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductsRepository {
    Optional<Product> findById(String id);
    List<Product> findAllProducts();
    Product createProduct(String title, Long price);
    Boolean deleteProductById(String id);
}
