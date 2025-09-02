class Oso
{
    String tipo;
    String peso;
    String color;
    String habitat;
    String velocidad;

    public Oso(String tipo, String peso, String color, String habitat, String velocidad)
    {
        this.tipo = tipo;
        this.peso = peso;
        this.color = color;
        this.habitat = habitat;
        this.velocidad = velocidad;
    }

    public String toString()
    {
        return  "\n Tipo: " + tipo +
                "\n Peso: " + peso +
                "\n Color: " + color +
                "\n Habitat: " + habitat +
                "\n Velocidad: " + velocidad;
    }

}

class Polar extends Oso
{
    //Constructor
    public Polar(String peso, String color, String habitat, String velocidad)
    {
        super("Polar", peso, color, habitat, velocidad);
    }
}

class Pardo extends Oso
{
    public Pardo(String peso, String color, String habitat, String velocidad)
    {
        super("Pardo", peso, color, habitat, velocidad);
    }
}

class Panda extends Oso
{
    public Panda(String peso, String color, String habitat, String velocidad)
    {
        super("Panda", peso, color, habitat, velocidad);
    }
}

class Negro extends Oso
{
    public Negro(String peso, String color, String habitat, String velocidad)
    {
        super("Negro Americano", peso, color, habitat, velocidad);
    }
}

public class Amigo2
{
    public static void main(String[] args)
    {
        Pardo grizzly = new Pardo("180kg","Marrón","Bosques","56km/h");
        Polar ursus = new Polar("350kg","Blanco","Ártico","40km/h");
        Panda gigante = new Panda("150kg","Blanco y Negro","Bosques templados","20m/h");
        Negro americano = new Negro("400kg","Negro","Praderas","50km/h");

        System.out.println("\n Detalles del Oso 1: " + (grizzly.toString()));
        System.out.println("\n Detalles del Oso 2: " + (ursus.toString()));
        System.out.println("\n Detalles del Oso 3: " + (gigante.toString()));
        System.out.println("\n Detalles del Oso 4: " + (americano.toString()));
    }
}