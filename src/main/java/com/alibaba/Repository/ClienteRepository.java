package com.alibaba.Repository;

import com.alibaba.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private final List<Cliente> clientes;

    public ClienteRepository(){
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
}