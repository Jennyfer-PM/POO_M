import java.util.Scanner;

public class Minijuegos
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int juego, ppt, intentos, ganador, ruleta, moneda;

        do 
        {
            System.out.println("\n\nMINIJUEGOS");
            System.out.println("\n1.- PIEDRA, PAPEL Y TIJERAS \n2.- RULETA RUSA \n3.- JUEGO DE LA MONEDA \n4.- SALIR");
            System.out.println("Elección juego: ");
            juego = teclado.nextInt();

            switch (juego) 
            {
                case 1:
                    intentos = 0;
                    ganador = 0;
                    while ((intentos < 3) && (ganador != 1))
                    {
                        intentos = intentos + 1;
                        int valorppt = (int)Math.floor(Math.random() * 3 + 1);
                        System.out.println("\nPIEDRA, PAPEL Y TIJERAS");
                        System.out.println("1.- Piedra \n2.- Papel \n3.- Tijeras");
                        System.out.println("Elige, intento " + intentos + ": ");
                        ppt = teclado.nextInt();
                        System.out.println("Usuario: " + ppt + "\nContra maquina: " + valorppt);
                        if ((valorppt == 1 && ppt == 2) || (valorppt == 2 && ppt == 3) || (valorppt == 3 && ppt == 1)) 
                        {
                            System.out.println("GANASTE!!");
                            ganador = 1;
                        } else 
                          {
                            if (ppt == valorppt)
                            {
                                System.out.println("EMPATE");
                            } else
                              {
                                System.out.println("PERDISTE");
                              }
                          }

                        if (intentos == 3)
                        {
                            System.out.println("\nINTENTOS TERMINADOS");
                        }
                        }
                    break;
                case 2:
                    int valorruleta = (int)Math.floor(Math.random() * 6 + 1);
                    System.out.println("RULETA RUSA");
                    System.out.println("Selecciona un número entre el 1 y el 6, este sera tu tiro: ");
                    ruleta = teclado.nextInt();
                    if (valorruleta == ruleta)
                    {
                        System.out.println("MORISTE, LA BALA ESTABA EN TU TIRO");
                    } else
                      {
                        System.out.println("TE SALVASTE!!");
                        System.out.println("La bala estaba en el tiro: " + valorruleta);
                      }
                    break;
                case 3:
                    int valormoneda = (int)Math.floor(Math.random() * 2 + 1);
                    System.out.println("JUEGO DE LA MONEDA");
                    System.out.println("\n1.- Cara \n2.- Cruz \nElige uno: ");
                    moneda = teclado.nextInt();
                    if (valormoneda == moneda)
                    {
                        System.out.println("GANASTE!!");
                    } else
                      {
                        System.out.println("PERDISTE");
                      }
                    break;
                case 4:
                    System.out.println("\nJUEGOS FINALIZADOS!!\n");
                    break;
                default:
                    break;
            }
        } while (juego != 4);

        teclado.close();

    }
}
