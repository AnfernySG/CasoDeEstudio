/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CasoDeEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de facturas a ingresar : ");
        int cantidadDeFacturas = scanner.nextInt();

        
        for (int i = 0; i < cantidadDeFacturas; i++) {
            System.out.print("Ingrese el nombre del cliente : ");
            String nombreCliente = scanner.next();
            System.out.print("Ingrese la cédula del cliente : ");
            String cedulaCliente = scanner.next();
            System.out.print("Ingrese el número de la factura : ");
            int numero = scanner.nextInt();
            System.out.print("Ingrese el monto de la factura : ");
            double monto = scanner.nextDouble();
            System.out.print("Ingrese el mes de la factura : ");
            int mes = scanner.nextInt();
            System.out.print("Ingrese el año de la factura : ");
            int anio = scanner.nextInt();
            System.out.print("Ingrese el estado de la factura : ");
            int estado = scanner.nextInt();
            
            Factura facturaAux = new Factura(nombreCliente, cedulaCliente, numero, monto, mes, anio, estado);
            
        }
    }
}
