package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.EmpModel;


public interface Repository extends CrudRepository<EmpModel,Integer>{

}
