package com.caspex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caspex.model.Cars;
import com.caspex.repository.CarRepository;
@Service
public class ServiceCar {
	
	@Autowired
	 public CarRepository carRepo;
	
	public  Iterable<Cars>listallcars(){
		return carRepo.findAll();
		
		
	}
	public Cars  getCars(int id) {
		
		return carRepo.getById(id);
		
	}
	public Cars postdata(Cars car) {
		return carRepo.save(car);
		
	}
	public Cars update(Cars car) {
		return carRepo.save(car);
	}
	public void deletecardata(Cars car)
	{
		carRepo.delete(car);
	}

}
