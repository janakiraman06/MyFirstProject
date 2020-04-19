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
@RequestMapping(path="/vegies")
public class VegController {
    @Autowired
    VegManager vegManager;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addVegetables(@RequestBody Vegetables veg){
        vegManager.addVegetables(veg);
    }

    @RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Iterable<Vegetables> showVegetables(){
        return vegManager.showVegetables();
    }

    //@RequestMapping(path= "/updatePrice", method = RequestMethod.PUT, consumes = MediaType.ALL_VALUE, produces =MediaType.ALL_VALUE)
    @RequestMapping(path= "/code", method = RequestMethod.PUT)
    public @ResponseBody String updatePrice(@PathVariable(name="a") int code, @PathVariable(name="b") float price){
        String s= vegManager.updatePrice(code,price);
        return(s);
    }
}
