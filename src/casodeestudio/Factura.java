/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio;

/**
 *
 * @author USUARIO
 */
public class Factura {
    
    private String nombreCliente;
    private String cedulaCliente;
    private int numero;
    private double monto;
    private int mes;
    private int anio;
    private int estado;

    public Factura() {
    }

    public Factura(String nombreCliente, String cedulaCliente, int numero, double monto, int mes, int anio, int estado) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numero = numero;
        this.monto = monto;
        this.mes = mes;
        this.anio = anio;
        this.estado = estado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
