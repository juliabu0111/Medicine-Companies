package com.Julia.Burka.repository;

import com.Julia.Burka.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer>
{
//    List <Worker> findAll();
//    List <Worker> findWorkerById();
//    List <Worker> createWorker();
//    List <Worker> validateCreateWorker();
//    List <Worker> updateWorker();
//    List <Worker> deleteWorker();
}
