//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Principe", "Antoine de Saint-Exupéry", 10.5, 20);
        Libro libro2 = new Libro("100 Años de Soledad", "Gabriel García Márquez", 15.0, 15);

        libro1.setPrecio(12.0);
        libro2.setPrecio(-5.0); // No se actualiza

        libro1.vender(5);
        libro2.vender(20); // No se vende, stock insuficiente

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
