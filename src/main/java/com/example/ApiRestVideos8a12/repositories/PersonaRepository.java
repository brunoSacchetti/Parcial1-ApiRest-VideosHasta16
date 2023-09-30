package com.utn.EjApiRestVideo8a12.repositories;

import com.utn.EjApiRestVideo8a12.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

}