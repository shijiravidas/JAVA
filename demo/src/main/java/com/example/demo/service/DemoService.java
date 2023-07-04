package com.example.demo.service;
import org.springframework.stereotype.Service;
import  com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DemoService {
    private final DemoRepository dmorepo;

    public void saveDemo(DemoModel dm){
        dmorepo.save(dm);
    }
}
