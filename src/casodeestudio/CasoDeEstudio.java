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

        Factura factura1 = null;
        Factura factura2 = null;
        Factura factura3 = null;
        Factura factura4 = null;
        Factura factura5 = null;
        Factura factura6 = null;
        Factura factura7 = null;
        Factura factura8 = null;
        Factura factura9 = null;
        Factura factura10 = null;
        
        for (int i = 1; i <= cantidadDeFacturas; i++) {
            System.out.println("");
            System.out.println("Ingrese la factura " + i);
            
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
            
            if (i == 1) {
                factura1 = facturaAux;
            } else if (i == 2) {
                factura2 = facturaAux;
            } else if (i == 3) {
                factura3 = facturaAux;
            } else if (i == 4) {
                factura4 = facturaAux;
            } else if (i == 5) {
                factura5 = facturaAux;
            } else if (i == 6) {
                factura6 = facturaAux;
            } else if (i == 7) {
                factura7 = facturaAux;
            } else if (i == 8) {
                factura8 = facturaAux;
            } else if (i == 9) {
                factura9 = facturaAux;
            } else if (i == 10) {
                factura10 = facturaAux;
            }
        }
        
        double interes = 0.05;
        int cantidadDeMeses = 6;
        
        double montoACobrar = 0;
        
        for (int i = 1; i <= cantidadDeFacturas; i++) {

            if (i == 1 && factura1.getEstado() == 2) {
                montoACobrar = montoACobrar + factura1.getMonto();
            } else if (i == 2 && factura2.getEstado() == 2) {
                montoACobrar = montoACobrar + factura2.getMonto();
            } else if (i == 3 && factura3.getEstado() == 2) {
                montoACobrar = montoACobrar + factura3.getMonto();
            } else if (i == 4 && factura4.getEstado() == 2) {
                montoACobrar = montoACobrar + factura4.getMonto();
            } else if (i == 5 && factura5.getEstado() == 2) {
                montoACobrar = montoACobrar + factura5.getMonto();
            } else if (i == 6 && factura6.getEstado() == 2) {
                montoACobrar = montoACobrar + factura6.getMonto();
            } else if (i == 7 && factura7.getEstado() == 2) {
                montoACobrar = montoACobrar + factura7.getMonto();
            } else if (i == 8 && factura8.getEstado() == 2) {
                montoACobrar = montoACobrar + factura8.getMonto();
            } else if (i == 9 && factura9.getEstado() == 2) {
                montoACobrar = montoACobrar + factura9.getMonto();
            } else if (i == 10 && factura10.getEstado() == 2) {
                montoACobrar = montoACobrar + factura10.getMonto();
            }
        }
        
        double cuotaMesual = ((montoACobrar*interes)+montoACobrar)/cantidadDeMeses;
        
        System.out.println("");
        System.out.println("Información de pagos");
        
        for (int i = 1; i <= cantidadDeMeses; i++) {
            if (i == 1) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Julio 2023");
            } else if (i == 2) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Agosto 2023");
            } else if (i == 3) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Setiembre 2023");
            } else if (i == 4) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Octubre 2023");
            } else if (i == 5) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Noviembre 2023");
            } else if (i == 6) {
                System.out.println("Cuota " + i + " " +  cuotaMesual + " Fecha de pago Diciembre 2023");
            }
        }
        
        double montoPagado = 0;
        
        for (int i = 1; i <= cantidadDeFacturas; i++) {

            if (i == 1 && factura1.getEstado() == 1) {
                montoPagado = montoPagado + factura1.getMonto();
            } else if (i == 2 && factura2.getEstado() == 1) {
                montoPagado = montoPagado + factura2.getMonto();
            } else if (i == 3 && factura3.getEstado() == 1) {
                montoPagado = montoPagado + factura3.getMonto();
            } else if (i == 4 && factura4.getEstado() == 1) {
                montoPagado = montoPagado + factura4.getMonto();
            } else if (i == 5 && factura5.getEstado() == 1) {
                montoPagado = montoPagado + factura5.getMonto();
            } else if (i == 6 && factura6.getEstado() == 1) {
                montoPagado = montoPagado + factura6.getMonto();
            } else if (i == 7 && factura7.getEstado() == 1) {
                montoPagado = montoPagado + factura7.getMonto();
            } else if (i == 8 && factura8.getEstado() == 1) {
                montoPagado = montoPagado + factura8.getMonto();
            } else if (i == 9 && factura9.getEstado() == 1) {
                montoPagado = montoPagado + factura9.getMonto();
            } else if (i == 10 && factura10.getEstado() == 1) {
                montoPagado = montoPagado + factura10.getMonto();
            }
        }
        
        System.out.println("");
        System.out.println("El monto total pagado por facturas es de : " + montoPagado);
        
    } 
       }
    
    
    
    
