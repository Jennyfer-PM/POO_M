import java.util.Scanner;

public class Laborable
{
    public static void main(String[] args) throws Exception 
    {
        String dia;

        System.out.println("Ingresa el día de la semana que desees en minusculas: ");
        dia = teclado.nextString();
        teclado.close();

        if(dia == "sabado" || dia == "domingo")
        {
            System.out.println("El" + dia + "es un dia no laborable");
        } else
          {
            System.out.println("El" + dia + "es un dia laborable");
          }
    }
}
