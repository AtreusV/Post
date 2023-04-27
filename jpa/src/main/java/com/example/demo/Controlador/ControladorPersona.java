package com.example.demo.Controlador;

import com.example.demo.Entidad.Persona;
import com.example.demo.Servicio.ServicioPersona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ControladorPersona {
    ServicioPersona servicio;

    public ControladorPersona(ServicioPersona servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/agregarPersona")
    public String agregarPersona(@RequestBody Persona persona){
        return servicio.agregarPersona(persona);
    }

    @GetMapping("/listarPersonas")
    public ArrayList<Persona> listarPersonas(){
        return servicio.listar();
    }

    @PostMapping("/eliminarPersona/{Id}")
    public String eliminarPersona(@PathVariable("Id") int id){
        return servicio.eliminar(id);
    }

}
