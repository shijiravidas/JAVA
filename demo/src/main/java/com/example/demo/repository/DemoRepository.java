package com.example.demo.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DemoModel;

public interface DemoRepository extends JpaRepository<DemoModel ,UUID> {
    
}
