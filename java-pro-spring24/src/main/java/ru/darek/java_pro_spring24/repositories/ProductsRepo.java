package ru.darek.java_pro_spring24.repositories;

import ru.darek.java_pro_spring24.entities.Product;

import java.util.List;
import java.util.Optional;
// нужна тут аннотация??
public interface ProductsRepo {
    Optional<Product> findById(String id);
    List<Product> findAllProducts();
    Product createProduct(String title, Long price);
    Boolean deleteProductById(String id);
}
