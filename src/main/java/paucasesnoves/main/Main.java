/**
 * Clase principal que contiene el método main para probar la funcionalidad de la clase CCuenta.
 */
package paucasesnoves.main;

import paucasesnoves.main.ccuenta.CCuenta;

public class Main {

    /**
     * Método principal que instancia una cuenta, realiza operaciones sobre ella y muestra el saldo resultante.
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        // Se crea una instancia de la clase CCuenta con los datos de un titular, número de cuenta, saldo y tipo de interés inicializados.
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Se llama al método operativa_cuenta para realizar operaciones sobre la cuenta.
        // Se utiliza 695f en lugar de 695 para representar un float.
        operativa_cuenta(cuenta1, 695f);
    }

    /**
     * Método que realiza operaciones sobre una cuenta dada e imprime el saldo resultante.
     * @param cuenta1 Objeto de tipo CCuenta sobre el cual se realizarán las operaciones.
     * @param cantidad Cantidad de dinero a ingresar en la cuenta.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) { // Corregido a float
        // Se obtiene el saldo actual de la cuenta.
        double saldoActual = cuenta1.estado();
        // Se imprime el saldo actual.
        System.out.println("El saldo actual es " + saldoActual); // Agrega un espacio después de "es"

        // Se intenta retirar una cantidad de dinero de la cuenta.
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            // Se imprime un mensaje en caso de que falle la operación de retiro.
            System.out.print("Fallo al retirar");
        }

        // Se intenta ingresar una cantidad de dinero en la cuenta.
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            // Se imprime un mensaje en caso de que falle la operación de ingreso.
            System.out.print("Fallo al ingresar");
        }
    }
}