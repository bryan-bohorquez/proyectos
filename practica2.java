public class practica2 {
    public static void main(String[] args) {
        int a, b, c;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        a = sc.nextInt();
        
        System.out.print("Digite otro numero: ");
        b = sc.nextInt();
        
        c = a + b;
        System.out.println("La suma es: " + c);
    }
}