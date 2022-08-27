package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Control.EmpControl;
import com.example.demo.Model.EmpModel;

@RestController
public class EmpService {
	
	@Autowired
	private EmpControl empCont;
	
	@GetMapping("/user")
	public List<EmpModel> ListDat(){
		return empCont.getListDat();
	}
	
	@GetMapping("/user/{Id}")
	public EmpModel OneData(@PathVariable int Id) {
		return empCont.getOneData(Id);
	}
	
	@PostMapping("/user")
	public void getSaveData(@RequestBody EmpModel oneDaa) {
		empCont.saveData(oneDaa);
	}
	//New
}
