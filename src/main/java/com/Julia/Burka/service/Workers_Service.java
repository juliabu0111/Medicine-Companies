package com.Julia.Burka.service;

import com.Julia.Burka.model.Worker;

import java.util.List;

public interface Workers_Service
{
    List<Worker> findAll();
    Worker findWorkerById(int worker_id);
    Worker createWorker(Worker worker);
    Worker updateWorker(Worker worker);
    void deleteWorker(int worker_id);
}
