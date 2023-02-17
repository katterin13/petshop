package com.workshop.petshop.dataprovider.repository;

import java.util.List;

import org.hibernate.annotations.SqlFragmentAlias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.workshop.petshop.dataprovider.model.MInventary;
import com.workshop.petshop.dataprovider.model.MProduct;

@RepositoryRestResource(exported = false)
@Repository
public interface InventaryRepository extends CrudRepository<MInventary, String> {

    List<MInventary> findByProduct(MProduct product);

}

