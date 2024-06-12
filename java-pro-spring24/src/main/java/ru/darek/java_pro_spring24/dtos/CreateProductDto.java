package ru.darek.java_pro_spring24.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateProductDto {
    private String title;
    private Long price;
}
