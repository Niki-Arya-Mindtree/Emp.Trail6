package com.example.demo.Control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmpModel;
import com.example.demo.Repository.Repository;

@Service
public class EmpControl {
	
	@Autowired
	private Repository repo;
	
	public List<EmpModel> getListDat(){
		List<EmpModel> listEmp = new ArrayList<>();
		repo.findAll().forEach(listEmp::add);
		return listEmp;
	}
	
	public EmpModel getOneData(int Id) {
		return repo.findById(Id).get();
	}
	
	public void saveData(EmpModel oneDaa) {
		repo.save(oneDaa);
	}
}
