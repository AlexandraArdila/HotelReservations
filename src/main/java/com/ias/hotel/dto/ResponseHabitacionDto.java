package com.ias.hotel.dto;

import java.util.List;

import com.ias.hotel.model.Habitacion;

public class ResponseHabitacionDto {

	List<Habitacion> listHabitaciones;
	String status;
	String message;
	public List<Habitacion> getListHabitaciones() {
		return listHabitaciones;
	}
	public void setListHabitaciones(List<Habitacion> listHabitaciones) {
		this.listHabitaciones = listHabitaciones;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
	
}
