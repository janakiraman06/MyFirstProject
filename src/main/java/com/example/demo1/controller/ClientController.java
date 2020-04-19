package com.example.demo1.controller;

import com.example.demo1.Model.EmpDataStatus;
import com.example.demo1.Model.EmpView;
import com.example.demo1.Model.Employee;
import com.example.demo1.manager.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * Created by Janak on 18-04-2020.
 */
@RestController
@RequestMapping(path="/consume")
public class ClientController {
    @Autowired
    ClientManager clientManager;
    @RequestMapping( method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String showStudents(){
        return clientManager.displayStudents();
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Employee> showStudentsinList(){
        return clientManager.displayStudentsinList();
    }
    @RequestMapping(path ="/view/{a}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmpView displayEmployee(@PathVariable(name = "a") int emp_id){
        return clientManager.displayEmployee(emp_id);
    }
    @RequestMapping(path ="/delete/{a}", method = RequestMethod.DELETE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String deleteEmployee(@PathVariable(name = "a") int emp_id){
        return null;
    }
    @RequestMapping(path = "update/{a}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public EmpDataStatus updateEmployee(@PathVariable(name = "a") int emp_id){
        return null;
    }
}
