public class Carpeta 
{
    private durabook;
    private morado;
    private cartón;
    private 24x30cm;
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
}
