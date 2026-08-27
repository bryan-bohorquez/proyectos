import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Persona {
    private String nombre ;
    private int edad ;
    private String documento;
    




public String getNombre() {
    return nombre;
}

public void setNombre(String nombre){
    this.nombre =nombre;

}
public int getEdad() {
    return edad;
}
public void setEdad(int edad){
    this.edad =edad;

}
public String getDocumento(){
    return documento;

}
public void setDocumento(String documento){
    this.documento =documento;

}
public Persona (String nombre, int edad, String documento){
    this.nombre = nombre;
    this.edad = edad;
    this.documento = documento;
}
public void mostrarInformacion(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Documento: " + documento);
}
public boolean esMayorDeEdad(){
    return edad >18;
}
}

public class Ejercicio1_Persona {
    public static void main(String[]args){
        List<Persona> personas = new ArrayList<>();
    
    Random random = new Random();
    String[] nombres = {"Carlos", "Maria", "Andres", "Laura", "Juan", "Camila", "Diego", "Valentina"};
    
 for (int i = 0; i < 10; i++) {
    int edadAleatoria = random.nextInt(60) + 1;
    String nombreAleatorio = nombres[random.nextInt(nombres.length)];
    Persona p = new Persona(nombreAleatorio, edadAleatoria, "Doc" + (i + 1));
    personas.add(p);
}

    for (Persona persona : personas) {
    if (persona.esMayorDeEdad()) {
        System.out.println("Nombre: " + persona.getNombre() + " Es mayor de edad");
    } else {
        System.out.println("Nombre: " + persona.getNombre() + " No es mayor de edad");
    }
}
}
}


