package com.Julia.Burka.service;

import com.Julia.Burka.repository.WorkerRepository;
import com.Julia.Burka.model.Worker;
import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WorkersServiceImplTest
{

    @Mock
    private WorkerRepository workerRepository;

    @InjectMocks
    private WorkersServiceImpl workers_Service_Impl;

    @Test
    public void test()
    {
        when(workerRepository.findAll()).thenReturn(List.of(new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог")));
        List<Worker> all = workers_Service_Impl.findAll();
        Assertions.assertThat(all.size()).isEqualTo(1);
    }
    @Test
    public void findAll()
    {
        WorkersServiceImpl findAll_t = new WorkersServiceImpl();
        Worker worker1 = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertThat(worker1);
        Worker worker2 = new Worker(1261,"Юрченко Марія Петрівна","Providence BioMed","Хірург");
        Assertions.assertThat(worker2);
    }

    @Test
    public void findWorkerById()
    {
        WorkersServiceImpl findWorkerById_t = new WorkersServiceImpl();
    }
    @Test
    public void shouldThrowCreateWorkerName()
    {
        Worker shouldThrowCreateWorkerName = new Worker(2314,null,"Matilda International","Кардіолог");
        Assertions.assertThatThrownBy(()-> workers_Service_Impl.createWorker(shouldThrowCreateWorkerName)).
                hasMessage("Worker name not entered");

    }
    @Test
    public void shouldThrowCreateWorkerCompany()
    {
        Worker shouldThrowCreateWorkerCompany = new Worker(2314,"Князь Ігор Андрійович",null,"Кардіолог");
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorker(shouldThrowCreateWorkerCompany)).
                hasMessage("Company worker not entered");
    }

    @Test
    public void shouldThrowCreateWorkerPosition()
    {
        Worker shouldThrowCreateWorkerPosition = new Worker(2314,"Князь Ігор Андрійович","Matilda International",null);
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorker(shouldThrowCreateWorkerPosition)).
                hasMessage("Worker position not entered");
    }
    @Test
    public  void shouldThrowCreateWorkers_Id()
    {
        Worker shouldThrowCreateWorkerId = new Worker (000,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorker(shouldThrowCreateWorkerId)).
                hasMessage("Worker id not entered");
    }
    @Test
    public void createWorker()
    {
        Worker worker = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> workers_Service_Impl.createWorker(worker)).hasNoCause();
    }
    @Test
    public void updateWorker()
    {
        WorkersServiceImpl updateWorker_t = new WorkersServiceImpl();

    }
    @Test
    public void deleteWorker()
    {
        WorkersServiceImpl deleteWorker_t = new WorkersServiceImpl();
    }

}