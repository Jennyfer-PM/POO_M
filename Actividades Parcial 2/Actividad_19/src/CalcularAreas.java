import java.util.Scanner;

public class CalcularAreas
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion, base, altura, lado1, lado2, lado3, radio;
        double pi = Math.PI;
        char Respuesta;

        do
        {
            System.out.println("\n\nMENÚ DE CÁLCULO DE ÁREAS Y PERIMETROS");
            System.out.println("1. Calcular área y perimetro de un triangulo ");
            System.out.println("2. Calcular área y perimetro de un circulo ");
            System.out.println("3. Calcular área y perimetro de un rectangulo ");
            System.out.println("4.- Salir");
            System.out.println("Selecciona una de las opciones anteriores: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("\nPara calcular el área del triangulo: ");
                    System.out.println("\nIngresa la base del triangulo: ");
                    base = teclado.nextInt();
                    System.out.println("\nIngresa la altura del triangulo: ");
                    altura = teclado.nextInt();
                    System.out.println("\n\nPara calcular el perimetro del triangulo: ");
                    System.out.println("\nIngresa el lado 1 del triangulo: ");
                    lado1 = teclado.nextInt();
                    System.out.println("\nIngresa el lado 2 del triangulo: ");
                    lado2 = teclado.nextInt();
                    System.out.println("\nIngresa el lado 3 del triangulo: ");
                    lado3 = teclado.nextInt();
                    System.out.println("\n\nRESULTADOS: ");
                    System.out.println("\nÁrea = " + ((base * altura) / 2));
                    System.out.println("Perimetro = " + (lado1 + lado2 + lado3));
                    break;      
                case 2:
                    System.out.println("\nPara calcular el área y el perimetro del circulo: ");
                    System.out.println("\nIngresa el radio del circulo: ");
                    radio = teclado.nextInt();
                    System.out.println("\n\nRESULTADOS: ");
                    System.out.println("\nÁrea = " + (pi * (radio * radio)));
                    System.out.println("Perimetro = " + (2 * pi * radio));
                    break;
                case 3:
                    System.out.println("\nPara calcular el área y perimetro de un rectangulo: ");
                    System.out.println("\nIngresa la base del rectangulo: ");
                    base = teclado.nextInt();
                    System.out.println("\nIngresa la altura del rectangulo: ");
                    altura = teclado.nextInt();
                    System.out.println("\n\nRESULTADOS: ");
                    System.out.println("\nÁrea = " + (base * altura));
                    System.out.println("Perimetro = " + ((base * 2) + (altura * 2)));
                case 4:
                    System.out.println("\nCALCULO TERMINADO");
                    break;
                default:
                    System.out.println("Esta opción no esta en el menu, intentelo de nuevo");
                    break;
            }
            System.out.println("\n¿Deseas seleccionar otra opción? (S/N)");
            Respuesta = (char)System.in.read();

        } while (opcion != 4 || Respuesta != 'N');

        teclado.close();
        sc.close();
    }
}
