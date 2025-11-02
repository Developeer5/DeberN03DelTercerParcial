public class CuentaBancaria {

    private final String numeroCuenta; // Solo lectura
    private double saldo;
    private String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    // Métodos públicos
    public void depositar(double monto) {
        if (validarMonto(monto)) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (validarMonto(monto) && saldo >= monto) {
            saldo -= monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Método
    private boolean validarMonto(double monto) {
        return monto > 0;
    }


}