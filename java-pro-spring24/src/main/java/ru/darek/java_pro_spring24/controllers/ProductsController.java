package ru.darek.java_pro_spring24.controllers;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.darek.java_pro_spring24.dtos.CreateProductDto;
import ru.darek.java_pro_spring24.entities.Product;
import ru.darek.java_pro_spring24.services.ProductsService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
public class ProductsController {
    private final ProductsService productsService;
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class.getName());

    @GetMapping("/{id}")
    public Product getProductDetails(@PathVariable String id) {
        logger.info("Request details for product with id = {}", id);
        return productsService.getProductById(id);
    }
    @GetMapping
    public List<Product> getAllProducts() {
        logger.info("Request for all products");
        return productsService.getAllProducts();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createNewProduct(@RequestBody CreateProductDto createProductDto) {
        logger.info("Request for create product: {} -- {} - {}", createProductDto, createProductDto.getTitle(), createProductDto.getPrice());
        return productsService.createProduct(createProductDto.getTitle(), createProductDto.getPrice());
    }
    @DeleteMapping
    public Boolean deleteProductById(@RequestHeader String productId) {
        logger.info("Request delete for product with id = {}", productId);
        return productsService.deleteProductById(productId);
    }
}
