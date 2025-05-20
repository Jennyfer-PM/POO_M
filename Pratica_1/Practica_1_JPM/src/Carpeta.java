public class Carpeta 
{
    private Marca;
    private Color;
    private Material;
    private Dimensiones;
    //Atributos de la clase, marca, color, material y dimensiones
    public void asignarNombre(String guardar)
    {
        if (guardar.length( ) == 0) 
        {
            System.out.println("Error: Cadena vacía");
            return ;   
        }
        nombre = guardar;
    }

    public void asignarNombre(String quitar)
    {
        if (quitar.length( ) == 0) 
        {
            System.out.println("Error: Cadena vacía");
            return ;   
        }
        nombre = quitar;
    }

    public static void main(String[]args)
    {
       Carpeta = new Carpeta01[];
       Carpeta01 = asignarMarca("durabook");
       Carpeta01 = asignarColor("morado");
       Carpeta01 = asignarMaterial("cartón");
       Carpeta01 = asignarDimensiones("24x30cm");

       system.out.println(Carpeta01.obtenerMarca());
       system.out.println(Carpeta01.obtenerColor());
       system.out.println(Carpeta01.obtenerMaterial());
       system.out.println(Carpeta01.obtenerDimensiones());
    }
}
