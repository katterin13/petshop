package com.workshop.petshop.dataprovider.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.petshop.dataprovider.interfaces.UpdateInventaryServiceInterface;
import com.workshop.petshop.dataprovider.repository.InventaryRepository;

@Service
public class UpdateInventaryService implements UpdateInventaryServiceInterface{
    
    @Autowired
    private InventaryRepository inventaryRepository;

    
}
