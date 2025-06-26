import java.util.Scanner;

public class Fecha_Validar 
{
    public static void main(String[] args) throws Exception 
    {
        int dia;
        int mes;
        int anio;
        boolean valido = false;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la fecha de tu preferencia, empieza por: ");

        do
        {
            System.out.println("Ingresa el día: ");
            dia = teclado.nextInt();
            System.out.println("Ingresa el mes: ");
            mes = teclado.nextInt();
            System.out.println("Ingresa el año: ");
            anio = teclado.nextInt();

            if (dia <= 0 || mes <= 0 || anio <= 0 || dia > 30 || mes > 12 || (dia > 29 && mes == 2)) 
            {
                System.out.println("La fecha ingresada no es valida");
                System.out.println("Intentalo nuevamente: ");
                valido = true;
            }
            
        } while (valido = true);

        teclado.close();

        System.out.println("La fecha ingresada fue: " + dia + "/" + mes + "/" + anio);
    }
}