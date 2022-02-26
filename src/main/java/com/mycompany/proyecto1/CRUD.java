package com.mycompany.proyecto1;

import java.util.List;

public interface CRUD<T> {
    
    public List<T> listar();
    public T obtainID(int id);
    public void agregar(int id, String nombre);
    public void editar(int id, String nombre);
    public T eliminar(int id);
}