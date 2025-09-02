import java.util.ArrayList;
import java.util.Scanner;

class Datos_A
{
    String Nombre;
    String Raza;
    String Tamanio;
    String Peso;
    String Sonido;

    public Datos_A (String Nombre, String Raza, String Tamanio, String Peso, String Sonido)
    {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Tamanio = Tamanio;
        this.Peso = Peso;
        this.Sonido = Sonido;
    }

    public Datos_A()
    {

    }

    public String toString()
    {
        return "\n\nNombre: " + Nombre + "\nRaza: " + Raza + "\nTamaño: " + Tamanio + "\nPeso: " + Peso + "\nSonido: " + Sonido; 
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public void setRaza(String Raza)
    {
        this.Raza = Raza;
    }

    public void setTamanio(String Tamanio)
    {
        this.Tamanio = Tamanio;
    }

    public void setPeso(String Peso)
    {
        this.Peso = Peso;
    }

    public void setSonido(String Sonido)
    {
        this.Sonido = Sonido;
    }
}

public class Animales 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Datos_A> listaDatos_A = new ArrayList<Datos_A>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion;

        Datos_A info1 = new Datos_A("Perro", "Chihuahua", "15 - 23 cm", "1 - 3 kg", "Ladrido");
        listaDatos_A.add(info1);

        Datos_A info2 = new Datos_A("Erizo", "Moruno", "15 - 20 cm", "800 g", "Resoplido, Gruñido u Olisqueos");
        listaDatos_A.add(info2);

        Datos_A info3 = new Datos_A("Gato", "Ashera", "1.5 m", "12 - 15 kg", "Maullido");
        listaDatos_A.add(info3);

        Datos_A info4 = new Datos_A("Conejo", "Belier", "20 - 50 cm", "5 - 7 kg", "Gruñido, Chillido, Resoplido o Ronroneo");
        listaDatos_A.add(info4);

        Datos_A info5 = new Datos_A("Tiburon", "Tintorera", "1.8 - 3.5 m", "200 kg", "Gruñido o Rugido");
        listaDatos_A.add(info5);

        Datos_A info6 = new Datos_A("Gallina", "Australorp", "Mediano a Grande", "3.8 - 4.5 kg", "Cacareo");
        listaDatos_A.add(info6);

        Datos_A info7 = new Datos_A("Rana", "Toro africana", "20 cm", "2 kg", "Silbidos");
        listaDatos_A.add(info7);

        Datos_A info8 = new Datos_A("Medusa", "Aguamala", "1 m", "Ligero", "-");
        listaDatos_A.add(info8);

        Datos_A info9 = new Datos_A("Caballo", "Appaloosa", "1.42 - 1.62 m", "500 - 600 kg", "Relinchar o Bufar");
        listaDatos_A.add(info9);

        Datos_A info10 = new Datos_A("Cuyo", "Himalaya", "20 - 30 cm", "1.6 kg", "Arrullo");
        listaDatos_A.add(info10);

        Datos_A info11 = new Datos_A("Oso", "Panda", "1.4 - 1.8 m", "150 kg", "Gruñido");
        listaDatos_A.add(info11);

        Datos_A info12 = new Datos_A("Zorro", "Rojo", "45 - 90 cm", "3 - 14 kg", "Gañido");
        listaDatos_A.add(info12);

        Datos_A info13 = new Datos_A("Lobo", "Gris", "1.3 - 2 m", "70 k", "Aullido");
        listaDatos_A.add(info13);

        Datos_A info14 = new Datos_A("Leopardo", "Árabe", "1.8 - 2 m", "30 k", "Gruñido, Maullido o Ronroneo");
        listaDatos_A.add(info14);

        Datos_A info15 = new Datos_A("Loro", "Eclectus", "10 - 13 cm", "500 - 600 g", "Graznido o Carreo");
        listaDatos_A.add(info15);

        do 
        {
            System.out.println("\n\nMENU FICHAS ANIMALES \n1.- VER FICHAS \n2.- AGREGAR FICHA \n3.- EDITAR FICHA \n4.- SALIR");
            System.out.println("Selecciona la opción que deseas realizar: ");
            opcion = teclado.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.println(listaDatos_A);
                    break;
                case 2:
                    sc.nextLine();
                    Datos_A info = new Datos_A();
                    System.out.println("Ingresa el nombre del animal: ");
                    info.setNombre(sc.nextLine());
                    System.out.println("Ingresa su raza: ");
                    info.setRaza(sc.nextLine());
                    System.out.println("Ingresa su tamaño: ");
                    info.setTamanio(sc.nextLine());
                    System.out.println("Ingresa su peso: ");
                    info.setPeso(sc.nextLine());
                    System.out.println("Ingresa el sonido que hace: ");
                    info.setSonido(sc.nextLine());
                    listaDatos_A.add(info);
                    break;
                case 3:
                    System.out.println("\nIngresa el nombre del animal cuya ficha quieres modificar: ");
                    String modifi = sc.nextLine();
                    Datos_A buscado = findByNombre(modifi, listaDatos_A);

                    if (buscado == null) 
                    {
                      System.out.println("No existe una ficha de ese animal");
                    } else                       
                      {
                        System.out.println("\nFicha a corregir:" + buscado.toString());
                        System.out.println("\n\nDato a modificar \n1.- Nombre \n2.- Raza \n3.- Tamaño \n4.- Peso \n5.- Sonido");
                        System.out.println("¿Qué dato deseas modificar?");
                        int mod = teclado.nextInt();
                        
                        switch (mod) 
                        {
                            case 1:
                                System.out.println("Ingresa el nombre corregido: ");
                                buscado.Nombre = sc.nextLine();
                                break;
                            case 2:
                                System.out.println("Ingresa la raza corregido: ");
                                buscado.Raza = sc.nextLine();
                                break;
                            case 3:
                                System.out.println("Ingresa el tamaño corregido: ");
                                buscado.Tamanio = sc.nextLine();
                                break;
                            case 4:
                                System.out.println("Ingresa el peso corregido: ");
                                buscado.Peso = sc.nextLine();
                                break;
                            case 5:
                                System.out.println("Ingresa el sonido corregido: ");
                                buscado.Sonido = sc.nextLine();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Nueva ficha: " + buscado.toString());
                      }
                    break;
                case 4:
                    System.out.println("\nOperación finalizada\n\n");
                    break;
                default:
                    break;
            }
        } while (opcion != 4);

        teclado.close();
        sc.close();
    }

    public static Datos_A findByNombre(String modifi, ArrayList<Datos_A> listaDatos_A) 
    {
        for (Datos_A informacion : listaDatos_A) 
        {
           if (informacion.getNombre().equals(modifi)) 
           {
               return informacion;
           }
       }
       return null;
    }
}