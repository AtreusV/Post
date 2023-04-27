package com.example.demo.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "Personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nombres",length = 50)
    private String nombre;

    @Column(name = "Apellido", length = 50)
    private  String apellido;

    @Column(nullable = false, unique = true, length = 50)
    private String correo;

    @Column(nullable = false, unique = true, length = 10)
    private int telefono;

    public Persona(Integer id, String nombre, String apellido, String correo, int telefono) {
        this.id = null;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona() {
    }

    //getter
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    //setter

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
