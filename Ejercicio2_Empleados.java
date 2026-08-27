import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrarDetalle(int numero) {
        System.out.println("Empleado " + numero + ": \"" + nombre +
                "\", Salario Actual: \"" + (long) calcularSalario() + "\"");
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    private double bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double salario, double bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salario + bonificacion;
    }

    @Override
    public void mostrarDetalle(int numero) {
        System.out.println("Empleado " + numero + ": \"" + nombre +
                "\", Salario Actual: \"" + (long) calcularSalario() +
                "\", Salario Base: " + (long) salario +
                ", Bonificacion: " + (long) bonificacion);
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostrarDetalle(int numero) {
        System.out.println("Empleado " + numero + ": \"" + nombre +
                "\", Salario Actual: \"" + (long) calcularSalario() +
                "\", Cantidad horas trabajadas: " + horasTrabajadas +
                ". Valor de la hora: " + (long) valorHora);
    }
}

public class Ejercicio2_Empleados {
    public static void main(String[] args) {
        String[] nombres = {"Pepito Perez", "Ana Torres", "Luis Gomez", "Marta Diaz", "Jorge Ruiz"};
        Random random = new Random();
        List<Empleado> empleados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            boolean esTiempoCompleto = random.nextBoolean();

            if (esTiempoCompleto) {
                double salario = 1500000 + random.nextInt(1000000);
                double bonificacion = 100000 + random.nextInt(400000);
                empleados.add(new EmpleadoTiempoCompleto(nombre, salario, bonificacion));
            } else {
                int horas = random.nextInt(40) + 10;
                double valorHora = 60000;
                empleados.add(new EmpleadoPorHoras(nombre, horas, valorHora));
            }
        }

        int contador = 1;
        for (Empleado e : empleados) {
            e.mostrarDetalle(contador);
            contador++;
        }
    }
}