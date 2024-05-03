package com.ias.hotel.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ReservaHabitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	Date feEntrada;
	
	@Column
	Date feSalida;
	
	@Column
	Integer nmHuespedes;
	
	@Column
	Habitacion habitacion;
}
