package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.covidRepo;

@Service
public class covidService {
     @Autowired
    covidRepo reps;

    public User add1(User use) {
        return reps.save(use);
    }

    public void deleteId(Integer id) {
        reps.deleteById(id);

    }

    public List<User> getAll() {
        return reps.findAll();
    }

    public User getById(Integer id) {
        return reps.findById(id).orElse(null);
    }
    
}
