package com.example.demo.Servicio;

import com.example.demo.Entidad.Persona;
import com.example.demo.interfaz.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioPersona {
    PersonaRepository repository;

    public ServicioPersona(PersonaRepository repository){
        this.repository = repository;
    }

    public ArrayList<Persona> listar(){
        return (ArrayList<Persona>) repository.findAll();
    }

    public String agregarPersona(Persona persona){
        repository.save(persona);
        return "Ingreso Exitoso";
    }

    public String eliminar(int id){
        String reporte = "Fallo UnU";
        if (repository.existsById(id)){
            repository.deleteById(id);
            reporte = "eliminacion Exitosa";
        }
        return reporte;
    }
}
