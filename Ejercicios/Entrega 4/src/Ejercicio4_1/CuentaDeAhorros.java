/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4_1;

/**
 *
 * @author USUARIO
 */
public class CuentaDeAhorros extends Cuenta {
    
    private boolean activa;

    public CuentaDeAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000;
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000;
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " +
        comisionMensual);
        System.out.println("Número de transacciones = " +
        (numConsignaciones + numRetiros));
        System.out.println();
      }
    
}