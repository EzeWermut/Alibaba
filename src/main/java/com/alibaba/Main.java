package com.alibaba;

import com.crud_cliente.Controller.ClienteController;
import com.crud_cliente.Repository.ClienteRepository;
import com.crud_cliente.Service.ClienteService;


public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteService clienteService = new ClienteService(clienteRepository);
        ClienteController clienteController = new ClienteController(clienteService);

        clienteController.mostrarMenu();
  //hoka
    }
}