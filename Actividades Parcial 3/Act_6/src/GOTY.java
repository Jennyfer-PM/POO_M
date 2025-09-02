import java.util.ArrayList;
import java.util.Scanner;

class Datos 
{
    String Anio;
    String Juego;

    public Datos (String Anio, String Juego)
    {
        this.Anio = Anio;
        this.Juego = Juego;
    }

    public String toString()
    {
        return "\nAño: " + Anio + "\nJuego ganador: " + Juego;
    }

    public String getAnio() 
    {
        return Anio;
    }
}

public class GOTY
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        ArrayList<Datos> listaDatos = new ArrayList<Datos>();

        Datos tres = new Datos("2003", "Madden NFL 2004");
        listaDatos.add(tres);
        Datos cuatro = new Datos("2004", "GTA San Andreas");
        listaDatos.add(cuatro);
        Datos cinco = new Datos("2005", "Resident Evil 5");
        listaDatos.add(cinco);
        Datos seis = new Datos("2006", "The Elder Scrolls IV: Oblivion");
        listaDatos.add(seis);
        Datos siete = new Datos("2007", "Bioshock");
        listaDatos.add(siete);
        Datos ocho = new Datos("2008", "Grand Theft Auto IV");
        listaDatos.add(ocho);
        Datos nueve = new Datos("2009", "Uncharted 2: El reino de los ladrones");
        listaDatos.add(nueve);
        Datos diez = new Datos("2010", "Red Dead Redemption");
        listaDatos.add(diez);
        Datos once = new Datos("2011", "The Elder Scrolls V: Skyrim");
        listaDatos.add(once);
        Datos doce = new Datos("2012", "The Walking Dead");
        listaDatos.add(doce);
        Datos trece = new Datos("2013", "Grand Theft Auto V");
        listaDatos.add(trece);
        Datos catorce = new Datos("2014", "Dragon Age: Inquisition");
        listaDatos.add(catorce);
        Datos quince = new Datos("2015", "The Witcher 3: Wild Hunt");
        listaDatos.add(quince);
        Datos diez6 = new Datos("2016", "Overwatch");
        listaDatos.add(diez6);
        Datos diez7 = new Datos("2017", "The Legend of Zelda: Breath of the Wild");
        listaDatos.add(diez7);
        Datos diez8 = new Datos("2018", "God of War");
        listaDatos.add(diez8);
        Datos diez9 = new Datos("2019", "Sekiro: Shadows Die Twice");
        listaDatos.add(diez9);
        Datos veinte = new Datos("2020", "The Last of Us Parte II");
        listaDatos.add(veinte);
        Datos veinte1 = new Datos("2021", "It Takes Two");
        listaDatos.add(veinte1);
        Datos veinte2 = new Datos("2022", "Elden Ring");
        listaDatos.add(veinte2);
        Datos veinte3 = new Datos("2023", "Baldur’s Gate 3");
        listaDatos.add(veinte3);
        Datos veinte4 = new Datos("2024", "Astro Bot");
        listaDatos.add(veinte4);
        Datos veinte5 = new Datos("2025", "Claro oscuro: Expedición 33");
        listaDatos.add(veinte5);

        int Opcion;

        do 
        {
            System.out.println("\nJUEGOS DEL AÑO!!");
            System.out.println("\nOpciones: \n1.- Consultar ganador \n2.- Salir");
            System.out.println("\nSelecciona una opción: ");
            Opcion = teclado.nextInt();
            switch (Opcion) 
            {
                case 1:
                    System.out.println("\n\nIngresa el año de consulta: ");
                    Datos buscado = findByAnio(sc.nextLine(), listaDatos);

                    if (buscado == null) 
                    {
                      System.out.println("\nAño no encontrado");
                    } else                       
                      {
                        System.out.println(buscado.toString());
                      }
                    break;
                case 2:
                    System.out.println("\nGracias por usar el programa!!\n\n");
                default:
                    break;
            }
        } while (Opcion != 2);

        sc.close();
        teclado.close();
    }

    public static Datos findByAnio(String fecha, ArrayList<Datos> listaDatos) 
    {
        for (Datos informacion : listaDatos) 
        {
           if (informacion.getAnio().equals(fecha)) 
           {
               return informacion;
           }
       }
       return null;
    }
}
