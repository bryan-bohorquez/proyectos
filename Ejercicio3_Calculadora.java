
class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.println(operacion + " = " + resultado);
    }
}

public class Ejercicio3_Calculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultadoSuma = calculadora.sumar(20, 30);
        calculadora.mostrarResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(50, 20);
        calculadora.mostrarResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(6, 7);
        calculadora.mostrarResultado("Multiplicacion", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(90, 3);
        calculadora.mostrarResultado("Division", resultadoDivision);
    }
}
