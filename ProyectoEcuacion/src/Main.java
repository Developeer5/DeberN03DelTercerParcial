import Operaciones.Ecuacion;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Ejercicios de aplicación!"));

    Ecuacion ecuacion = new Ecuacion(1,4,4);
    ecuacion.CalcularX1();
    ecuacion.CalcularX2();


    ecuacion.setA(1);
    ecuacion.setA(2);
    ecuacion.setA(1);
    ecuacion.CalcularX1();

    if(ecuacion.isEcuacionCorrecta())
    {
        System.out.printf("\nEl valor de x1 es %f", ecuacion.CalcularX1());
        System.out.printf("\nEl valor de x2 es %f", ecuacion.CalcularX2());
    }
    else {
        IO.println(ecuacion.getMensajeError());
    }

    Ecuacion ec1 = new Ecuacion(0,1,1);
    Ecuacion ec2 = new Ecuacion(10, 2, 4);





}