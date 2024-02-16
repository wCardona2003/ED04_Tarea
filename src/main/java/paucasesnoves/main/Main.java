package paucasesnoves.main;

import paucasesnoves.main.ccuenta.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 695f); // Utiliza 695f en lugar de 695 para representar un float
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) { // Corregido a float
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual); // Agrega un espacio después de "es"

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}