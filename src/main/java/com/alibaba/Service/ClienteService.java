package com.crud_cliente.Service;

import com.crud_cliente.Model.Cliente;
import com.crud_cliente.Repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void agregarCliente(Cliente cliente) {
        clienteRepository.agregarCliente(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clienteRepository.obtenerClientes();
    }

    public void eliminarCliente(Cliente cliente) {
        cliente.setEliminado(true);
    }

    public void actualizarCliente(Cliente cliente, String nombre, String apellido, String cuit, String direccion, String telefono) {
        cliente.actualizarCliente(nombre, apellido, cuit, direccion, telefono);
    }
}
