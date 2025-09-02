import java.util.Scanner;

public class Ruleta 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);

        int opcion, vidas = 3, puntos = 0;

        System.out.println("-- BIENVENIDO AL JUEGO DE LA RULETA --");
        System.out.println("\nFRESA ( +41 pts )");
        int fresa = 41;
        System.out.println("\nCALAVERA ( -1 vida )");
        int calavera = 1;
        System.out.println("\nVENENO ( -62 pts )");
        int veneno = 62;
        System.out.println("\nCORONA ( +31 pts )");
        int corona = 24;
        System.out.println("\nRAMITA ( -34 pts )");
        int ramita = 34;
        System.out.println("\nMONEDA DE ORO ( +35 pts )");
        int moneda = 35;
        System.out.println("\nHUESO DE MANZANA ( -46 pts )");
        int hueso = 46;
        System.out.println("\nROSA ( +1 vida )");
        int rosa = 1;
        System.out.println("\nSOL ( +63 pts )");
        int sol = 63;
        System.out.println("\nESQUELETO DE PESCADO ( -28 pts )");
        int esqueleto = 28;
        //180
        //180
        do 
        {
            System.out.println("\nJugador tus estadisticas son: ");
            System.out.println("PUNTOS ACUMULADOS: " + puntos);
            System.out.println("VIDAS RESTANTES: " + vidas);
            System.out.println("\n1.- Girar la ruleta \n2.- Abandonar el juego");
            System.out.println("Jugador elige una opción: ");
            opcion = teclado.nextInt();
            int giro = (int)Math.floor(Math.random() * 10 + 1);
            switch (giro) 
            {
                case 1:
                    System.out.println("\nConseguiste una FRESA!");
                    System.out.println("Has ganado " + fresa + " puntos");
                    puntos = puntos + fresa;
                    break;
                case 2:
                    System.out.println("\nOH NO!, Atrapaste una calavera");
                    System.out.println("Has perdido una vida");
                    if (vidas == 1) 
                    {
                        System.out.println("Has perdido todas tus vidas :(");
                    } 
                    vidas = vidas - calavera;
                    break;
                case 3:
                    System.out.println("\nOh no!, Atrapaste veneno");
                    System.out.println("Has perdido " + veneno + " puntos");
                    puntos = puntos - veneno;
                    break;
                case 4:
                    System.out.println("\nConseguiste una CORONA!");
                    System.out.println("Has ganado " + corona + " puntos");
                    puntos = puntos + corona;
                    break;
                case 5:
                    System.out.println("\nOh no!, Atrapaste una ramita");
                    System.out.println("Has perdido " + ramita + " puntos");
                    puntos = puntos - ramita;
                    break;
                case 6:
                    System.out.println("\nConseguiste una MONEDA!");
                    System.out.println("Has ganado " + moneda + " puntos");
                    puntos = puntos + moneda;
                    break;
                case 7:
                    System.out.println("\nOh no!, Atrapaste un hueso de manzana");
                    System.out.println("Has perdido " + hueso + " puntos");
                    puntos = puntos - hueso;
                    break;
                case 8:
                    System.out.println("\nFELICIDADES!, conseguiste una ROSA");
                    System.out.println("Has ganado una vida!");
                    if (vidas == 3) 
                    {
                        System.out.println("Tus vidas ya estan al maximo");
                    } else
                      {
                        vidas = vidas + rosa;
                      }
                    break;
                case 9:
                    System.out.println("\nConseguiste un SOL!");
                    System.out.println("Has ganado " + sol + " puntos");
                    puntos = puntos + sol;
                    break;
                case 10:
                    System.out.println("\nOh no!, Atrapaste un esqueleto de pescado");
                    System.out.println("Has perdido " + esqueleto + " puntos");
                    puntos = puntos - esqueleto;
                    break;
                default:
                    break;
            }
        } while ((opcion != 2) && (vidas > 0));

        System.out.println("\nTus puntos finales son: " + puntos);
        System.out.println("Al final te quedaron " + vidas + " vidas");
        System.out.println("\n-- GRACIAS POR JUGAR A LA RULETA! --\n\n");

        teclado.close();
    }
}
