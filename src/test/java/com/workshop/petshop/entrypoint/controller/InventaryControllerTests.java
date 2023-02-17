package com.workshop.petshop.entrypoint.controller;

import com.workshop.petshop.entrypoint.controler.InventaryController;
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
import com.workshop.petshop.core.usecases.UpdateInventaryManager;
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
public class InventaryControllerTests {


    @Autowired
    MockMvc mockMvc;

    @MockBean
    UpdateInventaryManager getInventaryManager;

    final String baseUrl = "/v1/inventary/";
    
    @Test
    void should_return_a_invetary_by_product_id() throws Exception{

        
    }

    
}
