package com.crud_cliente.Controller;

import com.crud_cliente.Model.Cliente;
import com.crud_cliente.Service.ClienteService;

import java.util.List;
import java.util.Scanner;

public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("== Menú ==");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Ver clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> agregarCliente();
                case 2 -> verClientes();
                case 3 -> eliminarCliente();
                case 4 -> actualizarCliente();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    public void agregarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Agregar cliente ==");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("CUIT: ");
        String cuit = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, cuit, direccion, telefono);
        clienteService.agregarCliente(cliente);
        System.out.println("Cliente agregado con éxito.");
        System.out.println();
    }

    public void verClientes() {
        List<Cliente> clientes = clienteService.obtenerClientes();

        System.out.println("== Clientes registrados ==");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Apellido: " + cliente.getApellido());
                System.out.println("CUIT: " + cliente.getCuit());
                System.out.println("Dirección: " + cliente.getDireccion());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Eliminado: " + cliente.isEliminado());
                System.out.println("-----------------------------");
            }
        }
        System.out.println();
    }

    public void eliminarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Eliminar cliente ==");
        System.out.print("Ingrese el CUIT del cliente a eliminar: ");
        String cuit = scanner.nextLine();

        List<Cliente> clientes = clienteService.obtenerClientes();
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getCuit().equals(cuit)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            clienteService.eliminarCliente(clienteEncontrado);
            System.out.println("Cliente eliminado con éxito.");
        } else {
            System.out.println("No se encontró un cliente con el CUIT proporcionado.");
        }
        System.out.println();
    }

    public void actualizarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Actualizar cliente ==");
        System.out.print("Ingrese el CUIT del cliente a actualizar: ");
        String cuit = scanner.nextLine();

        List<Cliente> clientes = clienteService.obtenerClientes();
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getCuit().equals(cuit)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.print("Nombre (actual: " + clienteEncontrado.getNombre() + "): ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido (actual: " + clienteEncontrado.getApellido() + "): ");
            String apellido = scanner.nextLine();
            System.out.print("CUIT (actual: " + clienteEncontrado.getCuit() + "): ");
            String nuevoCuit = scanner.nextLine();
            System.out.print("Dirección (actual: " + clienteEncontrado.getDireccion() + "): ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono (actual: " + clienteEncontrado.getTelefono() + "): ");
            String telefono = scanner.nextLine();

            clienteService.actualizarCliente(clienteEncontrado, nombre, apellido, nuevoCuit, direccion, telefono);
            System.out.println("Cliente actualizado con éxito.");
        } else {
            System.out.println("No se encontró un cliente con el CUIT proporcionado.");
        }
        System.out.println();
    }
}