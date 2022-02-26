package com.mycompany.proyecto1;

public class Empleado {
    
    private int id_empleado;
    private String nombre;
    
    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }
}