package com.workshop.petshop.entrypoint.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.petshop.entrypoint.swagger.InventaryControllerSwagger;


@RestController
@RequestMapping("/v1/inventary")
public class InventaryController implements InventaryControllerSwagger {
    
    

}
