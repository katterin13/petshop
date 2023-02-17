package com.workshop.petshop.core.usecases;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.petshop.core.entity.Inventary;
import com.workshop.petshop.core.interfaces.UpdateInventaryManagerInterface;
import com.workshop.petshop.dataprovider.interfaces.UpdateInventaryServiceInterface;

@Service
public class UpdateInventaryManager implements UpdateInventaryManagerInterface {
    
    @Autowired
    private UpdateInventaryServiceInterface inventaryService;
    
    
}
