class  Bolsas
{
    String Tipo;
    String Marca;
    String Tamanio;
    String Color;
    String Precio;

    public Bolsas (String Tipo, String Marca, String Tamanio, String Color, String Precio)
    {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Tamanio = Tamanio;
        this.Color = Color;
        this.Precio = Precio;
    }

    public String toString()
    {
        return  "\n Tipo: " + Tipo +
                "\n Marca: " + Marca +
                "\n Tamaño: " + Tamanio +
                "\n Color: " + Color +
                "\n Precio: " + Precio;
    }
}

class Cartera extends Bolsas
{
    public Cartera(String Marca, String Tamanio, String Color, String Precio)
    {
        super("Cartera", Marca, Tamanio, Color, Precio);
    }
}

class Maleta extends Bolsas
{
    public Maleta(String Marca, String Tamanio, String Color, String Precio)
    {
        super("Maleta", Marca, Tamanio, Color, Precio);
    }
}

public class Examen_Parcial1
{
    public static void main(String[] args)
    {
        Cartera Monedero = new Cartera("Gucci","Pequeño","Rosa","75.50$");
        Maleta De_Viaje = new Maleta("Vogue","Grande","Negro","560.70$");
            
        System.out.println("\n Detalles del bolso 1: " + (Monedero.toString()));            
        System.out.println("\n Detalles del bolso 2: " + (De_Viaje.toString()));
    }
}
