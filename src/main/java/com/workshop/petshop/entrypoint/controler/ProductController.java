package com.workshop.petshop.entrypoint.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.workshop.petshop.core.entity.ApiError;
import com.workshop.petshop.core.interfaces.GetProductManagerInterface;
import com.workshop.petshop.entrypoint.swagger.ProductControllerSwagger;
import com.workshop.petshop.utils.Animal;
import com.workshop.petshop.utils.ErrorType;

@RestController
@RequestMapping("/v1/product")
public class ProductController implements ProductControllerSwagger{
    
    @Autowired
    private GetProductManagerInterface getProductManager;
    
    private Gson gson = new GsonBuilder().setDateFormat("dd-MMM-yyyy HH:mm:ss").create();
    

    @GetMapping("/id/")
    public ResponseEntity getById(@RequestParam(value = "id") String id){
        try {
            return ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body(this.gson.toJson(this.getProductManager.getById(id)));    
        } catch (Exception e) {
            System.out.print(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .contentType(MediaType.APPLICATION_JSON)
            .body(this.gson.toJson(new ApiError(ErrorType.INVALID_FIELD_ERROR, "Invalid format id")));
        }
        
    } 

    @GetMapping("/animal/")
    public ResponseEntity getByAnimal(@RequestParam(value = "animal") Animal animal){
        try {
            return ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body(this.gson.toJson(this.getProductManager.getByAnimal(animal)));    
        } catch (Exception e) {
            System.out.print(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .contentType(MediaType.APPLICATION_JSON)
            .body(this.gson.toJson(new ApiError(ErrorType.INVALID_FIELD_ERROR, "Invalid format id")));
        }
        
    } 

}
