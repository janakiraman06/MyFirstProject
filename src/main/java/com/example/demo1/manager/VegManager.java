package com.example.demo1.manager;

import com.example.demo1.entity.Vegetables;
import com.example.demo1.repository.VegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo1.repository.VegRepository;

/**
 * Created by Janak on 11-04-2020.
 */
@Service
public class VegManager {
    //insert data
    @Autowired
    private VegRepository vegRepository;
    public void addVegetables(Vegetables veg){
    vegRepository.save(veg);
    }
    public Iterable<Vegetables> showVegetables(){
      return vegRepository.findAll();
    }
}
