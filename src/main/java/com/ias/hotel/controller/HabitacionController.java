package com.ias.hotel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.hotel.dto.ResponseHabitacionDto;
import com.ias.hotel.service.IHabitacionService;

@RestController
@RequestMapping("/api/hotel")
public class HabitacionController {
	
	private IHabitacionService habitacionService;
	@GetMapping("listarTodasHabitaciones")
	public ResponseEntity<ResponseHabitacionDto> listarTodasHabitaciones(){
		ResponseHabitacionDto response = new ResponseHabitacionDto();
		response.setListHabitaciones(habitacionService.listarTodasHabitaciones());
		response.setStatus(HttpStatus.OK.toString());
		return new ResponseEntity<ResponseHabitacionDto>(response, HttpStatus.OK);
	}

}
