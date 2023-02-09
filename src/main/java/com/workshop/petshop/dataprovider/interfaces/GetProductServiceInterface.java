package com.workshop.petshop.dataprovider.interfaces;

import java.util.List;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.utils.Animal;

public interface GetProductServiceInterface {
    
    public Product getById(String id);
    public List<Product> getByAnimal(Animal animal);
}
