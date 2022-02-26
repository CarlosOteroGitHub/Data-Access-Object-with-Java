package com.mycompany.proyecto1;

public class NewClass {
    
    public static void main(String[] args){
        CRUD<Empleado> empleado = new EmpleadoDAO();
        
        //PROCEDIMIENTO LISTAR EMPLEADOS.
        System.out.println("Lista de Empleados: ");
        empleado.listar().forEach((listar) -> {
            System.out.println(listar.getId_empleado()+ " - " + listar.getNombre());
        });
        
        //PROCEDIMIENTO OBTENER INFORMACIÓN DE UN EMPLEADO POR ID.
        System.out.println("\n" + "Información de un Empleado: ");
        System.out.println(empleado.obtainID(1));
        
        //PROCEDIMIENTO AGREGAR UN EMPLEADO.
        System.out.println("\n" + "Agregar un Empleado: ");
        empleado.agregar(4, "Mario Peréz");
        empleado.listar().forEach((listar) -> {
            System.out.println(listar.getId_empleado()+ " - " + listar.getNombre());
        });
        
        //PROCEDIMIENTO ACTUALIZAR UN EMPLEADO.
        System.out.println("\n" + "Editar un Empleado: ");
        empleado.editar(1, "Mariana Hera");
        empleado.listar().forEach((listar) -> {
            System.out.println(listar.getId_empleado()+ " - " + listar.getNombre());
        });
        
        //PROCEDIMIENTO ELIMINAR UN EMPLEADO.
        System.out.println("\n" + "Eliminar un Empleado: ");
        empleado.eliminar(0);
        empleado.listar().forEach((listar) -> {
            System.out.println(listar.getId_empleado()+ " - " + listar.getNombre());
        });
    }
}