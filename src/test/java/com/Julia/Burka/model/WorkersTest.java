package com.Julia.Burka.model;

import com.Julia.Burka.repository.WorkerRepository;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)

public class WorkersTest {
    @Mock
    private WorkerRepository Worker_Repository;

    @InjectMocks
    private Worker Worker;

    @Test
    public void getWorkerId()
    {
        Worker getWorkerId_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertNotEquals(getWorkerId_t.getWorkerId(),"1");
    }

    @Test
    public void setWorkerId()
    {
        Worker setWorkerId_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        setWorkerId_t.setWorkerId(2314);
        Assertions.assertNotEquals(setWorkerId_t.getWorkerId(),"2261","Test failed");
    }

    @Test
    public void getWorkerName()
    {
        Worker getWorkerName_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertNotEquals(getWorkerName_t.getWorkerName(),"");
    }

    @Test
    public void setWorkerName()
    {
        Worker setWorkerName_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        setWorkerName_t.setWorkerName("Князь Ігор Андрійович");
        Assertions.assertNotEquals(setWorkerName_t.getWorkerName(),"Князь Ігор","Test failed");
    }

    @Test
    public void getWorkerCompany()
    {
        Worker getWorkerCompany_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertNotEquals(getWorkerCompany_t.getWorkerCompany(),"");
    }

    @Test
    public void setWorkerCompany()
    {
        Worker setWorkerCompany_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        setWorkerCompany_t.setWorkerCompany("Matilda International");
        Assertions.assertNotEquals(setWorkerCompany_t.getWorkerCompany(),"");
    }
    @Test
    public void getWorkerPosition()
    {
        Worker getWorkerPosition_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        Assertions.assertNotEquals(getWorkerPosition_t.getWorkerPosition(),"Para-paradise","Test failed");
    }

    @Test
    public void setWorkerPosition()
    {
        Worker setWorkerPosition_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International",null);
        setWorkerPosition_t.setWorkerPosition("Кардіолог");
        Assertions.assertNotEquals(setWorkerPosition_t.getWorkerPosition(),"Терапевт","Test failed");
    }
    @Test
    public void to_String()
    {
        Worker toString_t = new Worker(2314,"Князь Ігор Андрійович","Matilda International","Кардіолог");
        toString_t.setWorkerCompany("Matilda International");
        Assert.assertNotNull(toString_t.toString());
    }

}