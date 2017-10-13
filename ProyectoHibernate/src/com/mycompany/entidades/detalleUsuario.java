
package com.mycompany.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="userdatails")
@Entity
public class detalleUsuario {
    /*Forma 1*/                 /*Forma 2*/    
    @Id                         private int id;
    @Column(name="name")        private String nombre;
    @Column(name="lastname")    private String apellido;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
