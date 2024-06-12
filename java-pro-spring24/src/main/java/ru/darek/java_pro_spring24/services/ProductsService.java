package ru.darek.java_pro_spring24.services;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.darek.java_pro_spring24.entities.Product;
import ru.darek.java_pro_spring24.repositories.ProductsRepo;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductsService {
    private static final Logger logger = LoggerFactory.getLogger(ProductsService.class.getName());
    private final ProductsRepo productsRepo;

    public Product getProductById(String id) {
        logger.info("Request product details by id = {}", id);
        return productsRepo.findById(id).get();
    }
    public List<Product> getAllProducts(){
        return productsRepo.findAllProducts();
    }
    public Product createProduct(String title,Long price){
        return productsRepo.createProduct(title,price);
    }
    public Boolean deleteProductById(String id){
        return productsRepo.deleteProductById(id);
    }
}
