package com.example.demo1.manager;


import com.example.demo1.Model.EmpDataStatus;
import com.example.demo1.Model.EmpView;
import com.example.demo1.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by Janak on 18-04-2020.
 */

@Service
public class ClientManager {
    //@Autowired
    //EmpDataStatus empDataStatus;
    @Autowired
    RestTemplate restTemplate;
    public String displayStudents(){

    final String uri = "http://dummy.restapiexample.com/api/v1/employees";


    String result = restTemplate.getForObject(uri, String.class);
    return result;
}
public ArrayList<Employee> displayStudentsinList(){
    final String uri = "http://dummy.restapiexample.com/api/v1/employees";
    //ArrayList<Employee> employeeArrayList= new ArrayList<Employee>();


    //Employee emp = restTemplate.getForO;
    ResponseEntity<EmpDataStatus> responseEntity = restTemplate.getForEntity(uri, EmpDataStatus.class);
    EmpDataStatus empDataStatus = responseEntity.getBody();
    //employeeArrayList=empDataStatus.getData();
    return empDataStatus.getData();

}
    public EmpView displayEmployee(int emp_id){
        final String uri = "http://dummy.restapiexample.com/api/v1/employee/"+emp_id;

        ResponseEntity<EmpView> responseEntity = restTemplate.getForEntity(uri, EmpView.class);
        EmpView empView = new EmpView();
               empView =  responseEntity.getBody();
        return empView;
    }

    public String deleteEmployee(int emp_id){
        return null;
    }

    public EmpDataStatus updateEmployee(int emp_id){
        return null;
    }
}
