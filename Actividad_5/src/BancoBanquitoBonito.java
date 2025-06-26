import java.util.Scanner;

public class BancoBanquitoBonito 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        Integer Opcion, Deposito, Retiro, Acumulado = 0;
        char Respuesta = 'N';

        System.out.println("Ingrese el nombre del propietario: ");
        String Nombre = sc.nextLine();

        System.out.println("A continuación, ingrese su número de cuenta: ");
        String Numero = sc.nextLine();

        System.out.println("Ahora, ingrese si su tipo de cuenta (Ahorro, Crédito o Débito): ");
        String Cuenta = sc.nextLine();

        System.out.println("¿Cuál es el movimiento que desea realizar: ");
        System.out.println("1.- Visualizar datos de cuenta ");
        System.out.println("2.- Depositar dinero ");
        System.out.println("3.- Retirar efectivo ");
        System.out.println("4.- Finalizar ");

        do
        {
            System.out.println("Ingrese el número de la operación que realizara: ");
            Opcion = teclado.nextInt();

            switch (Opcion) 
            {
                case 1:
                    System.out.println("Detalles de la cuenta: ");
                    System.out.println("Nombre de la cuenta: " + Nombre);
                    System.out.println("Número de cuenta: " + Numero);
                    System.out.println("Tipo de cuenta: " + Cuenta);
                    System.out.println("Efectivo en la cuenta: " + Acumulado + "$");
                    break;
                case 2:
                    System.out.println("Ingresa el monto de tu deposito: ");
                    Deposito = teclado.nextInt();
                    System.out.println("Saldo Inicial: " + Acumulado + "$");
                    System.out.println("Ingresaste: " + Deposito + "$");
                    Acumulado = Acumulado + Deposito;
                    System.out.println("Saldo Final: " + Acumulado + "$");
                    break;
                case 3:
                    do
                    {
                       System.out.println("Ingresa el monto que vas a retirar: ");
                        Retiro = teclado.nextInt();
                        if (Retiro > Acumulado) 
                        {
                            System.out.println("ERROR, no tienes esa cantidad de dinero en tu cuenta");
                            System.out.println("Deseas continuar esta operación? (S/N) ");
                            Respuesta = (char)System.in.read();
                        } else
                          {
                            System.out.println("Saldo Inicial: " + Acumulado + "$");
                            System.out.println("Retiraste: " + Retiro + "$");
                            Acumulado = Acumulado - Retiro;
                            System.out.println("Saldo Final: " + Acumulado + "$");
                            Respuesta = 'N';
                          }
                    } while (Respuesta == 'S');
                    break;
                case 4:
                    System.out.println("Operación finalizada ");
                    break;
                default:
                    System.out.println("Ingreso una opción que no esta en el menú ");
                    break;
            }
        } while (Opcion != 4);

        sc.close();
        teclado.close();

    }
}