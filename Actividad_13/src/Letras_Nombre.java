import java.util.Scanner;

public class Letras_Nombre
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESA LOS NOMBRES ");
        System.out.println("\nNombre 1: ");
        String nombre1 = sc.nextLine();
        System.out.println("Nombre 2: ");
        String nombre2 = sc.nextLine();
        System.out.println("Nombre 3: ");
        String nombre3 = sc.nextLine();
        System.out.println("Nombre 4: ");
        String nombre4 = sc.nextLine();
        System.out.println("Nombre 5: ");
        String nombre5 = sc.nextLine();
        System.out.println("Nombre 6: ");
        String nombre6 = sc.nextLine();
        System.out.println("Nombre 7: ");
        String nombre7 = sc.nextLine();

        sc.close();

        int letras1 = nombre1.length();
        int letras2 = nombre2.length();
        int letras3 = nombre3.length();
        int letras4 = nombre4.length();
        int letras5 = nombre5.length();
        int letras6 = nombre6.length();
        int letras7 = nombre7.length();

        System.out.println("\nEl nombre " + nombre1 + " tiene " + letras1 + " caracteres");
        System.out.println("El nombre " + nombre2 + " tiene " + letras2 + " caracteres");
        System.out.println("El nombre " + nombre3 + " tiene " + letras3 + " caracteres");
        System.out.println("El nombre " + nombre4 + " tiene " + letras4 + " caracteres");
        System.out.println("El nombre " + nombre5 + " tiene " + letras5 + " caracteres");
        System.out.println("El nombre " + nombre6 + " tiene " + letras6 + " caracteres");
        System.out.println("El nombre " + nombre7 + " tiene " + letras7 + " caracteres");
        
    }
}
