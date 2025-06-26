import java.util.ArrayList;
import java.util.Scanner;

class Datos_Medicos
{
    String usuario;
    String nombre;
    String id;
    String curp;
    String consultorio;
    String especialidad;

    public Datos_Medicos(String usuario, String nombre, String id, String curp, String consultorio, String especialidad) 
    {
        this.usuario = usuario;
        this.nombre = nombre;
        this.id = id;
        this.curp = curp;
        this.consultorio = consultorio;
        this.especialidad = especialidad;
    }

    public String getnombre() 
    {
        return nombre;
    }

    public void setnombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getid() 
    {
        return id;
    }

    public void setid(String id) 
    {
        this.id = id;
    }

    public String toString() 
    {
        return "\n Usuario: " + usuario +
                "\n Nombre: " + nombre +
                "\n ID: " + id +
                "\n CURP: " + curp +
                "\n Consultorio: " + consultorio +
                "\n Especialidad: " + especialidad;
    }
}

class Datos_Pacientes
{
    String usuario;
    String nombre;
    String curp;
    String consultorio;
    String medico;
    String especialidad;

    public Datos_Pacientes(String usuario, String nombre, String curp, String consultorio, String medico, String especialidad) 
    {
        this.usuario = usuario;
        this.nombre = nombre;
        this.curp = curp;
        this.consultorio = consultorio;
        this.medico = medico;
        this.especialidad = especialidad;
    }

    public String getnombre() 
    {
        return nombre;
    }

    public void setnombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String toString() 
    {
        return "\n Usuario: " + usuario +
                "\n Nombre: " + nombre +
                "\n CURP: " + curp +
                "\n Consultorio: " + consultorio +
                "\n Nombre del medico: " + medico +
                "\n Especialidad: " + especialidad;
    }
}

class Medico extends Datos_Medicos
{
    public Medico(String nombre, String id, String curp, String consultorio, String especialidad) 
    {
        super("Medico", nombre, id, curp, consultorio, especialidad);
    }
}

class Paciente extends Datos_Pacientes
{
    public Paciente(String nombre, String curp, String consultorio, String medico, String especialidad) 
    {
        super("Paciente", nombre, curp, consultorio, medico, especialidad);
    }
}

public class Hospital
{
    public static void main(String[] args) 
    {
        ArrayList<Datos_Medicos> listaDatos_Medicos = new ArrayList<Datos_Medicos>();
        ArrayList<Datos_Pacientes> listaDatos_Pacientes = new ArrayList<Datos_Pacientes>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;

        Medico Armando = new Medico ("Armando", "73264591", "ACUM458328MBUGDJN1", "1", "Cardiologia");
        listaDatos_Medicos.add(Armando);
        Medico Bianca = new Medico("Bianca", "95208561", "BVRI976509HVROHLD3", "1", "Gastroenterologia");
        listaDatos_Medicos.add(Bianca);
        Medico Carlos = new Medico ("Carlos", "75390138", "CGYN846204MJIGVRA2", "2", "Neumologia");
        listaDatos_Medicos.add(Carlos);
        Medico Denisse = new Medico ("Denisse", "34592058", "DURV758204HURCDL1", "2", "Pediatria");
        listaDatos_Medicos.add(Denisse);
        Medico Ernesto = new Medico ("Ernesto", "50928413", "EFOM856210HVRFPLA2", "3", "Psicologia");
        listaDatos_Medicos.add(Ernesto);
        Medico Francisca = new Medico ("Francisca", "20978417", "FYNI850240NITCREL1", "3", "Urologia");
        listaDatos_Medicos.add(Francisca);
        Medico Gerardo = new Medico ("Gerardo", "82571052", "GNUM875094GFTDING3", "4", "Ginecologia");
        listaDatos_Medicos.add(Gerardo);
        Medico Helga = new Medico ("Helga", "18590645", "HYBR509271JUNMJNBY2", "4", "Neurologia");
        listaDatos_Medicos.add(Helga);
        Medico Ignacio = new Medico ("Ignacio", "67035812", "IDEA851207MIPSTVA1", "5", "Nutricion");
        listaDatos_Medicos.add(Ignacio);
        Medico Jessie = new Medico ("Jessie", "70129802", "JOMN901267NIVTLNMA2", "5", "General");
        listaDatos_Medicos.add(Jessie);

        Paciente Kalen = new Paciente ("Kalen", "KIDB731803MJUGBTE1", "1", "Armando", "Cardiologia");
        listaDatos_Pacientes.add(Kalen);
        Paciente Laura = new Paciente ("Laura", "LUBM750230GTEVOLA2", "1", "Armando", "Cardiologia");
        listaDatos_Pacientes.add(Laura);
        Paciente Marcos = new Paciente ("Marcos", "MUVT750919HUNYLKN2", "1", "Bianca", "Gastroenterologia");
        listaDatos_Pacientes.add(Marcos);
        Paciente Nancy = new Paciente ("Nancy", "NDES075912BTDONLA1", "1", "Bianca", "Gastroenterologia");
        listaDatos_Pacientes.add(Nancy);
        Paciente Osvaldo = new Paciente ("Osvaldo", "OMJU354091JUVRALN3", "2", "Carlos", "Neumologia");
        listaDatos_Pacientes.add(Osvaldo);
        Paciente Patricia = new Paciente ("Patricia", "PUNF940134UBTHMPO2", "2", "Carlos", "Neumologia");
        listaDatos_Pacientes.add(Patricia);
        Paciente Rosa = new Paciente ("Rosa", "RTFB760345MINYBTV3", "2", "Denisse", "Pediatria");
        listaDatos_Pacientes.add(Rosa);
        Paciente Simon = new Paciente ("Simon", "SOMN609238HUNYRQS2", "2", "Denisse", "Pediatria");
        listaDatos_Pacientes.add(Simon);
        Paciente Teresa = new Paciente ("Teresa", "TGBI093267MINUBYVT1", "3", "Ernesto", "Psicologia");
        listaDatos_Pacientes.add(Teresa);
        Paciente Alfonso = new Paciente ("Alfonso", "ANUT870345ATCBPOU2", "3", "Ernesto", "Psicologia");
        listaDatos_Pacientes.add(Alfonso);
        Paciente Vanessa = new Paciente ("Vanessa", "VINY805432MINPARS2", "3", "Francisca", "Urologia");
        listaDatos_Pacientes.add(Vanessa);
        Paciente Valentin = new Paciente ("Valentin", "VTVU80209HYBUMST1", "3", "Francisca", "Urologia");
        listaDatos_Pacientes.add(Valentin);
        Paciente Cecilia = new Paciente ("Cecilia", "CNUL701298UBHYNTR2", "4", "Gerardo", "Ginecologia");
        listaDatos_Pacientes.add(Cecilia);
        Paciente Daniela = new Paciente ("Daniela", "DECU409238MINARNY3", "4", "Gerardo", "Ginecologia");
        listaDatos_Pacientes.add(Daniela);
        Paciente Dylan = new Paciente ("Dylan", "DCAS7093221NUMBAGT1", "4", "Helga", "Neurologia");
        listaDatos_Pacientes.add(Dylan);
        Paciente Esmeralda = new Paciente ("Esmeralda", "ENUV703201MIVCARC2", "4", "Helga", "Neurologia");
        listaDatos_Pacientes.add(Esmeralda);
        Paciente Francisco = new Paciente ("Francisco", "FLON6009321NVASINT3", "5", "Ignacio", "Nutricion");
        listaDatos_Pacientes.add(Francisco);
        Paciente Julian = new Paciente ("Julian", "JBTS223019GUNADCR1", "5", "Ignacio", "Nutricion");
        listaDatos_Pacientes.add(Julian);
        Paciente Laila = new Paciente ("Laila", "KBUN902345NUBTVCR1", "5", "Jessie", "General");
        listaDatos_Pacientes.add(Laila);
        Paciente Lucas = new Paciente ("Lucas", "LNAS809234NUPKNAT2", "5", "Jessie", "General");
        listaDatos_Pacientes.add(Lucas);

        do
        {
            System.out.println("\n SISTEMA DE BUSQUEDA ");
            System.out.println("\n Filtros de busqueda: ");
            System.out.println("1.- Nombre del paciente. ");
            System.out.println("2.- ID del medico. ");
            System.out.println("3.- Nombre del medico. ");
            System.out.println("4.- Salir. ");
            System.out.println("\n Eliga una de las opciones anteriores: ");
            opcion = teclado.nextInt();
            switch (opcion) 
            {
               case 1:
                    System.out.println("\n Ingresa el nombre del paciente: ");

                    Datos_Pacientes buscado_1 = findBynombre1(sc.nextLine(), listaDatos_Pacientes);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\n El paciente no esta registrado");
                    } else 
                      {
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("\n Ingresa el ID del Medico: ");

                    Datos_Medicos buscado_2 = findByid(sc.nextLine(), listaDatos_Medicos);

                    if (buscado_2 == null) 
                    {
                      System.out.println("\nEl medico no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_2.toString());
                      }
                    break;
                case 3:
                    System.out.println("\n Ingresa el nombre del medico: ");

                    Datos_Medicos buscado_3 = findBynombre2(sc.nextLine(), listaDatos_Medicos);

                    if (buscado_3 == null) 
                    {
                      System.out.println("\n El medico no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_3.toString());
                      }
                    break;
                case 4:
                    System.out.println("\n Busqueda terminada");
                    break;
            }
        } while (opcion != 4);
        teclado.close();
        sc.close();
    }

    public static Datos_Pacientes findBynombre1(String nombreUsuario, ArrayList<Datos_Pacientes> listaDatos_Pacientes) 
    {
        for (Datos_Pacientes usuario : listaDatos_Pacientes) 
        {
           if (usuario.getnombre().equals(nombreUsuario)) 
           {
               return usuario;
           }
       }
       return null;
    }

    public static Datos_Medicos findByid(String idMedico, ArrayList<Datos_Medicos> listaDatos_Medicos) 
    {
      for (Datos_Medicos id : listaDatos_Medicos) 
        {
            if (id.getid().equals(idMedico)) 
            {
                return id;
            }
        }
        return null;
    }

    public static Datos_Medicos findBynombre2(String nombreMedico, ArrayList<Datos_Medicos> listaDatos_Medicos) 
    {
      for (Datos_Medicos usuario : listaDatos_Medicos) 
        {
            if (usuario.getnombre().equals(nombreMedico)) 
            {
                return usuario;
            }
        }
        return null;
    }
}
