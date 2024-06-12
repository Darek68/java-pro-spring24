package ru.darek.java_pro_spring24.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
private String id;
private String title;
private Long price;

    public Product(String title, Long price) {
        this.title = title;
        this.price = price;
    }
}
