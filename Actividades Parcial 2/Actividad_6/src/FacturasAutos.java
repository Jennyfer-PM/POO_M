import java.util.Scanner;

public class FacturasAutos
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        String RFC_Emisor = "97E45F79";
        String Nombre_Emisor = "Nissan";
        String Regimen_Emisor = "601 - Régimen General de Ley Personas Morales";
        String Direccion_Emisor = "Blvd. Bernardo Quintana Arrioja 5113, San Pablo, 76130 Santiago de Querétaro, Qro.";

        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("RFC: ");
        String RFC_Cliente = sc.nextLine();
        System.out.println("Nombre: ");
        String Nombre_Cliente = sc.nextLine();
        System.out.println("Régimen fiscal: ");
        String Regimen_Cliente = sc.nextLine();
        System.out.println("Uso de CFDI");
        String CFDI_Cliente = sc.nextLine();
        System.out.println("Dirección: ");
        String Direccion_Cliente = sc.nextLine();

        System.out.println("Ingrese los datos de la factura: ");
        System.out.println("Folio: ");
        String Folio = sc.nextLine();
        System.out.println("Fecha: ");
        String Fecha = sc.nextLine();
        System.out.println("Marca: ");
        String Marca = sc.nextLine();
        System.out.println("Modelo: ");
        String Modelo = sc.nextLine();
        System.out.println("Año: ");
        String Anio = sc.nextLine();
        System.out.println("Version: ");
        String Version = sc.nextLine();
        System.out.println("Color exterior: ");
        String Color_Exterior = sc.nextLine();
        System.out.println("Color interior: ");
        String Color_Interior = sc.nextLine();
        System.out.println("Tipo: ");
        String Tipo = sc.nextLine();
        System.out.println("Puertas: ");
        String Puertas = sc.nextLine();
        System.out.println("Pasajeros: ");
        String Pasajeros = sc.nextLine();
        System.out.println("Combustible: ");
        String Combustible = sc.nextLine();
        System.out.println("Cilindros: ");
        String Cilindros = sc.nextLine();
        System.out.println("Número de Motor: ");
        String No_Motor = sc.nextLine();
        System.out.println("Número de Serie: ");
        String No_Serie = sc.nextLine();

        sc.close();

        System.out.println("\n FACTURA \n");
        System.out.println("Factura emitida el " + Fecha + " con el Folio " + Folio + 
        " por la empresa " + Nombre_Emisor + " con los siguientes datos: ");
        System.out.println("RFC: " + RFC_Emisor);
        System.out.println("Régimen Fiscal: " + Regimen_Emisor);
        System.out.println("Dirección: " + Direccion_Emisor);
        System.out.println("Para el cliente: " + Nombre_Cliente + " con los siguientes datos: ");
        System.out.println("RFC: " + RFC_Cliente);
        System.out.println("Regímen Fiscal: " + Regimen_Cliente);
        System.out.println("Uso de CFDI: " + CFDI_Cliente);
        System.out.println("Dirección: " + Direccion_Cliente);
        System.out.println("Por el auto con marca " + Marca + ", modelo " + Modelo + " del año " + Anio +
        " versión " + Version + ", con las siguientes características, color exterior " + Color_Exterior +
        ", color interior " + Color_Interior + ", del tipo " + Tipo + " con " + Puertas + 
        " puertas con la capacidad para " + Pasajeros + " pasajeros, usa combustible " + Combustible + 
        " , el auto es de " + Cilindros + " cilindros, por ultimo, su número de motor es " + No_Motor +
        " y su número de serie es " + No_Serie);
        System.out.println("¡GRACIAS POR SU COMPRA!");
        
    }
}