import java.util.ArrayList;
import java.util.Scanner;

class Datos
{
    String Nombre;
    String Apellido;
    String ID_Cliente;
    String RFC;
    String Placa;
    String Marca;
    String Modelo;
    String Tipo;
    String Transmision;
    String Kilometraje;
    String Color;

    public Datos()
    {

    }

    public Datos(String Nombre, String Apellido, String ID_Cliente, String RFC, String Placa, String Marca, String Modelo,
                 String Tipo, String Transmision, String Kilometraje, String Color)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID_Cliente = ID_Cliente;
        this.RFC = RFC;
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.Transmision = Transmision;
        this.Kilometraje = Kilometraje;
        this.Color = Color;
    }

    public String toString()
    {
        return "\nDATOS CLIENTE \n\nNombre/s: " + Nombre + "\nApellidos: " + Apellido + "\nID: " + ID_Cliente +
               "\nRFC: " + RFC + "\n\nDATOS DEL VEHICULO \nPlaca: " + Placa + "\nMarca: " + Marca + "\nModelo: " + Modelo +
               "\nTipo: " + Tipo + "\nTransmision: " + Transmision + "\nKilometraje: " + Kilometraje + "\nColor: " + Color;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }

    public void setID_Cliente(String ID_Cliente) 
    {
        this.ID_Cliente = ID_Cliente;
    }

    public void setRFC(String RFC) 
    {
        this.RFC = RFC;
    }

    public void setPlaca(String Placa) 
    {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) 
    {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) 
    {
        this.Modelo = Modelo;
    }

    public void setTipo(String Tipo) 
    {
        this.Tipo = Tipo;
    }

    public void setTransmision(String Transmision) 
    {
        this.Transmision = Transmision;
    }

    public void setKilometraje(String Kilometraje) 
    {
        this.Kilometraje = Kilometraje;
    }

    public void setColor(String Color) 
    {
        this.Color = Color;
    }
}

public class Taller
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Datos> listaDatos = new ArrayList<Datos>();

        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        int opcion, procedimiento;
        char frecuente, nuevo;
        double descuento = 1, precio;

        do
        {
            System.out.println("MENÚ TALLER ");
            System.out.println("\nOPCIONES: \n1.- Ingresar Datos Clientes \n2.- Ver Datos Clientes \n3.- Factura \n4.-Salir");
            System.out.println("\nSeleccione una de las opciones anteriores: ");
            opcion = teclado.nextInt();

            switch (opcion) 
            {
                case 1:
                    Datos info = new Datos();

                    System.out.println("\nINGRESA LOS DATOS DEL CLIENTE: ");
                    System.out.println("\nNombre: ");
                    info.setNombre(sc.nextLine());
                    System.out.println("Apellidos: ");
                    info.setApellido(sc.nextLine());
                    System.out.println("ID: ");
                    info.setID_Cliente(sc.nextLine());
                    System.out.println("RFC: ");
                    info.setRFC(sc.nextLine());
                    System.out.println("\nINGRESA LOS DATOS DEL VEHICULO");
                    System.out.println("\nPlaca: ");
                    info.setPlaca(sc.nextLine());
                    System.out.println("\nMarca: ");
                    info.setMarca(sc.nextLine());
                    System.out.println("\nModelo: ");
                    info.setModelo(sc.nextLine());
                    System.out.println("\nTipo: ");
                    info.setTipo(sc.nextLine());
                    System.out.println("\nTransmision: ");
                    info.setTransmision(sc.nextLine());
                    System.out.println("\nKilometraje: ");
                    info.setKilometraje(sc.nextLine());
                    System.out.println("\nColor: ");
                    info.setColor(sc.nextLine());
                        
                    listaDatos.add(info);
                    break;
                case 2:
                    System.out.println(listaDatos);
                    break;
                case 3:
                    System.out.println("\n¿El cliente es frecuente? (S/N) ");
                    frecuente = (char)System.in.read();
                    if (frecuente == 'S')
                    {
                        descuento = .08;
                    } else
                      {
                        System.out.println("\n¿El cliente es nuevo? (S/N) ");
                        nuevo = (char)System.in.read();
                        if (nuevo == 'S')
                        {
                            descuento = .05;
                        }
                      }
                      
                    System.out.println("\nIndique el tipo de procedimiento: ");
                    System.out.println("\n1.-Frenos \n2.-Cambio de aceite \n3.-Cambio de bujias y filtro \n4.- Cambio de neumaticos \n5.- Alineación y balanceo \n6.- Cambio de banda de distribución \n7.- Mantenimiento de aire acondicionado");
                    System.out.println("Procedimiento: ");
                    procedimiento = teclado.nextInt();
                    switch (procedimiento) 
                    {
                        case 1:
                            precio = 700;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Frenos");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 2:
                            precio = 900;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Cambio de aceite");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 3:
                            precio = 1350;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Cambio de bujias y filtros");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 4:
                            precio = 3950;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Cambio de neumaticos");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 5:
                            precio = 1500;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Alineación y balanceo");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 6:
                            precio = 250;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Cambio de banda de distribución");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        case 7:
                            precio = 600;
                            System.out.println("\n\nFACTURA: ");
                            System.out.println("\nProcedimiento: Mantenimiento de aire acondicionado");
                            System.out.println("\nPrecio: " + precio);
                            if (descuento != 0)
                            {
                                System.out.println("\nDescuento: " + (descuento * 100) + "%");
                                System.out.println("Total a pagar = " + (precio - (precio * descuento)) + "$");
                            }
                            System.out.println("Total a pagar = " + precio + "$");
                            break;
                        default:
                            break;
                    }
                    System.out.println("\n\nFACTURA");
                    System.out.println("");
                    break;
                default:
                    System.out.println("\n\nPRODECIMIENTO TERMINADO");
                    break;
            }
            if(opcion == 4)
            {
                sc.close();
                teclado.close();
            }
        } while (opcion != 4);
    }
}
