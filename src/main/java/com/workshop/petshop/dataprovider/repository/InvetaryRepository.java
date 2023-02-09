package com.workshop.petshop.dataprovider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.workshop.petshop.dataprovider.model.MInventary;

@RepositoryRestResource(exported = false)
@Repository
public interface InvetaryRepository extends CrudRepository<MInventary, String> {

}

