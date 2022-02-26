package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements CRUD {
    
    List<Empleado> lista = new ArrayList<>();

    public EmpleadoDAO() {
        Empleado empleado1 = new Empleado();
        empleado1.setId_empleado(1);
        empleado1.setNombre("Alejandro Torres");
        lista.add(empleado1);
        
        Empleado empleado2 = new Empleado();
        empleado2.setId_empleado(2);
        empleado2.setNombre("Fernando Torres");
        lista.add(empleado2);
        
        Empleado empleado3 = new Empleado();
        empleado3.setId_empleado(3);
        empleado3.setNombre("María Nuñez");
        lista.add(empleado3);
    }
    
    @Override
    public List<Empleado> listar(){
        return lista;
    }

    @Override
    public Object obtainID(int id) {
        return lista.get(id).getNombre();
    }

    @Override
    public void agregar(int id, String nombre) {
        Empleado newEmpleado = new Empleado();
        newEmpleado.setId_empleado(id);
        newEmpleado.setNombre(nombre);
        lista.add(newEmpleado);
    }

    @Override
    public void editar(int id, String nombre) {
        lista.get(id).setNombre(nombre);
    }

    @Override
    public Object eliminar(int id) {
        return lista.remove(id);
    }
}