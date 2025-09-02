import java.util.ArrayList;
import java.util.Scanner;

class Historial
{
    String mes;
    String dia;
    String Empleado;
    String licencia;
    String vehiculos;
    String placa;
    String materiales;

    public Historial(String mes, String dia, String Empleado, String vehiculos, String placa, String materiales) 
    {
        this.mes = mes;
        this.dia = dia;
        this.Empleado = Empleado;
        this.vehiculos = vehiculos;
        this.placa = placa;
        this.materiales = materiales;
    }

    public String toString() 
    {
        return "\n Mes: " + mes +
                "\n Dia: " + dia +
                "\n Empleado: " + Empleado +
                "\n Vehículo utilizado: " + vehiculos +
                "\n Placa del vehículo: " + placa +
                "\n Material transportado: " + materiales;
    }

    public String getdia() 
    {
        return dia;
    }

    public void setdia(String dia) 
    {
        this.dia = dia;
    }
}

class HistorialAbril extends Historial
{
    public HistorialAbril(String dia, String Empleado, String vehiculos, String placa, String materiales)
    {
        super("Abril", dia, Empleado, vehiculos, placa, materiales);
    }
}

class Datos_Empleados
{
    String tipo;
    String nombre;
    String no_empleado;
    String licencia;

    public Datos_Empleados(String tipo, String nombre, String no_empleado, String licencia) 
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.no_empleado = no_empleado;
        this.licencia = licencia;
    }

    public String toString() 
    {
        return "\n Tipo: " + tipo +
                "\n Nombre del empleado: " + nombre +
                "\n Número de empleado: " + no_empleado +
                "\n Tipo de licencia: " + licencia;
    }

    public String getno_empleado() 
    {
        return no_empleado;
    }

    public void setno_empleado(String no_empleado) 
    {
        this.no_empleado = no_empleado;
    }
}

class Empleado extends Datos_Empleados
{
    public Empleado(String nombre, String no_empleado, String licencia)
    {
        super("Empleado", nombre, no_empleado, licencia);
    }
}

public class Constructora
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Datos_Empleados> listaDatos_Empleados = new ArrayList<Datos_Empleados>();
        ArrayList<HistorialAbril> listaHistorialAbril = new ArrayList<HistorialAbril>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;

        Empleado Armando = new Empleado ("Armando Sauces Mendoza", "73264591", "A");
        listaDatos_Empleados.add(Armando);
        Empleado Bianca = new Empleado ("Bianca Gutierrez Sineros", "68642482", "A");
        listaDatos_Empleados.add(Bianca);
        Empleado Carlos = new Empleado ("Carlos Torres Perciles", "29558562", "A");
        listaDatos_Empleados.add(Carlos);
        Empleado Daniel = new Empleado ("Daniel Solis Flores", "57382042", "A");
        listaDatos_Empleados.add(Daniel);
        Empleado Ernesto = new Empleado ("Ernesto Santos Bedolla", "39582732", "A");
        listaDatos_Empleados.add(Ernesto);
        Empleado Fabiola = new Empleado ("Fabiola Cervantes Quintero", "86427312", "B");
        listaDatos_Empleados.add(Fabiola);
        Empleado Gerardo = new Empleado ("Gerardo Monreal Durango", "32409502", "B");
        listaDatos_Empleados.add(Gerardo);
        Empleado Horacio = new Empleado ("Horacio Estrada Jimenez", "95830522", "B");
        listaDatos_Empleados.add(Horacio);
        Empleado Ignacio = new Empleado ("Ignacio Omali Dysten", "47257582", "B");
        listaDatos_Empleados.add(Ignacio);
        Empleado Jessie = new Empleado ("Jessie Grey Sloan", "19238432", "B");
        listaDatos_Empleados.add(Jessie);
        Empleado Karla = new Empleado ("Karla Tintero Espinoza", "45724932", "C");
        listaDatos_Empleados.add(Karla);
        Empleado Luis = new Empleado ("Luis Lopez Laros", "46906462", "C");
        listaDatos_Empleados.add(Luis);
        Empleado Marcos = new Empleado ("Marcos Mineros Gomez", "69046932", "C");
        listaDatos_Empleados.add(Marcos);
        Empleado Nancy = new Empleado ("Nancy Canto Mendoza", "43421302", "C");
        listaDatos_Empleados.add(Nancy);
        Empleado Peter = new Empleado ("Peter Bolaños Mendez", "86427312", "C");
        listaDatos_Empleados.add(Peter);

        HistorialAbril uno1 = new HistorialAbril ("1", "Armando Sauces Mendoza", "Camión volteo", "PCH-96-04","Arena, Tezontle y Gravilla");
        listaHistorialAbril.add(uno1);
        HistorialAbril dos1 = new HistorialAbril ("2", "Karla Tintero Espinoza", "Montacargas", "REJ-18-26","No aplica");
        listaHistorialAbril.add(dos1);
        HistorialAbril tres1 = new HistorialAbril ("3", "Gerardo Monreal Durango", "Motoconformadoras", "TGL-30-48","No aplica");
        listaHistorialAbril.add(tres1);
        HistorialAbril cuatro1 = new HistorialAbril ("4", "Carlos Torres Perciles", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(cuatro1);
        HistorialAbril siete1 = new HistorialAbril ("7", "Marcos Mineros Gomez", "Camión volteo", "PCH-96-04","Grava y piedras");
        listaHistorialAbril.add(siete1);
        HistorialAbril ocho1 = new HistorialAbril ("8", "Nancy Canto Mendoza", "Montacargas", "REJ-18-26","No aplica");
        listaHistorialAbril.add(ocho1);
        HistorialAbril nueve1 = new HistorialAbril ("9", "Ernesto Santos Bedolla", "Motoconformadoras", "TGL-30-48","No aplica");
        listaHistorialAbril.add(nueve1);
        HistorialAbril diez1 = new HistorialAbril ("10", "Peter Bolaños Mendez", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(diez1);
        HistorialAbril once1 = new HistorialAbril ("11", "Carlos Torres Perciles", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(once1);
        HistorialAbril catorce1 = new HistorialAbril ("14", "Armando Sauces Mendoza", "Camión volteo", "PCH-96-04","Arena, Tezontle y Gravilla");
        listaHistorialAbril.add(catorce1);
        HistorialAbril quince1 = new HistorialAbril ("15", "Karla Tintero Espinoza", "Montacargas", "REJ-18-26","No aplica");
        listaHistorialAbril.add(quince1);
        HistorialAbril dieciseis1 = new HistorialAbril ("16", "Gerardo Monreal Durango", "Motoconformadoras", "TGL-30-48","No aplica");
        listaHistorialAbril.add(dieciseis1);
        HistorialAbril diecisiete1 = new HistorialAbril ("17", "Carlos Torres Perciles", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(diecisiete1);
        HistorialAbril dieciocho1 = new HistorialAbril ("18", "Marcos Mineros Gomez", "Camión volteo", "PCH-96-04","Grava y piedras");
        listaHistorialAbril.add(dieciocho1);
        HistorialAbril veintiuno1 = new HistorialAbril ("21", "Nancy Canto Mendoza", "Montacargas", "REJ-18-26","No aplica");
        listaHistorialAbril.add(veintiuno1);
        HistorialAbril veintidos1 = new HistorialAbril ("22", "Ernesto Santos Bedolla", "Motoconformadoras", "TGL-30-48","No aplica");
        listaHistorialAbril.add(veintidos1);
        HistorialAbril veintitres1 = new HistorialAbril ("23", "Peter Bolaños Mendez", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(veintitres1);
        HistorialAbril veinticuatro1 = new HistorialAbril ("24", "Carlos Torres Perciles", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(veinticuatro1);
        HistorialAbril veinticinco1 = new HistorialAbril ("25", "Armando Sauces Mendoza", "Camión volteo", "PCH-96-04","Arena, Tezontle y Gravilla");
        listaHistorialAbril.add(veinticinco1);
        HistorialAbril veintiocho1 = new HistorialAbril ("28", "Karla Tintero Espinoza", "Montacargas", "REJ-18-26","No aplica");
        listaHistorialAbril.add(veintiocho1);
        HistorialAbril veintinueve1 = new HistorialAbril ("29", "Gerardo Monreal Durango", "Motoconformadoras", "TGL-30-48","No aplica");
        listaHistorialAbril.add(veintinueve1);
        HistorialAbril treinta1 = new HistorialAbril ("30", "Carlos Torres Perciles", "Camión voleto", "PCH-96-04","No aplica");
        listaHistorialAbril.add(treinta1);

        do 
        {
            System.out.println("\n BUSQUEDA");
            System.out.println("\n Opciones: ");
            System.out.println("1.- Empleado. ");
            System.out.println("2.- Fecha. ");
            System.out.println("3.- Salir ");
            System.out.println("Seleccione una de las opciones anteriores: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("\n Ingresa el número del empleado: ");

                    Datos_Empleados buscado_1 = findByno_empleado(sc.nextLine(), listaDatos_Empleados);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\n El número de empleado no existe");
                    } else 
                      {
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("\n Ingresa el día de mes de Abril que deseas buscar: ");

                    HistorialAbril buscado_2 = findBydia(sc.nextLine(), listaHistorialAbril);

                    if (buscado_2 == null) 
                    {
                      System.out.println("\n Día no laborable");
                    } else 
                      {
                        System.out.println(buscado_2.toString());
                      }
                    break;
                case 3:
                    System.out.println("\n Busqueda terminada");
                    break;
                default:
                    break;
            }

        } while (opcion != 3);
        
        teclado.close();
        sc.close();

    }

    public static Datos_Empleados findByno_empleado(String nombreUsuario, ArrayList<Datos_Empleados> listaDatos_Empleados) 
    {
        for (Datos_Empleados informacion : listaDatos_Empleados) 
        {
           if (informacion.getno_empleado().equals(nombreUsuario)) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static HistorialAbril findBydia(String dia1, ArrayList<HistorialAbril> listaHistorialAbril) 
    {
        for (HistorialAbril historial : listaHistorialAbril) 
        {
           if (historial.getdia().equals(dia1)) 
           {
               return historial;
           }
       }
       return null;
    }
}
