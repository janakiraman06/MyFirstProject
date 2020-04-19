package com.example.demo1.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by Janak on 19-04-2020.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpView {
    private String status;
    private Employee data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }
}
