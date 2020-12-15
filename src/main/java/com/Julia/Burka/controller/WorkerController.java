package com.Julia.Burka.controller;

import com.Julia.Burka.model.Worker;

import com.Julia.Burka.service.WorkersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/worker")
public class WorkerController
{
    @Autowired
    private WorkersServiceImpl workers_Service_Impl;

    @GetMapping
    public List<Worker> getAll()
    {
        return workers_Service_Impl.findAll();
    }
    @GetMapping("/{WorkerId}")
    public List<Worker> getWorker(@PathVariable int WorkerId)
    {
        return (List<Worker>) workers_Service_Impl.findWorkerById(WorkerId);
    }
    @PostMapping
    public Worker createWorker(@RequestBody Worker worker)
    {
        return workers_Service_Impl.createWorker(worker);
    }
    @PutMapping(value = "/{WorkerId}")
    public Worker updateWorker(@RequestBody Worker worker)
    {
        return workers_Service_Impl.updateWorker(worker);
    }
    @DeleteMapping(value = "/{WorkerId}")
    public ResponseEntity deleteWorker(@PathVariable int worker_id)
    {
        workers_Service_Impl.deleteWorker(worker_id);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }
}