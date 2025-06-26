import java.util.Scanner;

public class AdivinaNumero 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int valor = (int)Math.floor(Math.random() * 20 + 1);

        System.out.println("¡¡Intenta adivinar el número!!");

        do
        {
            System.out.println("\nIngresa un número entre el 1 y el 20: ");
            numero = teclado.nextInt();

            if (numero > 20 || numero < 1)
            {
                System.out.println("\n No ingresaste un número valido");
                System.out.println("Intentalo de nuevo ");
            }

            if (valor == numero)
            {
                System.out.println("\n¡¡Felicidades!!");
                System.out.println("Adivinaste el número correctamente");
                teclado.close();
            } else
              {
                System.out.println("\nFallaste, intentalo de nuevo ");
              }

        }while ((numero > 20 || numero < 1) || (numero != valor));

    }
}
