package com.recruitmentbe.service;


import com.recruitmentbe.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobService{
    public List<Job> getAllJob();
    public List<Job> findJob(String body);
    public Job findJobById(String body);
    public List<Job> findJobRelate(String body);
    public Job addJobStringBody(String body);
    public List<Job> findJobByIdCompany(String body);
    public void deleteJob(String body);
}
