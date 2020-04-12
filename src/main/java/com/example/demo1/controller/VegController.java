package com.example.demo1.controller;

import com.example.demo1.entity.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.demo1.manager.VegManager;

/**
 * Created by Janak on 11-04-2020.
 */
@RestController
public class VegController {
    @Autowired
    VegManager vegManager;

    @RequestMapping(path="/InsertVegies", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addVegetables(@RequestBody Vegetables veg){
        vegManager.addVegetables(veg);
    }

    @RequestMapping(path="/DisplayVegies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Iterable<Vegetables> showVegetables(){
        return vegManager.showVegetables();
    }
}
