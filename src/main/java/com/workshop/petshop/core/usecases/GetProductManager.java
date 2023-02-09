package com.workshop.petshop.core.usecases;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.core.interfaces.GetProductManagerInterface;
import com.workshop.petshop.dataprovider.interfaces.GetProductServiceInterface;
import com.workshop.petshop.utils.Animal;

@Service
public class GetProductManager implements GetProductManagerInterface {
    
    @Autowired
    private GetProductServiceInterface getProductService;
    
    public Product getById(String id) throws Exception {
        if (Objects.isNull(id) || id.length() != 4 ) throw new Exception ("");
        return this.getProductService.getById(id);
    }
    
    public List<Product> getByAnimal(Animal animal){
        return this.getProductService.getByAnimal(animal);
    }

}
