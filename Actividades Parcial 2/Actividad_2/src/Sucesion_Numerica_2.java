import java.util.Scanner;
import java.util.Arrays;

public class Sucesion_Numerica_2
{
    public static void main(String[] args) throws Exception 
    {
        Integer sucesion = 0, num[];
        num = new Integer[10];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa los 10 números que quieras: ");

        for (sucesion = 0; sucesion < 10; sucesion++) 
        {
            System.out.println("\n Número" + (sucesion + 1) + ": ");
            num[sucesion] = teclado.nextInt();
            if (sucesion == 9)
            {
                teclado.close();
            }
        }
        
        Arrays.sort(num);

        System.out.println("Los números ordenados de mayor a menor son. ");
        for(Integer numeros : num)
        {
            System.out.println(numeros);
        }
        
    }
}