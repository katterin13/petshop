package com.workshop.petshop.dataprovider.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Id;


import com.workshop.petshop.utils.Size;
import com.workshop.petshop.utils.Age;
import com.workshop.petshop.utils.Animal;
import com.workshop.petshop.utils.Category;

import java.util.Objects;

@Entity(name = "PRODUCT")
public class MProduct {
    
    @Id
    @Column(length = 4)
    private String id;

    @Column
    @Enumerated(EnumType.STRING)
    private Animal animal;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @Enumerated(EnumType.STRING)
    private Size size;

    @Column
    @Enumerated(EnumType.STRING)
    private Age age;
    
    @Column
    private String name;


    public MProduct() {
    }

    public MProduct(String id, Animal animal, Category category, Size size, Age age, String name) {
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

    public MProduct id(String id) {
        setId(id);
        return this;
    }

    public MProduct animal(Animal animal) {
        setAnimal(animal);
        return this;
    }

    public MProduct category(Category category) {
        setCategory(category);
        return this;
    }

    public MProduct size(Size size) {
        setSize(size);
        return this;
    }

    public MProduct age(Age age) {
        setAge(age);
        return this;
    }

    public MProduct name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MProduct)) {
            return false;
        }
        MProduct product = (MProduct) o;
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

}
