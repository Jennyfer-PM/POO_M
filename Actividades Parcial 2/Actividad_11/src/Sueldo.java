import java.util.ArrayList;
import java.util.Scanner;

class Trabajador
{
    String tipo;
    String nombre;
    String clave;
    String rfc;
    String sueldo_base;
    String impuestos;
    String sueldo_total;

    public Trabajador(String tipo, String nombre, String clave, String rfc, String sueldo_base, String impuestos, String sueldo_total) 
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.clave = clave;
        this.rfc = rfc;
        this.sueldo_base = sueldo_base;
        this.impuestos = impuestos;
        this.sueldo_total = sueldo_total;
    }

    public String toString() 
    {
        return "\n Tipo: " + tipo +
                "\n Nombre: " + nombre +
                "\n Clave de emplado: " + clave +
                "\n RFC: " + rfc +
                "\n Sueldo base: " + sueldo_base +
                "\n Descuento por impuestos: " + impuestos +
                "\n Sueldo total: " + sueldo_total;
    }

    public String getnombre() 
    {
        return nombre;
    }

    public void setnombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getclave() 
    {
        return clave;
    }

    public void setclave(String clave) 
    {
        this.clave = clave;
    }

}

class Empleado extends Trabajador
{
    public Empleado(String nombre, String clave, String rfc, String sueldo_base, String impuestos, String sueldo_total)
    {
        super("Empleado", nombre, clave, rfc, sueldo_base, impuestos, sueldo_total);
    }
}

public class Sueldo
{
    public static void main(String[] args) throws Exception 
    {

        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;

        Empleado Armando = new Empleado ("Armando Sauces Mendoza", "73264591", "SAMA871114G73", "14,751.20$", "1,475.12$", "13,276.08$");
        listaEmpleado.add(Armando);
        Empleado Bianca = new Empleado ("Bianca Gutierrez Sineros", "68642482", "GUSB910327C90", "22,608.74$", "2,260.87", "20,347.87");
        listaEmpleado.add(Bianca);
        Empleado Carlos = new Empleado ("Carlos Torres Perciles", "29558562", "TOPC971230L12", "3,229.37$", "0$", "3,229.37$");
        listaEmpleado.add(Carlos);
        Empleado Daniel = new Empleado ("Daniel Solis Flores", "57382042", "SOFD010512X53", "7,829.96$", "391.498$", "7,438.46$");
        listaEmpleado.add(Daniel);
        Empleado Ernesto = new Empleado ("Ernesto Santos Bedolla", "39582732", "SABE940824F57", "8,954.23$", "447.71$", "8,506.52$");
        listaEmpleado.add(Ernesto);

    do 
        {
            System.out.println("\n BUSQUEDA DE SUELDO");
            System.out.println("\n Opciones: ");
            System.out.println("1.- Nombre empleado. ");
            System.out.println("2.- Clave empleado. ");
            System.out.println("3.- Salir ");
            System.out.println("Seleccione una de las opciones anteriores: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("\n Ingresa el nombre del empleado: ");

                    Empleado buscado_1 = findBynombre(sc.nextLine(), listaEmpleado);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\n No se encontro ningun salario con ese nombre");
                    } else 
                      {
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("\n Ingresa la clave del empleado: ");

                    Empleado buscado_2 = findByclave(sc.nextLine(), listaEmpleado);

                    if (buscado_2 == null) 
                    {
                      System.out.println("\n No se encontro ningun salario con esa clave");
                    } else 
                      {
                        System.out.println(buscado_2.toString());
                      }
                    break;
                case 3:
                    System.out.println("\n BUSQUEDA TERMINA ");
                    break;
                default:
                    break;
            }

        } while (opcion != 3);

        teclado.close();
        sc.close();

    }

    public static Empleado findBynombre(String nombreUsuario, ArrayList<Empleado> listaEmpleado) 
    {
        for (Empleado nombre_emp : listaEmpleado) 
        {
           if (nombre_emp.getnombre().equals(nombreUsuario)) 
           {
               return nombre_emp;
           }
       }
       return null;
    }

    public static Empleado findByclave(String clav, ArrayList<Empleado> listaEmpleado) 
    {
        for (Empleado clave_emp : listaEmpleado) 
        {
           if (clave_emp.getclave().equals(clav)) 
           {
               return clave_emp;
           }
       }
       return null;
    }
}
