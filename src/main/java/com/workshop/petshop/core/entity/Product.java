package com.workshop.petshop.core.entity;

import com.workshop.petshop.dataprovider.model.MProduct;
import com.workshop.petshop.utils.Age;
import com.workshop.petshop.utils.Animal;
import com.workshop.petshop.utils.Category;
import com.workshop.petshop.utils.Size;

import java.util.Objects;

public class Product {
    
    private String id;
    private Animal animal;
    private Category category;
    private Size size;
    private Age age;
    private String name;


    public Product() {
    }

    public Product(String id, Animal animal, Category category, Size size, Age age, String name) {
        this.id = id;
        this.animal = animal;
        this.category = category;
        this.size = size;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Age getAge() {
        return this.age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product id(String id) {
        setId(id);
        return this;
    }

    public Product animal(Animal animal) {
        setAnimal(animal);
        return this;
    }

    public Product category(Category category) {
        setCategory(category);
        return this;
    }

    public Product size(Size size) {
        setSize(size);
        return this;
    }

    public Product age(Age age) {
        setAge(age);
        return this;
    }

    public Product name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(animal, product.animal) && Objects.equals(category, product.category) && Objects.equals(size, product.size) && Objects.equals(age, product.age) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, animal, category, size, age, name);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", animal='" + getAnimal() + "'" +
            ", category='" + getCategory() + "'" +
            ", size='" + getSize() + "'" +
            ", age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    public static Product convetMProductToProduct(MProduct model){
        return new Product()
        .age(model.getAge())
        .animal(model.getAnimal())
        .category(model.getCategory())
        .id(model.getId())
        .name(model.getName())
        .size(model.getSize());
    }

    public static MProduct convetProductToMProduct(Product entity){
        return new MProduct()
        .age(entity.getAge())
        .animal(entity.getAnimal())
        .category(entity.getCategory())
        .id(entity.getId())
        .name(entity.getName())
        .size(entity.getSize());
    }
}
