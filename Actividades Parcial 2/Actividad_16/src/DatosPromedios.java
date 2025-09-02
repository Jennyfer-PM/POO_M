import java.util.ArrayList;
import java.util.Scanner;

class Alumnos
{
    String Nombre;
    String Matricula;

    public Alumnos (String Nombre, String Matricula)
    {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
    }

    public Alumnos()
    {

    }

    public String toString()
    {
        return "\nNombre del alumno: " + Nombre +
               "\nMatricula correspondiente: " + Matricula;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setMatricula(String Matricula) 
    {
        this.Matricula = Matricula;
    }

}

public class DatosPromedios
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        Float promedio[], suma = (float) 0, total;
        promedio = new Float[20];
        int reprobados = 0, contador;

        Alumnos Armando = new Alumnos("Armando Sauces Mendoza", "73264591");
        listaAlumnos.add(Armando);
        System.out.println("Ingresa el promedio de Armando: ");
        promedio[0] = teclado.nextFloat();
        Alumnos Bianca = new Alumnos("Bianca Gutierrez Sineros", "68642482");
        listaAlumnos.add(Bianca); 
        System.out.println("Ingresa el promedio de Bianca: ");
        promedio[1] = teclado.nextFloat();
        Alumnos Carlos = new Alumnos("Carlos Hernandez Olvera", "84679420");
        listaAlumnos.add(Carlos);
        System.out.println("Ingresa el promedio de Carlos: ");
        promedio[2] = teclado.nextFloat();
        Alumnos Denisse = new Alumnos("Denisse Torres Nabor", "13467485");
        listaAlumnos.add(Denisse);
        System.out.println("Ingresa el promedio de Denisse: ");
        promedio[3] = teclado.nextFloat();
        Alumnos Elizabeth = new Alumnos("Elizabeth Irineo Polancos", "12434457");
        listaAlumnos.add(Elizabeth);
        System.out.println("Ingresa el promedio de Elizabeth: ");
        promedio[4] = teclado.nextFloat();
        Alumnos Fernando = new Alumnos("Fernando Andarez Perez", "40875213");
        listaAlumnos.add(Fernando);
        System.out.println("Ingresa el promedio de Fernando: ");
        promedio[5] = teclado.nextFloat();
        Alumnos Gabriel = new Alumnos("Gabriel Juarez Ramon", "34234561");
        listaAlumnos.add(Gabriel);
        System.out.println("Ingresa el promedio de Gabriel: ");
        promedio[6] = teclado.nextFloat();
        Alumnos Holga = new Alumnos("Holga Cazares Rojas", "94285054");
        listaAlumnos.add(Holga);
        System.out.println("Ingresa el promedio de Holga: ");
        promedio[7] = teclado.nextFloat();
        Alumnos Ignacio = new Alumnos("Ignacio Lozano Sauces", "27604329");
        listaAlumnos.add(Ignacio);
        System.out.println("Ingresa el promedio de Ignacio: ");
        promedio[8] = teclado.nextFloat();
        Alumnos Jessie = new Alumnos("Jessie Duran Torres", "84679420");
        listaAlumnos.add(Jessie);
        System.out.println("Ingresa el promedio de Jessie: ");
        promedio[9] = teclado.nextFloat();
        Alumnos Karol = new Alumnos("karol Martinez Vazquez", "59753210");
        listaAlumnos.add(Karol);
        System.out.println("Ingresa el promedio de Karol: ");
        promedio[10] = teclado.nextFloat();
        Alumnos Lucia = new Alumnos("Lucia Estrada Mendez", "76867612");
        listaAlumnos.add(Lucia); 
        System.out.println("Ingresa el promedio de Lucia: ");
        promedio[11] = teclado.nextFloat();
        Alumnos Marcos = new Alumnos("Marcos Orozco Wilbur", "63509127");
        listaAlumnos.add(Marcos);
        System.out.println("Ingresa el promedio de Marcos: ");
        promedio[12] = teclado.nextFloat();
        Alumnos Nancy = new Alumnos("Nancy Fernandez Nuñez", "13467485");
        listaAlumnos.add(Nancy);
        System.out.println("Ingresa el promedio de Nancy: ");
        promedio[13] = teclado.nextFloat();
        Alumnos Oliver = new Alumnos("Oliver Pinal Alba", "12434457");
        listaAlumnos.add(Oliver);
        System.out.println("Ingresa el promedio de Oliver: ");
        promedio[14] = teclado.nextFloat();
        Alumnos Perla = new Alumnos("Perla Gomez Rodriguez", "70170237");
        listaAlumnos.add(Perla);
        System.out.println("Ingresa el promedio de Perla: ");
        promedio[15] = teclado.nextFloat();
        Alumnos Rodrigo = new Alumnos("Rodrigo Quinteros Bedolla", "83461209");
        listaAlumnos.add(Rodrigo);
        System.out.println("Ingresa el promedio de Rodrigo: ");
        promedio[16] = teclado.nextFloat();
        Alumnos Sonia = new Alumnos("Sonia Jonas Soza", "20960126");
        listaAlumnos.add(Sonia);
        System.out.println("Ingresa el promedio de Sonia: ");
        promedio[17] = teclado.nextFloat();
        Alumnos Tomas = new Alumnos("Tomas Rojas Crisentos", "72041899");
        listaAlumnos.add(Tomas);
        System.out.println("Ingresa el promedio de Tomas: ");
        promedio[18] = teclado.nextFloat();
        Alumnos Violeta = new Alumnos("Violeta", "31054091");
        listaAlumnos.add(Violeta);
        System.out.println("Ingresa el promedio de Violeta: ");
        promedio[19] = teclado.nextFloat();

        sc.close();
        teclado.close();

        System.out.println(Armando.toString() + "\nPromedio: " + promedio[0]);
        System.out.println(Bianca.toString() + "\nPromedio: " + promedio[1]);
        System.out.println(Carlos.toString() + "\nPromedio: " + promedio[2]);
        System.out.println(Denisse.toString() + "\nPromedio: " + promedio[3]);
        System.out.println(Elizabeth.toString() + "\nPromedio: " + promedio[4]);
        System.out.println(Fernando.toString() + "\nPromedio: " + promedio[5]);
        System.out.println(Gabriel.toString() + "\nPromedio: " + promedio[6]);
        System.out.println(Holga.toString() + "\nPromedio: " + promedio[7]);
        System.out.println(Ignacio.toString() + "\nPromedio: " + promedio[8]);
        System.out.println(Jessie.toString() + "\nPromedio: " + promedio[9]);
        System.out.println(Karol.toString() + "\nPromedio: " + promedio[10]);
        System.out.println(Lucia.toString() + "\nPromedio: " + promedio[11]);
        System.out.println(Marcos.toString() + "\nPromedio: " + promedio[12]);
        System.out.println(Nancy.toString() + "\nPromedio: " + promedio[13]);
        System.out.println(Oliver.toString() + "\nPromedio: " + promedio[14]);
        System.out.println(Perla.toString() + "\nPromedio: " + promedio[15]);
        System.out.println(Rodrigo.toString() + "\nPromedio: " + promedio[16]);
        System.out.println(Sonia.toString() + "\nPromedio: " + promedio[17]);
        System.out.println(Tomas.toString() + "\nPromedio: " + promedio[18]);
        System.out.println(Violeta.toString() + "\nPromedio: " + promedio[19]);

        for (contador = 0; contador < 20; contador++) 
        {
            suma = suma + promedio[contador];
            if (promedio[contador] < 7) 
            {
                reprobados = reprobados + 1;
            }
        }

        total = suma / 20;

        System.out.println("\n\nEl promedio del grupo es: " + total);

        if (reprobados == 0) 
        {
            System.out.println("Todos los alumnos aprobaron");
        } else
          {
            if(reprobados == 20)
            {
                System.out.println("Todos los alumnos reprobaron");
            } else
              {
                System.out.println(reprobados + " reprobaron");
                System.out.println((20 - reprobados) + " aprobaron");
              }
          }

    }
}
