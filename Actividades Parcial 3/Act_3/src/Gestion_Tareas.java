import java.util.ArrayList;
import java.util.Scanner;

class Tareas
{
    int numero;
    String tarea;
    String estado;

    public Tareas()
    {

    }

    public Tareas(int numero, String tarea, String estado)
    {
        this.numero = numero;
        this.tarea = tarea;
        this.estado = estado;
    }

    public String toString()
    {
        return "\n" + numero + ".- " + "Tarea: " + tarea + "\nEstatus: " + estado;
    }

    public String getestado() 
    {
        return estado;
    }

    public int getnumero()
    {
        return numero;
    }

    public void setnumero(int numero) 
    {
        this.numero = numero;
    }

    public void settarea(String tarea) 
    {
        this.tarea = tarea;
    }

    public void setestado(String estado) 
    {
        this.estado = estado;
    }
}

public class Gestion_Tareas
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Tareas> listaTareas = new ArrayList<Tareas>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion, contador = 0, eliminar, modificar;

        
        Tareas info = new Tareas((contador = contador + 1), "Barrer las escaleras", "Pendiente");
        listaTareas.add(info);

        Tareas info2 = new Tareas((contador = contador + 1), "Barrer la sala", "Completada");
        listaTareas.add(info2);

        do
        {
            System.out.println("\nGESTOR DE TAREAS!!");
            System.out.println("\nOpciones: \n1.- Agregar nueva tarea \n2.- Ver lista de tareas \n3.- Marcar tarea como completada \n4.- Eliminar tareas \n5.- Salir");
            System.out.println("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    sc.nextLine();
                    Tareas infon = new Tareas();
                    infon.setnumero(contador = contador + 1);
                    System.out.println("Ingresa la tarea: ");
                    infon.settarea(sc.nextLine());
                    System.out.println("Ingresa el estatus de la tarea: ");
                    infon.setestado(sc.nextLine());
                    listaTareas.add(infon);
                    break;
                case 2:
                    System.out.println(listaTareas);
                    break;
                case 3:
                    Tareas buscado_33 = findByestado("Pendiente", listaTareas);

                    if (buscado_33 == null) 
                    {
                      System.out.println("\nTodas tus tareas han sido completadas");
                    } else                       
                      {
                        System.out.println("\n¿Qué tarea deseas marcar como Completada? ");
                        System.out.println("Escribe el número de tarea: ");
                        modificar = teclado.nextInt();
                        Tareas buscado_3 = findBynumero(modificar, listaTareas);

                        if (buscado_3 == null) 
                        {
                          System.out.println("Ese número de tarea no existe");
                        } else                       
                          {
                            buscado_3.estado = "Completado";
                          }
                      }
                    break;
                case 4:
                    System.out.println("\n¿Qué tarea deseas eliminar? ");
                    System.out.println("Escribe el número de tarea: ");
                    eliminar = teclado.nextInt();
                    Tareas buscado_4 = findBynumero(eliminar, listaTareas);

                    if (buscado_4 == null) 
                    {
                      System.out.println("Ese número de tarea no existe");
                    } else                       
                      {
                        listaTareas.remove(buscado_4);
                      }
                    break;
                case 5:
                    System.out.println("\nOperación finalizada\n\n");
                    break;
                default:
                    break;
            }
        }while (opcion != 5);

    teclado.close();
    sc.close();
}

    public static Tareas findByestado(String estado, ArrayList<Tareas> listaTareas) 
    {
        for (Tareas informacion : listaTareas) 
        {
           if (informacion.getestado().equals("Pendiente")) 
           {
               return informacion;
           }
       }
       return null;
    }

    public static Tareas findBynumero(int num, ArrayList<Tareas> listaTareas) 
    {
        for (Tareas informacion : listaTareas) 
        {
           if (informacion.getnumero() == (num)) 
           {
               return informacion;
           }
       }
       return null;
    }
}
