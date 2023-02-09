package com.workshop.petshop.dataprovider.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.workshop.petshop.dataprovider.model.MProduct;
import com.workshop.petshop.utils.Animal;

@RepositoryRestResource(exported = false)
@Repository
public interface ProductRepository extends CrudRepository<MProduct, String> {

    List<MProduct> findByAnimal(Animal animal);
}
