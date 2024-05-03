package com.ias.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ias.hotel.model.Habitacion;

@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion, Long>{

}
