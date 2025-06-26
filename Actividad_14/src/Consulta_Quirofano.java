import java.util.ArrayList;
import java.util.Scanner;

class Datos
{
    String Quirofano;
    String Fecha;
    String Titular;
    String ID;
    String Especialidad;
    String Enfermeras;
    String Anestesiologo;
    String Material;
    String Paciente;
    String Habitacion;

    public Datos()
    {

    }

    public Datos(String Quirofano, String Fecha, String Titular, String ID, String Especialidad, String Enfermeras, 
                 String Anestesiologo, String Material, String Paciente, String Habitacion) 
    {
        this.Quirofano = Quirofano;
        this.Fecha = Fecha;
        this.Titular = Titular;
        this.ID = ID;
        this.Especialidad = Especialidad;
        this.Enfermeras = Enfermeras;
        this.Anestesiologo = Anestesiologo;
        this.Material = Material;
        this.Paciente = Paciente;
        this.Habitacion = Habitacion;
    }

    public String toString() 
    {
        return "\n Quirofano: " + Quirofano +
                "\n Fecha: " + Fecha +
                "\n Titular: " + Titular +
                "\n ID: " + ID +
                "\n Especialidad: " + Especialidad +
                "\n Enfermeras: " + Enfermeras +
                "\n Anestesiologo: " + Anestesiologo +
                "\n Material: " + Material +
                "\n Paciente: " + Paciente +
                "\n Habitación: " + Habitacion;
    }

    public String getFecha() 
    {
        return Fecha;
    }

    public void setQuirofano(String Quirofano) 
    {
        this.Quirofano = Quirofano;
    }

    public void setFecha(String Fecha) 
    {
        this.Fecha = Fecha;
    }

    public void setTitular(String Titular) 
    {
        this.Titular = Titular;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public void setEspecialidad(String Especialidad) 
    {
        this.Especialidad = Especialidad;
    }

    public void setEnfermeras(String Enfermeras) 
    {
        this.Enfermeras = Enfermeras;
    }

    public void setAnestesiologo(String Anestesiologo) 
    {
        this.Anestesiologo = Anestesiologo;
    }

    public void setMaterial(String Material) 
    {
        this.Material = Material;
    }

    public void setPaciente(String Paciente) 
    {
        this.Paciente = Paciente;
    }

    public void setHabitacion(String Habitacion) 
    {
        this.Habitacion = Habitacion;
    }
}

class A extends Datos
{
    public A()
    {

    }
}

class B extends Datos
{
    public B()
    {

    }
}

class C extends Datos
{
    public C()
    {

    }
}

class D extends Datos
{
    public D()
    {

    }
}

class E extends Datos
{
    public E()
    {

    }
}

public class Consulta_Quirofano
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<A> listaA = new ArrayList<A>();
        ArrayList<B> listaB = new ArrayList<B>();
        ArrayList<C> listaC = new ArrayList<C>();
        ArrayList<D> listaD = new ArrayList<D>();
        ArrayList<E> listaE = new ArrayList<E>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;
        char Respuesta;

        do 
        {
            System.out.println("\n DISPONIBILIDAD DE QUIROFANOS");
            System.out.println("\n Opciones: ");
            System.out.println("1.- QUIROFANO A ");
            System.out.println("2.- QUIROFANO B ");
            System.out.println("3.- QUIROFANO C ");
            System.out.println("4.- QUIROFANO D ");
            System.out.println("5.- QUIROFANO E ");
            System.out.println("6.- Salir ");
            System.out.println("Seleccione una de las opciones anteriores: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("\n Ingresa el horario: ");

                    A buscado_1 = findByFecha(sc.nextLine(), listaA);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\n El horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        A info = new A();
                        info.setQuirofano("A");
                        System.out.println("Fecha: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Medico Titular: ");
                        info.setTitular(sc.nextLine());
                        System.out.println("ID del medico: ");
                        info.setID(sc.nextLine());
                        System.out.println("Especialidad: ");
                        info.setEspecialidad(sc.nextLine());
                        System.out.println("Enfermeras: ");
                        info.setEnfermeras(sc.nextLine());
                        System.out.println("Anestesiologo: ");
                        info.setAnestesiologo(sc.nextLine());
                        System.out.println("Materiales: ");
                        info.setMaterial(sc.nextLine());
                        System.out.println("Paciente: ");
                        info.setPaciente(sc.nextLine());
                        System.out.println("Habitación del paciente: ");
                        info.setHabitacion(sc.nextLine());
                        
                        listaA.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("\n Ingresa el horario: ");

                    B buscado_2 = findByFecha2(sc.nextLine(), listaB);

                    if (buscado_2 == null) 
                    {
                      System.out.println("\n El horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        B info = new B();
                        info.setQuirofano("B");
                        System.out.println("Fecha: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Medico Titular: ");
                        info.setTitular(sc.nextLine());
                        System.out.println("ID del medico: ");
                        info.setID(sc.nextLine());
                        System.out.println("Especialidad: ");
                        info.setEspecialidad(sc.nextLine());
                        System.out.println("Enfermeras: ");
                        info.setEnfermeras(sc.nextLine());
                        System.out.println("Anestesiologo: ");
                        info.setAnestesiologo(sc.nextLine());
                        System.out.println("Materiales: ");
                        info.setMaterial(sc.nextLine());
                        System.out.println("Paciente: ");
                        info.setPaciente(sc.nextLine());
                        System.out.println("Habitación del paciente: ");
                        info.setHabitacion(sc.nextLine());
                        
                        listaB.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_2.toString());
                      }
                    break;
                case 3:
                    System.out.println("\n Ingresa el horario: ");

                    C buscado_3 = findByFecha3(sc.nextLine(), listaC);

                    if (buscado_3 == null) 
                    {
                      System.out.println("\n El horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        C info = new C();
                        info.setQuirofano("C");
                        System.out.println("Fecha: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Medico Titular: ");
                        info.setTitular(sc.nextLine());
                        System.out.println("ID del medico: ");
                        info.setID(sc.nextLine());
                        System.out.println("Especialidad: ");
                        info.setEspecialidad(sc.nextLine());
                        System.out.println("Enfermeras: ");
                        info.setEnfermeras(sc.nextLine());
                        System.out.println("Anestesiologo: ");
                        info.setAnestesiologo(sc.nextLine());
                        System.out.println("Materiales: ");
                        info.setMaterial(sc.nextLine());
                        System.out.println("Paciente: ");
                        info.setPaciente(sc.nextLine());
                        System.out.println("Habitación del paciente: ");
                        info.setHabitacion(sc.nextLine());
                        
                        listaC.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_3.toString());
                      }
                    break;
                case 4:
                    System.out.println("\n Ingresa el horario: ");

                    D buscado_4 = findByFecha4(sc.nextLine(), listaD);

                    if (buscado_4 == null) 
                    {
                      System.out.println("\n El horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        D info = new D();
                        info.setQuirofano("D");
                        System.out.println("Fecha: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Medico Titular: ");
                        info.setTitular(sc.nextLine());
                        System.out.println("ID del medico: ");
                        info.setID(sc.nextLine());
                        System.out.println("Especialidad: ");
                        info.setEspecialidad(sc.nextLine());
                        System.out.println("Enfermeras: ");
                        info.setEnfermeras(sc.nextLine());
                        System.out.println("Anestesiologo: ");
                        info.setAnestesiologo(sc.nextLine());
                        System.out.println("Materiales: ");
                        info.setMaterial(sc.nextLine());
                        System.out.println("Paciente: ");
                        info.setPaciente(sc.nextLine());
                        System.out.println("Habitación del paciente: ");
                        info.setHabitacion(sc.nextLine());
                        
                        listaD.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_4.toString());
                      }
                    break;
                case 5:
                    System.out.println("\n Ingresa el horario: ");

                    E buscado_5 = findByFecha5(sc.nextLine(), listaE);

                    if (buscado_5 == null) 
                    {
                      System.out.println("\n El horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        E info = new E();
                        info.setQuirofano("E");
                        System.out.println("Fecha: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Medico Titular: ");
                        info.setTitular(sc.nextLine());
                        System.out.println("ID del medico: ");
                        info.setID(sc.nextLine());
                        System.out.println("Especialidad: ");
                        info.setEspecialidad(sc.nextLine());
                        System.out.println("Enfermeras: ");
                        info.setEnfermeras(sc.nextLine());
                        System.out.println("Anestesiologo: ");
                        info.setAnestesiologo(sc.nextLine());
                        System.out.println("Materiales: ");
                        info.setMaterial(sc.nextLine());
                        System.out.println("Paciente: ");
                        info.setPaciente(sc.nextLine());
                        System.out.println("Habitación del paciente: ");
                        info.setHabitacion(sc.nextLine());
                        
                        listaE.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_5.toString());
                      }
                    break;
                case 6:
                    System.out.println("\n PROCEDIMIENTO TERMINADO");
                    break;
                default:
                    break;
            }

        } while (opcion != 6);
        
        teclado.close();
        sc.close();

    }

    public static A findByFecha(String horario, ArrayList<A> listaA) 
    {
        for (A informacion : listaA) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static B findByFecha2(String horario, ArrayList<B> listaB) 
    {
        for (B informacion : listaB) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static C findByFecha3(String horario, ArrayList<C> listaC) 
    {
        for (C informacion : listaC) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static D findByFecha4(String horario, ArrayList<D> listaD) 
    {
        for (D informacion : listaD) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static E findByFecha5(String horario, ArrayList<E> listaE) 
    {
        for (E informacion : listaE) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }
}
