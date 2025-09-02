import java.util.Scanner;

class Datos
{
    String tipo;
    String nombre;
    String nivel;
    String vida;
    String debilidad;
    String ataques;

    public Datos(String tipo, String nombre, String nivel, String vida, String debilidad, String ataques)
    {
        this.tipo = tipo;
        this.nombre = nombre;    
        this.nivel = nivel;
        this.vida = vida;
        this.debilidad = debilidad;
        this.ataques = ataques;
    }

    public String toString()
    {
        return "\nTipo: " + tipo + "\nPokemon: " + nombre + "\nNivel: " + nivel + "\nVida: " + vida + "\nDebilidad: " + debilidad + "\nAtaques: " + ataques;
    }

}

class Planta extends Datos
{
    public Planta(String nombre, String nivel, String vida, String debilidad, String ataques) 
    {
        super("Planta", nombre, nivel, vida, debilidad, ataques);
    }
}

class Fuego extends Datos
{
    public Fuego(String nombre, String nivel, String vida, String debilidad, String ataques) 
    {
        super("Fuego", nombre, nivel, vida, debilidad, ataques);
    }
}

public class Pokemon
{
    public static void main(String[] args) throws Exception 
    {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        //Pokemon 1
        Planta pokemon1 = new Planta("Schreid", "Uno", "5000", "Fuego", "\nPlanteación: 820 \nEnredaderas: 672 \nGolpe: 300 \nPatada: 250 ");

        //Pokemon 2
        Fuego pokemon2 = new Fuego("Farche", "Uno", "6500", "Agua", "\nLlamas: 830 \nBola de fuego: 700 \nGolpe: 300 \nPatada: 250 ");

        System.out.println("\nElige tu Pokemon: \n1.- Planta \n2.- Fuego");
        opcion = teclado.nextInt();
        switch (opcion) 
        {
            case 1:
                System.out.println(pokemon1.toString());
                break;
            case 2:
                System.out.println(pokemon2);
                break;
            default:
                System.out.println("Incorrecto");
                break;
        }

        teclado.close();

    }
}
