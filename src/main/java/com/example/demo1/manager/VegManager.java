package com.example.demo1.manager;

import com.example.demo1.entity.Vegetables;
import com.example.demo1.repository.VegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    //@Modifying
    //@Query(value = "")
    public String updatePrice(Integer code, float price){
        if(vegRepository.findById(code).isPresent()){
            Vegetables existingVeg = vegRepository.findById(code).get();
            existingVeg.setPrice(price);
            vegRepository.save(existingVeg);
            return("price updated");
        }
        else{
            return("Entered Veg_code doesn't exist. Enter the existing code to change the price");
        }

    }
}
