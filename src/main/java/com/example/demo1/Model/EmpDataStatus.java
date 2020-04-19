package com.example.demo1.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Janak on 18-04-2020.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpDataStatus implements Serializable {
    private String status;
    private ArrayList <Employee> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Employee> getData() {
        return data;
    }

    public void setData(ArrayList<Employee> data) {
        this.data = data;
    }
}
