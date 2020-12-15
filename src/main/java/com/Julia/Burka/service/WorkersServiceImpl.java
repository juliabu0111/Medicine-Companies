package com.Julia.Burka.service;

import com.Julia.Burka.model.Worker;
import com.Julia.Burka.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkersServiceImpl implements Workers_Service
{
    @Autowired
    private WorkerRepository worker_repository;

    @Override
    public List<Worker> findAll()
    {
        return worker_repository.findAll();
    }

    @Override
    public Worker findWorkerById(int worker_id)
    {
        return worker_repository.findById(worker_id).orElse(null);
    }

    @Override
    public Worker createWorker(Worker worker)
    {

        if (worker.getWorkerName() == null) {
            throw new IllegalArgumentException("Worker name not entered");
        }

        if (worker.getWorkerCompany() == null) {
            throw new IllegalArgumentException("Company worker not entered");
        }

        if (worker.getWorkerPosition() == null) {
            throw new IllegalArgumentException("Worker position not entered");
        }

        worker.setWorkerId(000);
        if (worker.getWorkerId()!=000)
        {
            throw new IllegalArgumentException("Worker id not entered");
        }


        List<Worker> all = worker_repository.findAll();
        if(all.isEmpty())
        {
            throw new RuntimeException("Worker id not entered");
        }
        worker_repository.save(worker);
        return worker;
    }

    @Override
    public Worker updateWorker(Worker worker)
    {
        worker_repository.save(worker);
        return worker;
    }
    @Override
    public void deleteWorker(int worker_id)
    {
        worker_repository.deleteById(worker_id);
    }

}