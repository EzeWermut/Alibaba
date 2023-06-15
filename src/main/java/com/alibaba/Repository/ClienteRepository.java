package com.crud_cliente.Repository;
import com.crud_cliente.Model.Cliente;

import java.util.ArrayList;
import java.util.List;
public class ClienteRepository {
    private List<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}
