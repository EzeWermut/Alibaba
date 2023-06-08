package com.alibaba.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String cuit;
    private String telefono;

    public Cliente(String nombre, String apellido, String cuit, String correo, String direccion, String telefono) {
    }
}
