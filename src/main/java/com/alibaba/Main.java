package com.alibaba;
import com.alibaba.Model.Cliente;
import com.alibaba.Repository.ClienteRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese CUIT: ");
        String cuit = scanner.nextLine();

        System.out.println("Ingrese correo: ");
        String correo = scanner.nextLine();

        System.out.println("Ingrese dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese telefono: ");
        String telefono = scanner.nextLine();

        // Crea una instancia de Cliente con los datos ingresados
        Cliente nuevoCliente = new Cliente(nombre, apellido, cuit, correo, direccion, telefono);

        // Crea una instancia de ClienteRepository y agregar el nuevo cliente
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.agregarCliente(nuevoCliente);

        System.out.println("El nuevo cliente ha sido agregado exitosamente.");
    }
}