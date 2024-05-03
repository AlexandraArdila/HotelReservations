package com.ias.hotel.service;

import java.util.List;

import com.ias.hotel.model.Habitacion;

public interface IHabitacionService {

	public Habitacion agregarHabitacion(Habitacion habitacion);
	public void eliminarHabitacion(Long idHabitacion);
	public Long reservarHabitacion(Long idHabitacion);
	public List<Habitacion> listarTodasHabitaciones();
	public List<Habitacion> listarHabitacionesByDisponible();
}
