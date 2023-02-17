package com.workshop.petshop.core.usecases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import com.workshop.petshop.dataprovider.usecases.UpdateInventaryService;

@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@ContextConfiguration(classes = {UpdateInventaryManager.class})
public class UpdateInventaryManagerTests {

    @Mock
    private UpdateInventaryService updateInventaryService = new UpdateInventaryService();

    @InjectMocks
    private UpdateInventaryManager updateInventaryManager = new UpdateInventaryManager();

    @Test
    void test(){
        assertTrue(true);
    }
    
}
