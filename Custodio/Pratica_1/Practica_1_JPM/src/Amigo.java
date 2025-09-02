//Super Clase

class Planta 
{
    //Atributos
    String tipo;
    String nombre;
    String tamanio;
    String color;

    //Constructor
    public Planta(String tipo, String nombre, String tamanio, String color)
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.color = color;
    }

    //Método toString
    public String toString()
    {
        return  "\n tipo: " + tipo +
                "\n nombre: " + nombre +
                "\n tamanio: " + tamanio +
                "\n color: " + color;
    }

}
//Sub-clase 1
class Flor extends Planta
{
    //Constructor
    public Flor(String nombre, String tamanio, String color)
    {
        super("Flor", nombre, tamanio, color);
    }
}
//Sub-clase 2
class Arbol extends Planta
{
    //Constructor
    public Arbol(String nombre, String tamanio, String color)
    {
        super("Arbol", nombre, tamanio, color);
    }
}
//clase main
public class Amigo
{
    //Método Main
    public static void main(String[] args)
    {
        //Instancias
        Flor girasol = new Flor("Girasol","1 metro","Amarillo");
        Arbol paraiso = new Arbol("Paraíso","15 metros","Lila");

        //Imprimir
        System.out.println("\n Detalles de la Flor 1: " + (girasol.toString()));
        System.out.println("\n Detalles del Arbol 1: " + (paraiso.toString()));
    }
}