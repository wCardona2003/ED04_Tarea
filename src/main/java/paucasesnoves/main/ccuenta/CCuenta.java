package paucasesnoves.main.ccuenta;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {
    // Atributos de la clase CCuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor parametrizado de la clase CCuenta.
     * @param nombre Nombre del titular de la cuenta.
     * @param cuenta Número de cuenta.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoInteres Tipo de interés de la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        setNombre(nombre);
        setCuenta(cuenta);
        setSaldo(saldo);
        setTipoInteres(tipoInteres);
    }

    /**
     * Método que devuelve el estado actual de la cuenta (saldo).
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad de dinero en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    // Métodos de acceso para los atributos de la clase CCuenta

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}