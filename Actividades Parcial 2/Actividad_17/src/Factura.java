import java.util.Scanner;

class Cartelera
{
    String Pelicula;
    String Duracion;
    String Clasificacion;
    String Sala;

    public Cartelera (String Pelicula, String Duracion, String Clasificacion, String Sala)
    {
        this.Pelicula = Pelicula;
        this.Duracion = Duracion;
        this.Clasificacion = Clasificacion;
        this.Sala = Sala;
    }

    public Cartelera()
    {

    }

    public String toString()
    {
        return "\nPelicula: " + Pelicula +
               "\nDuración de la pelicula: " + Duracion +
               "\nClasificación: " + Clasificacion +
               "\nSala: " + Sala;
    }
}

public class Factura
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Integer opcion, adultos, ninos, boletos, dulces, dulceria = 0;
        char Respuesta = 'N';
        String insumos = "";

        Cartelera F1 = new Cartelera("F1", "155 mins", "B", "1");
        Cartelera Dragon = new Cartelera("Cómo entrenar a tu dragón", "126 mins", "A", "2");
        Cartelera Exterminio = new Cartelera("Exterminio la evolución", "115 mins", "C", "3");
        Cartelera Megan = new Cartelera("Megan 2.0", "120 mins", "B15", "4");
        Cartelera Stitch = new Cartelera("Lilo y Stitch", "108 mins", "A", "VIP");
        Cartelera Jurassic = new Cartelera("Jurassic World: Renace", "134 mins", "B", "1");
        Cartelera Superman = new Cartelera("Superman", "129 mins", "TBC", "2");
        Cartelera Elio = new Cartelera("Elio", "98 mins", "A", "3");
        Cartelera Mision = new Cartelera("Misión: Imposible - La sentencia Final", "169 mins", "B", "4");
        Cartelera Bailarina = new Cartelera("Bailarina", "125 mins", "C", "VIP");

        System.out.println(F1.toString() + "\nHorarios: 09:00 - 13:00 - 17:00 - 21:00");
        System.out.println(Dragon.toString() + "\nHorarios: 07:45 - 08:00 - 08:30 - 08:45");
        System.out.println(Exterminio.toString() + "\nHorarios: 09:00 - 10:00");
        System.out.println(Megan.toString() + "\nHorarios: 07:30 - 08:20 - 10:15");
        System.out.println(Stitch.toString() + "\nHorarios: 08:30 - 09:15 - 11:00");
        System.out.println(Jurassic.toString() + "\nHorarios: 08:00 - 09:30 - 10:00");
        System.out.println(Superman.toString() + "\nHorarios: 06:00 - 06:45 - 07:30 - 08:30");
        System.out.println(Elio.toString() + "\nHorarios: 11:05 - 01:00 - 03:15 - 05:00 - 06:15");
        System.out.println(Mision.toString() + "\nHorarios: 12:30 - 07:00");
        System.out.println(Bailarina.toString() + "\nHorarios: 04:00 - 06:25 - 08:00 - 10:15");

        System.out.println("\nPeliculas: ");
        System.out.println("\n1.- F1 \n2.- Cómo entrenar a tu dragón \n3.- Exterminio la evolución \n4.- Megan 2.0 \n5.- Lilo y Stitch \n6.- Jurassic World: Renace \n7.- Superman \n8.- Elio \n9.- Misión: Imposible - La sentencia final \n10.- Balerina");
        System.out.println("\nSelecciona la pelicula que deseas ver: ");
        opcion = teclado.nextInt();
        System.out.println("Ingrese el horario en que vera la pelicula: ");
        String Horario = sc.nextLine();
        System.out.println("Boleto adulto: \nSala VIP: 80$ \nSala tradicional: 60$ \n¿Boletos para cuántos adultos? ");
        adultos = teclado.nextInt();
        System.out.println("Boleto infante: \nSala VIP: 40$ \nSala tradicional: 35$ \n¿Boletos para cuantos niños? ");
        ninos = teclado.nextInt();

        if(opcion == 5 || opcion == 10)
        {
            boletos = (adultos * 80) + (ninos * 40);
        } else
          {
            boletos = (adultos * 60) + (ninos * 35);
          }

        System.out.println("\nSelección completada, total a pagar por boletos: " + boletos + "$");

        System.out.println("\n\nMENÚ DULCERIA");
        System.out.println("\n1.- M&M 25$ \n2.- Palomitas 70$ \n3.- Refresco 40$ \n4.- Helado 60$ \n5.- Agua 30$");
        System.out.println("¿Deseas seleccionar algo? (S/N)");
        Respuesta = (char)System.in.read();

        while (Respuesta == 'S') 
        {
            System.out.println("Ingresa el número del producto: ");
            dulces = teclado.nextInt();
            switch (dulces) 
            {
                case 1:
                    dulceria = dulceria + 25;
                    insumos = insumos + " M&M ";
                    break;
                case 2:
                    dulceria = dulceria + 70;
                    insumos = insumos + " Palomitas ";
                    break;
                case 3:
                    dulceria = dulceria + 40;
                    insumos = insumos + " Refresco ";
                    break;
                case 4:
                    dulceria = dulceria + 60;
                    insumos = insumos + " Helado ";
                    break;
                case 5:
                    dulceria = dulceria + 30;
                    insumos = insumos + " Agua ";
                    break;
                default:
                    break;
            }    
            System.out.println("¿Deseas seleccionar algo más? (S/N)");
            Respuesta = (char)System.in.read();
            if(Respuesta == 'N')
            {
                System.out.println("\nSelección completada, total a pagar por dulces: " + dulceria + "$");
            }
        }

        System.out.println("\n\nFACTURA");
        System.out.println("\n" + adultos + " boletos de adultos y " + ninos + " boletos de niños");
        System.out.println("Para la pelicula: ");
        switch (opcion) 
        {
            case 1:
                System.out.println(F1.toString() + "\nEn el horario de: " + Horario);
                break;
            case 2:
                System.out.println(Dragon.toString() + "\nEn el horario de: " + Horario);
                break;
            case 3:
                System.out.println(Exterminio.toString() + "\nEn el horario de: " + Horario);
                break;
            case 4:
                System.out.println(Megan.toString() + "\nEn el horario de: " + Horario);
                break;
            case 5:
                System.out.println(Stitch.toString() + "\nEn el horario de: " + Horario);
                break;
            case 6:
                System.out.println(Jurassic.toString() + "\nEn el horario de: " + Horario);
                break;
            case 7:
                System.out.println(Superman.toString() + "\nEn el horario de: " + Horario);
                break;
            case 8:
                System.out.println(Elio.toString() + "\nEn el horario de: " + Horario);
                break;
            case 9:
                System.out.println(Mision.toString() + "\nEn el horario de: " + Horario);
                break;
            case 10:
                System.out.println(Bailarina.toString() + "\nEn el horario de: " + Horario);
                break;
            default:
                break;
        }
        System.out.println("\nCon los insumos: " + insumos);
        System.out.println("\nPAGO: " + (boletos + dulceria) + "$");

        teclado.close();
        sc.close();
    }
}
