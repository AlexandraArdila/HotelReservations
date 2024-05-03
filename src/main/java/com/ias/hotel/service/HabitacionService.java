package com.ias.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ias.hotel.model.Habitacion;
import com.ias.hotel.repository.IHabitacionRepository;

@Service
public class HabitacionService implements IHabitacionService {

	private IHabitacionRepository habitacionRepository;
	@Override
	public Habitacion agregarHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
		return habitacionRepository.save(habitacion);
	}

	@Override
	public void eliminarHabitacion(Long idHabitacion) {
		// TODO Auto-generated method stub
		habitacionRepository.deleteById(idHabitacion);
	}

	@Override
	public Long reservarHabitacion(Long idHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> listarTodasHabitaciones() {
		// TODO Auto-generated method stub
		
		List<Habitacion> listHabitacionModel = new ArrayList<Habitacion>();
		
		listHabitacionModel = habitacionRepository.findAll();
		
		
		return listHabitacionModel;
				
	}

	@Override
	public List<Habitacion> listarHabitacionesByDisponible() {
		// TODO Auto-generated method stub
		return null;
	}

}
