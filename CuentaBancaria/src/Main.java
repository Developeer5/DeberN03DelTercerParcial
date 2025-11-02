//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("001", 500, "Ana");
        CuentaBancaria c2 = new CuentaBancaria("002", 1000, "Luis");

        c1.depositar(200);
        c1.retirar(100);
        c2.depositar(300);
        c2.retirar(1500); // No se retira porque no hay suficiente saldo

        System.out.println("Saldo c1: $" + c1.getSaldo());
        System.out.println("Saldo c2: $" + c2.getSaldo());
    }
}