package com.caspex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caspex.model.Cars;

public interface CarRepository extends JpaRepository<Cars,Integer>{


}
