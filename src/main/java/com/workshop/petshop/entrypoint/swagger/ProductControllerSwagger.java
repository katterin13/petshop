package com.workshop.petshop.entrypoint.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.utils.Animal;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "ProductControllerSwagger")
public interface ProductControllerSwagger {


    /**
     * @param id
     * @return
     */
    @ApiOperation(
        value = "Get product by ID",
        tags = "ProductManager"
    )
    @ApiResponses(
        value = {
            @ApiResponse(code = 200, message = "Ok", response = Product.class),
            @ApiResponse(code = 404, message = "Not found", response = Product.class)
        }
    )
    ResponseEntity getById(@RequestParam(value = "id") String id);

    /**
     * @param id
     * @return
     */
    @ApiOperation(
        value = "Get list of product by type of animal",
        tags = "ProductManager"
    )
    @ApiResponses(
        value = {
            @ApiResponse(code = 200, message = "Ok", response = Product.class),
            @ApiResponse(code = 404, message = "Not found", response = Product.class)
        }
    )
    ResponseEntity getByAnimal(@RequestParam(value = "animal") Animal animal);
    
}
