package com.workshop.petshop.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.http.MediaType;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.core.usecases.GetProductManager;
import com.workshop.petshop.entrypoint.controler.ProductController;
import com.workshop.petshop.utils.Age;
import com.workshop.petshop.utils.Animal;
import com.workshop.petshop.utils.Category;
import com.workshop.petshop.utils.Size;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.BDDMockito.given;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProductController.class})
@WebMvcTest
public class ProductControllerTests {
    
    @Autowired
    MockMvc mockMvc;

    @MockBean
    GetProductManager getProductManager;

    final String baseUrl = "/v1/product/";
    
    @Test
    void should_return_a_product_by_id() throws Exception{

        String url = baseUrl + "/id/";
        String id = "1004";
        Product product = new Product( id, Animal.CAT,Category.FOOD,Size.MEDIUM,Age.ADULT,"Churu Snack Tuna Whit Scallop Paquete x 10 Unds");
        given(getProductManager.getById(anyString())).willReturn(product);

        RequestBuilder request = get(url)
            .contentType(MediaType.APPLICATION_JSON)
            .param("id",id);

        mockMvc.perform(request)
            .andExpect(status().isOk())
            .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            .andExpectAll(
                    jsonPath("$.id").value(id),
                    jsonPath("$.animal").value("CAT")
            );
    }

    @Test
    void should_return_method_not_allowed_filter_product_by_id() throws Exception{

        String url = baseUrl + "/id/";
 
        RequestBuilder request = post(url)
            .contentType(MediaType.APPLICATION_JSON)
            .param("id","1004");

        mockMvc.perform(request)
            .andExpect(status().isMethodNotAllowed());        
    }


    @Test
    void should_return_list_product_by_animal() throws Exception{

        String url = baseUrl + "/animal/";
        List<Product> list = new ArrayList<Product>();
        Product product = new Product( "1004", Animal.CAT,Category.FOOD,Size.MEDIUM,Age.ADULT,"Churu Snack Tuna Whit Scallop Paquete x 10 Unds");
        list.add(product);
        given(getProductManager.getByAnimal(any())).willReturn(list);

        RequestBuilder request = get(url)
            .contentType(MediaType.APPLICATION_JSON)
            .param("animal","CAT");

        mockMvc.perform(request)
            .andExpect(status().isOk())
            .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.length()").value(1));
    }

}