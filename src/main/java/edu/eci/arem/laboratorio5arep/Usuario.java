/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arem.laboratorio5arep;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 2115253
 */
@Entity
class Usuario {
    @Id
    private String nombre;
    private String fecha;

    public Usuario(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
