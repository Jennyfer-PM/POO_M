class Producto 
{
    String tipo;
    String nombre;
    String marca;
    String unidad;
    String precio;
    String codigoBarras;

    public Producto(String tipo, String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
    }

    public String toString()
    {
        return  "\n Tipo: " + tipo +
                "\n Nombre: " + nombre +
                "\n Marca: " + marca +
                "\n Unidad: " + unidad +
                "\n Precio: " + precio +
                "\n Codigo de Barras: " + codigoBarras;
    }
}

class Bebida extends Producto
{
    //Constructor
    public Bebida(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Bebida", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Botana extends Producto
{
    //Constructor
    public Botana(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Botana", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Dulces extends Producto
{
    //Constructor
    public Dulces(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Dulces", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Frutas extends Producto
{
    //Constructor
    public Frutas(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Frutas", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Verduras extends Producto
{
    //Constructor
    public Verduras(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Verduras", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Articulos_Hogar extends Producto
{
    //Constructor
    public Articulos_Hogar(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Articulos_Hogar", nombre, marca, unidad, precio, codigoBarras);
    }
}

class Papeleria extends Producto
{
    //Constructor
    public Papeleria(String nombre, String marca, String unidad, String precio, String codigoBarras)
    {
        super("Papeleria", nombre, marca, unidad, precio, codigoBarras);
    }
}

public class Tienda
{
    public static void main(String[] args)
    {
        Bebida agua = new Bebida("Agua","Ciel","1L","20.00$","1111111111");
        Botana papas = new Botana("Papas","Sabritas","50g","18.00$","2222222222");
        Dulces chocolate = new Dulces("Chocolate","Hershey","12g","13.00$","3333333333");
        Frutas naranja = new Frutas("Naranjas", "Sin marca", "1kl", "37.90$", "4444444444");
        Verduras tomate = new Verduras("Tomates", "Sin marca", "1kl", "15.00$", "5555555555");
        Articulos_Hogar papel_higienico = new Articulos_Hogar("Papel Higienico", "Pétalo", "4 rollos", "30.00$", "6666666666");
        Papeleria libreta = new Papeleria("Libreta","Norma","100 hojas","50.00$","7777777777");

        System.out.println("\n Detalles de la Bebida 1: " + (agua.toString()));
        System.out.println("\n Detalles de la Botana 1: " + (papas.toString()));
        System.out.println("\n Detalles de Dulces 1: " + (chocolate.toString()));
        System.out.println("\n Detalles de Frutas 1: " + (naranja.toString()));
        System.out.println("\n Detalles de Verduras 1: " + (tomate.toString()));
        System.out.println("\n Detalles de Articulos del hogar 1: " + (papel_higienico.toString()));
        System.out.println("\n Detalles de Papeleria 1: " + (libreta.toString()));
    }
}