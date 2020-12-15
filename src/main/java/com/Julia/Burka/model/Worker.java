package com.Julia.Burka.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="WORKER")
public class Worker
{
    @Id
    @Column(name="worker_id")
    private int WorkerId  ;
    @Column(name="w_name")
    private String WorkerName;
    @Column(name="w_company")
    private String WorkerCompany;
    @Column(name="w_position_")
    private String WorkerPosition;


    public Worker(int WorkerId, String WorkerName, String WorkerCompany, String WorkerPosition)
    {
        this.WorkerId=WorkerId;
        this.WorkerName=WorkerName;
        this.WorkerCompany=WorkerCompany;
        this.WorkerPosition=WorkerPosition;
    }
    public Worker() { }

    public int getWorkerId() {
        return WorkerId;
    }

    public void setWorkerId(int workerId) {
        WorkerId = workerId;
    }

    public String getWorkerName() {
        return WorkerName;
    }

    public void setWorkerName(String workerName) {
        WorkerName = workerName;
    }

    public String getWorkerCompany() {
        return WorkerCompany;
    }

    public void setWorkerCompany(String workerCompany) {
        WorkerCompany = workerCompany;
    }

    public String getWorkerPosition() {
        return WorkerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        WorkerPosition = workerPosition;
    }

    @Override
    public String toString()
    {
        return "Workers[Worker Id=" + WorkerId + ", Worker Name= " + WorkerName + "," +
                "Worker Position=" + WorkerPosition + ", Worker Company=" + WorkerCompany +"]";
    }
}
