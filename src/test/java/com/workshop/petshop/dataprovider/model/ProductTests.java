package com.workshop.petshop.dataprovider.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.workshop.petshop.utils.Size;
import com.workshop.petshop.utils.Age;
import com.workshop.petshop.utils.Animal;
import com.workshop.petshop.utils.Category;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ContextConfiguration(classes = {MProduct.class})
public class ProductTests {
    
    @Test
	void should_RetTrue_When_Two_Products_Are_Equals() {

        String name = "Chunky Perros Adultos Pollo 25 Kg";
        MProduct product1 = new MProduct();
        product1.setAnimal(Animal.DOG);
        product1.setCategory(Category.FOOD);
        product1.setAge(Age.PUPPY);
        product1.setSize(Size.SMALL);
        product1.setId("1234");
        product1.setName(name);

        MProduct product2 = new MProduct("1234", Animal.DOG, Category.FOOD, Size.SMALL, Age.PUPPY,name);

        assertTrue(product1.equals(product2)); 
	}

    @Test
	void should_RetFalse_When_Two_Products_Not_Are_Equals() {

        String name = "Chunky Perros Adultos Pollo 25 Kg";
        MProduct product1 = new MProduct();
        product1.setAnimal(Animal.CAT);
        product1.setCategory(Category.FOOD);
        product1.setAge(Age.PUPPY);
        product1.setSize(Size.BIG);
        product1.setId("1234");
        product1.setName(name);

        MProduct product2 = new MProduct("1234", Animal.DOG, Category.FOOD, Size.SMALL, Age.PUPPY,name);

        assertFalse(product1.equals(product2)); 
	}
}