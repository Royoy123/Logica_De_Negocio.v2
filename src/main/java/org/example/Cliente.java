package org.example;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }




    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método mod cliente
    public void modificarCliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método  elim cliente
    public void eliminarCliente() {
       //Esperar a la BBDD para poder hacer la logica de esta parte
    }

    // toString.
    @Override
    public String toString() {
        return nombre + " - " + direccion + " - " + telefono;
    }
}
