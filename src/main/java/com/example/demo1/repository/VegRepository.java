package com.example.demo1.repository;

import com.example.demo1.entity.Vegetables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Janak on 11-04-2020.
 */

@Repository
public interface VegRepository extends CrudRepository<Vegetables,Integer>{

}
