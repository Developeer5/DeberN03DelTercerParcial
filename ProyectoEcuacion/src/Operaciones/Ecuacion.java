package Operaciones;

public class Ecuacion {
    private int A;
    private int B;
    private int C;
    private boolean ecuacionCorrecta;
    private String mensajeError;
    //constructores
    public Ecuacion(){
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.ecuacionCorrecta = false;
        this.mensajeError = "";

    }

    public Ecuacion(int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.ecuacionCorrecta = false;
        this.mensajeError = "";
    }

    //Agregue los meotodos de solo lectura para: ecuacionCOrrecta y mensajeError

    public boolean isEcuacionCorrecta() {
        return ecuacionCorrecta;
    }

    public String getMensajeError() {
        return mensajeError;
    }


    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    private double Discriminante(){
        return ((B * B) - (4 * A * C));
    }

    public double CalcularX1(){
        double d = Discriminante();
        double x1=0;
        if(A == 0) {
            this.ecuacionCorrecta = false;
            this.mensajeError = "Error: División para 0";
            return -1;
        }

        if (d>=0) {
            x1 = (-B + Math.sqrt(d))/(2*A);
            this.ecuacionCorrecta = true;
            this.mensajeError = "";
        }
        else {
            this.ecuacionCorrecta = false;
            this.mensajeError = "Error: No se puede calcular la raiz cuadrada de un número negativo";
        }
        return x1;
    }


    public double CalcularX2(){
        double d = Discriminante();
        double x1=0;
        if(A == 0) {
            this.ecuacionCorrecta = false;
            this.mensajeError = "Error: División para 0";
            return -1;
        }

        if (d>=0) {
            x1 = (-B - Math.sqrt(d))/(2*A);
            this.ecuacionCorrecta = true;
            this.mensajeError = "";
        }
        else {
            this.ecuacionCorrecta = false;
            this.mensajeError = "Error: No se puede calcular la raiz cuadrada de un número negativo";
        }
        return x1;


    }
}




