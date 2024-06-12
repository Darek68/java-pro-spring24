package ru.darek.java_pro_spring24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProSpring24Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaProSpring24Application.class, args);
	}

}
/*
Создайте сервис, который хранит продукты (id, title, price)
Сервис должен быть разделен на стандартный набор слоев: контроллеры, сервисы,
репозитории (в данном задании репозитории в проекте не используют в качестве источника данных базу данных)
Хранение продуктов орагнизуйте через List в отдельном компоненте
Сервис должен давать возможность: запросить все продукты, запросить продукт по id, создавть новый продукт
 */
