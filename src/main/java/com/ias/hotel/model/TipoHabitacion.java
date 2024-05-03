package com.ias.hotel.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class TipoHabitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	Integer tipoHabitacion;
	
	@Column
	String descripcion;
	
	@OneToMany(mappedBy = "tipo")
	List<Habitacion> lisHabitacion;
	
	
}
