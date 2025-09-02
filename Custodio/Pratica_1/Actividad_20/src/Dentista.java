import java.util.ArrayList;
import java.util.Scanner;

class Agenda
{
    String Fecha;
    String Nombre;
    String Curp;
    String Padecimiento;
    String Tratamiento;

    public Agenda()
    {

    }

    public Agenda (String Fecha, String Nombre, String Curp, String Padecimiento, String Tratamiento)
    {
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Curp = Curp;
        this.Padecimiento = Padecimiento;
        this.Tratamiento = Tratamiento;
    }

    public String toString()
    {
        return "\nFecha: " + Fecha + "\nNombre del paciente: " + Nombre + "\nCURP: " + Curp + 
               "\nPadecimiento o alergia: " + Padecimiento + "\nTratamiento a realizar: " + Tratamiento;
    }

    public String getFecha() 
    {
        return Fecha;
    }

    public void setFecha(String Fecha) 
    {
        this.Fecha = Fecha;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setCurp(String Curp) 
    {
        this.Curp = Curp;
    }

    public void setPadecimiento(String Padecimiento) 
    {
        this.Padecimiento = Padecimiento;
    }

    public void setTratamiento(String Tratamiento) 
    {
        this.Tratamiento = Tratamiento;
    }

}

class Factura
{
    String NombreM;
    String NombreP;
    String RFC;
    String FechaF;
    String Concepto;

    public Factura()
    {

    }

    public Factura (String NombreM, String NombreP, String RFC, String FechaF, String Concepto)
    {
        this.NombreM = NombreM;
        this.NombreP = NombreP;
        this.RFC = RFC;
        this.FechaF = FechaF;
        this.Concepto = Concepto;
    }

    public String toString()
    {
        return "\nNombre del medico: " + NombreM + "\nNombre del paciente: " + NombreP + "\nRFC paciente: " + RFC +
               "\nFecha consulta: " + FechaF + "\nConcepto: " + Concepto;
    }

    public void setNombreM(String NombreM) 
    {
        this.NombreM = NombreM;
    }

    public void setNombreP(String NombreP) 
    {
        this.NombreP = NombreP;
    }

    public void setRFC(String RFC) 
    {
        this.RFC = RFC;
    }

    public void setFechaF(String FechaF) 
    {
        this.FechaF = FechaF;
    }

    public void setConcepto(String Concepto) 
    {
        this.Concepto = Concepto;
    }

}

public class Dentista
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Agenda> listaAgenda = new ArrayList<Agenda>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion, Costo;
        char Respuesta;
        double IVA, Total;

        do 
        {
            System.out.println("\nMENÚ CONSULTORIO");
            System.out.println("\n1.- Mostrar Agenda. \n2.- Agendar. \n3.- Generar Factura \n4.- Salir");
            System.out.println("Selecciona una de las opciones anteriores: ");
            opcion = teclado.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.println(listaAgenda);
                    break;
                case 2:
                    System.out.println("\nIngresa el horario: ");
                    Agenda buscado_1 = findByFecha(sc.nextLine(), listaAgenda);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\nEl horario esta disponible, ¿deseas agendar? (S/N)");
                      Respuesta = (char)System.in.read();
                      if (Respuesta == 'S')
                      {
                        sc.nextLine();
                        Agenda info = new Agenda();
                        System.out.println("Ingresa la fecha de la consulta: ");
                        info.setFecha(sc.nextLine());
                        System.out.println("Ingresa el nombre del paciente: ");
                        info.setNombre(sc.nextLine());
                        System.out.println("Ingresa el CURP del paciente: ");
                        info.setCurp(sc.nextLine());
                        System.out.println("Ingresa el padecimiento: ");
                        info.setPadecimiento(sc.nextLine());
                        System.out.println("Tratamiento que se va realizar: ");
                        info.setTratamiento(sc.nextLine());
                        
                        listaAgenda.add(info);
                      }
                    } else 
                      {
                        System.out.println("El horario esta ocupado por:");
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 3:
                      Factura fact = new Factura();
                      System.out.println("Ingresa el nombre del medico: ");
                      fact.setNombreM(sc.nextLine());
                      System.out.println("Ingresa el nombre del paciente: ");
                      fact.setNombreP(sc.nextLine());
                      System.out.println("RFC: ");
                      fact.setRFC(sc.nextLine());
                      System.out.println("Fecha: ");
                      fact.setFechaF(sc.nextLine());
                      System.out.println("Concepto: ");
                      fact.setConcepto(sc.nextLine());
                      System.out.println("Costo del tratamiento: ");
                      Costo = teclado.nextInt();
                      IVA = (Costo * 0.16);
                      Total = Costo + IVA;

                      System.out.println("\n\nFACTURA: ");
                      System.out.println(fact.toString() + "\nCosto: " + Costo + "\nImpuestos: " + IVA + "\nTotal: " + Total);
                    break;
                case 4:
                    System.out.println("\n\nCONSULTA FINALIZADA\n");
                    break;
                default:
                    break;
            }
        } while (opcion != 4);

        teclado.close();
        sc.close();
    }

    public static Agenda findByFecha(String horario, ArrayList<Agenda> listaAgenda) 
    {
        for (Agenda informacion : listaAgenda) 
        {
           if (informacion.getFecha().equals(horario)) 
           {
               return informacion;
           }
       }
       return null;
    }
}
