package com.devspring.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devspring.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
