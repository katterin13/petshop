package com.workshop.petshop.core.usecases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import com.workshop.petshop.core.entity.Product;
import com.workshop.petshop.dataprovider.usecases.GetProductService;

@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@ContextConfiguration(classes = {GetProductManager.class})
class GetProductManagerTests {

    @Mock
    private GetProductService getProductService = new GetProductService();

    @InjectMocks
    private GetProductManager getProductManager = new GetProductManager();

    @Test
    void should_return_a_product_with_id_well_characters(){
        Mockito.when(getProductService.getById(any(String.class)))
        .thenReturn(new Product());
        assertDoesNotThrow(() -> getProductManager.getById("01AS"));
    }

    @Test
    void should_return_error_with_id_error_characters(){
        assertThrows(Exception.class, () -> {getProductManager.getById("01");});
        assertThrows(Exception.class, () -> {getProductManager.getById("");});
        assertThrows(Exception.class, () -> {getProductManager.getById(null);});
    }
}
