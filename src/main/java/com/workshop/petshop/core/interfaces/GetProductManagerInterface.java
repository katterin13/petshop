package com.workshop.petshop.core.interfaces;

import java.util.List;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.utils.Animal;

public interface GetProductManagerInterface {
    
    public Product getById(String id) throws Exception;
    public List<Product> getByAnimal(Animal animal);
}
