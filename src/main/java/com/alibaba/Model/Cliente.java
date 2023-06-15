package com.crud_cliente.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {
    private String nombre;
    private String apellido;
    private String cuit;
    private String direccion;
    private String telefono;
    private boolean eliminado;

    public Cliente(String nombre, String apellido, String cuit, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.eliminado = false;
    }

    // Métodos de acceso

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCUIL: " + cuit +
                "\nTeléfono: " + telefono + "\nDirección: " + direccion + "\n";
    }

    // Método para actualizar los datos del cliente
    public void actualizarCliente(String nombre, String apellido, String cuit, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
