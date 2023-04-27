package com.example.demo.interfaz;

import com.example.demo.Entidad.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Integer> {

}
