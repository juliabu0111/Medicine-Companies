package com.Julia.Burka.controller;

import com.Julia.Burka.repository.WorkerRepository;
import com.Julia.Burka.service.Workers_Service;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class WorkersControllerTest {

    @Mock
    private WorkerRepository workers_repository;
    @Mock
    private Workers_Service workers_service;
    @InjectMocks
    private WorkerController WorkerController;

    @Test
    public void getWorker()
    {
        WorkerController getWorker_t = new WorkerController();
        Assertions.assertNotNull(getWorker_t);
    }

    @Test
    public void createWorker()
    {
        WorkerController createWorker_t = new WorkerController();
        Assertions.assertNotNull(createWorker_t);

    }

    @Test
    public void updateWorker()
    {
        WorkerController updateWorker_t = new WorkerController();
        Assertions.assertNotNull(updateWorker_t);
    }

    @Test
    public void deleteUser()
    {
        WorkerController deleteWorker_t = new WorkerController();
        Assertions.assertNotNull(deleteWorker_t);
    }
}
