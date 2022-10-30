package com.caspex.controller;

import java.util.NoSuchElementException;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caspex.model.Cars;
import com.caspex.service.ServiceCar;

@RestController
public class CarContoller {
	@Autowired
	public ServiceCar service;
	
	@GetMapping("/getAll")
	public Iterable <Cars> carslist()
	{
		return service.listallcars();
	}
	@GetMapping("/set{id}")
	public ResponseEntity<Cars> get(@PathVariable int id){
		try
		{
			Cars obj=service.getCars(id);
			return new ResponseEntity<Cars>(obj,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Cars>(HttpStatus.N);
		}
		
	}
	@PostMapping  ("/inset")
	public  void add(@RequestBody Cars Car)
	
	{
		service.postdata(Car);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Cars> update(@PathVariable int id ,@RequestBody Cars car ){
		try {
			Cars obj=service.update(id);
			car.setId(id);
			service.update(car);
			return new ResponseEntity<>(car,HttpStatus.SC_OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.SC_NOT_FOUND);
			
		}
		
	}
	
		
		
	
	

}
