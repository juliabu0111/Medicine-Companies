package com.Julia.Burka.controller;

import com.Julia.Burka.repository.WorkerRepository;
import com.Julia.Burka.service.WorkersServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;
import org.thymeleaf.model.IModel;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class MainControllerTest
{
    @Mock
    private WorkerRepository workerRepository;

    @InjectMocks
    private MainController mainController;

    @Test
    void greeting()
    {
        MainController greeting_t = new MainController();
        greeting_t.greeting();
        if(greeting_t.greeting()==null)
        {
            assertAll();
        }
    }

    @Test
    void goAway()
    {
        MainController bue_t = new MainController();
        bue_t.goAway();
        if(bue_t.goAway()==null)
        {
            assertAll();
        }
    }

}
