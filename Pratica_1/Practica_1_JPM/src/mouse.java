class mouse
{
    private String Color;
    private double Marca;
    private String Tipo;
    private String Conexión;
    private String Modelo;

    public void asignarNombre (String clic_derecho)
    {
        if (clic_derecho.length( ) == 0) 
        {
            System.out.println("Error: Cadena vacía");
            return ;   
        }
        nombre = clic_derecho;
    }

    public void asignarNombre (String clic_izquierdo)
    {
        if (clic_izquierdo.length( ) == 0) 
        {
            System.out.println("Error: Cadena vacía");
            return ;   
        }
        nombre = clic_izquierdo;
    }

}
