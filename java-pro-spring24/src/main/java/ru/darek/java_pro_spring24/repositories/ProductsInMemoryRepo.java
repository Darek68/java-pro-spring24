package ru.darek.java_pro_spring24.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.darek.java_pro_spring24.entities.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class ProductsInMemoryRepo implements ProductsRepo {
    private List<Product> products;

    @PostConstruct
    public void initProducts() {
        products = new ArrayList<>();
        products.add(new Product("1", "milk", 70L));
        products.add(new Product("2", "kofe", 200L));
        products.add(new Product("3", "beer", 110L));
    }

    @Override
    public Optional<Product> findById(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    @Override
    public List<Product> findAllProducts() {
        return products;
    }
    @Override
    public Product createProduct(String title, Long price) {
        String id = String.valueOf(products.stream().mapToLong(p -> Long.parseLong(p.getId())).max().orElse(0L) + 1);
        Product product = new Product(id, title, price);
        products.add(product);
        return product;
    }
    @Override
    public Boolean deleteProductById(String id) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId().equals(id)) {
                productIterator.remove();
            }
        }
        return true;
    }
}
