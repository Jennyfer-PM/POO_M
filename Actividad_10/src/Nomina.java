import java.util.ArrayList;
import java.util.Scanner;

class Datos_Nomina
{
    String tipo;
    String nombre;
    String clave;
    String departamento;
    String puesto;
    String rfc;
    String curp;
    String nss;
    String sueldo_diario;
    String isr;
    String cuota_imss;
    String despensa;
    String hor_ext_simp;
    String hor_ext_dob;
    String hor_ext_trp;
    String sueldo_neto;

    public Datos_Nomina(String tipo, String nombre, String clave, String departamento, String puesto, String rfc, 
                        String curp, String nss, String sueldo_diario, String isr, String cuota_imss, String despensa, 
                        String hor_ext_simp, String hor_ext_dob, String hor_ext_trp, String sueldo_neto) 
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.clave = clave;
        this.departamento = departamento;
        this.puesto = puesto;
        this.rfc = rfc;
        this.curp = curp;
        this.nss = nss;
        this.sueldo_diario = sueldo_diario;
        this.isr = isr;
        this.cuota_imss = cuota_imss;
        this.despensa = despensa;
        this.hor_ext_simp = hor_ext_simp;
        this.hor_ext_dob = hor_ext_dob;
        this.hor_ext_trp = hor_ext_trp;
        this.sueldo_neto = sueldo_neto;
    }

    public String toString() 
    {
        return "\n Tipo: " + tipo +
                "\n Nombre: " + nombre +
                "\n Clave de emplado: " + clave +
                "\n Departamento: " + departamento +
                "\n Puesto: " + puesto +
                "\n RFC: " + rfc +
                "\n CURP: " + curp +
                "\n NSS: " + nss +
                "\n Sueldo por día: " + sueldo_diario +
                "\n Descuento por ISR: " + isr +
                "\n Descuento por cuota del IMSS : " + cuota_imss +
                "\n Extra Despensa: " + despensa +
                "\n Horas extras simples trabajadas: " + hor_ext_simp +
                "\n Horas extras dobles trabajadas: " + hor_ext_dob +
                "\n Horas extras triples trabajadas: " + hor_ext_trp +
                "\n Sueldo total quincenal: " + sueldo_neto;
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

class Empleado extends Datos_Nomina
{
    public Empleado(String nombre, String clave, String departamento, String puesto, String rfc, String curp, 
                    String nss, String sueldo_diario, String isr, String cuota_imss, String despensa, 
                    String hor_ext_simp, String hor_ext_dob, String hor_ext_trp, String sueldo_neto)
    {
        super("Empleado", nombre, clave, departamento, puesto, rfc, curp, nss, sueldo_diario, isr, cuota_imss,
                           despensa, hor_ext_simp, hor_ext_dob, hor_ext_trp, sueldo_neto);
    }
}

public class Nomina
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Datos_Nomina> listaDatos_Nomina = new ArrayList<Datos_Nomina>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;

        Empleado Armando = new Empleado ("Armando Sauces Mendoza", "73264591", "Finanzas", 
                                         "Analista financiero", "SAMA871114G73", "SAMA871114HVZJNTA1", 
                                         "03227566162", "1206.97$", "3229.37$", "608.98$", 
                                         "485.00$", "No aplica", "No aplica", 
                                         "No aplica", "14,751.20$");
        listaDatos_Nomina.add(Armando);
        Empleado Bianca = new Empleado ("Bianca Gutierrez Sineros", "68642482", "Recursos humanos", 
                                        "Asistente de RRHH", "GUSB910327C90", "GUSB910327MMXHOLN2", 
                                        "74092376612", "1206.97$", "3229.37$", "608.98$", 
                                        "485.00$", "2 = 301.74$", "No aplica", 
                                        "No aplica", "15,052.94$");
        listaDatos_Nomina.add(Bianca);
        Empleado Carlos = new Empleado ("Carlos Torres Perciles", "29558562", "Logística", 
                                        "Jefe de almacén", "TOPC971230L12", "TOPC971230HGDHNPZT3", 
                                        "75092215678", "1206.97$", "3229.37$", "608.98$", 
                                        "485.00$", "3 = 452.61$", "3 = 905.22", 
                                        "1 = 452.61", "16,561.64");
        listaDatos_Nomina.add(Carlos);
        Empleado Daniel = new Empleado ("Daniel Solis Flores", "57382042", "Marketing", 
                                        "Diseñador Gráfico", "SOFD010512X53", "SOFD010512HVZENPL1", 
                                        "36092312789", "1206.97$", "3229.37$", "608.98$", 
                                        "485.00$", "5 = 754.35$", "1 = 301.74", 
                                        "No aplica", "15,807.29$");
        listaDatos_Nomina.add(Daniel);
        Empleado Ernesto = new Empleado ("Ernesto Santos Bedolla", "39582732", "Producción",  
                                         "Operador de maquinaria", "SABE940824F57", "SABE940824HMXSNUL2", 
                                         "750933271", "1206.97$", "3229.37$", "608.98$", 
                                         "485.00$", "6 = 905.22$", "4 = 1206.96", 
                                         "2 = 905.22$", "17,768.60$");
        listaDatos_Nomina.add(Ernesto);

        do 
        {
            System.out.println("\n BUSQUEDA DE NOMINA");
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

                    Datos_Nomina buscado_1 = findBynombre(sc.nextLine(), listaDatos_Nomina);

                    if (buscado_1 == null) 
                    {
                      System.out.println("\n No se encontro ninguna nomina con ese nombre");
                    } else 
                      {
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("\n Ingresa la clave del empleado: ");

                    Datos_Nomina buscado_2 = findByclave(sc.nextLine(), listaDatos_Nomina);

                    if (buscado_2 == null) 
                    {
                      System.out.println("\n No se encontro ninguna nomina con esa clave");
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

    public static Datos_Nomina findBynombre(String nombreUsuario, ArrayList<Datos_Nomina> listaDatos_Nomina) 
    {
        for (Datos_Nomina nombre_emp : listaDatos_Nomina) 
        {
           if (nombre_emp.getnombre().equals(nombreUsuario)) 
           {
               return nombre_emp;
           }
       }
       return null;
    }

    public static Datos_Nomina findByclave(String clav, ArrayList<Datos_Nomina> listaDatos_Nomina) 
    {
        for (Datos_Nomina clave_emp : listaDatos_Nomina) 
        {
           if (clave_emp.getclave().equals(clav)) 
           {
               return clave_emp;
           }
       }
       return null;
    }
}
