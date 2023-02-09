package com.workshop.petshop.dataprovider.usecases;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.dataprovider.interfaces.GetProductServiceInterface;
import com.workshop.petshop.dataprovider.model.MProduct;
import com.workshop.petshop.dataprovider.repository.ProductRepository;
import com.workshop.petshop.utils.Animal;

@Service
public class GetProductService implements GetProductServiceInterface {
    
    @Autowired
    private ProductRepository productRepository;

    public Product getById(String id) {
        MProduct mproduct = this.productRepository.findById(id).get(); 
        return Product.convetMProductToProduct(mproduct);   
    }

    public List<Product> getByAnimal(Animal animal) {
        List<Product> list = new ArrayList<Product>();
        this.productRepository.findByAnimal(animal)
        .forEach(model -> {
                list.add(Product.convetMProductToProduct(model));
        });
        return list;
    }

}
