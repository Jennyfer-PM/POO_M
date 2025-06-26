import java.util.Scanner;

public class Laborable_2
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el día de la semana que desees en minusculas: ");
        String dia = sc.nextLine();

        sc.close();

        if(dia.equals("sabado") || dia.equals("domingo"))
        {
            System.out.println("El " + dia + " es un dia no laborable");
        } else
          {
            System.out.println("El " + dia + " es un dia laborable");
          }
    }
}