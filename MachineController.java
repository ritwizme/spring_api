package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Mansi
@RestController
@RequestMapping("/machines")
@CrossOrigin(origins = "http://localhost:4200")
public class MachineController {
	MachineRepository machineRepository;
	public MachineController(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

@GetMapping("/all")
public List<Machines> getAll(){
	List<Machines> machines = this.machineRepository.findAll();
	return machines;
}
}
