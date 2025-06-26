import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Alumnos
{
    String nombre;
    String matricula;
    String carrera;
    Integer prom;

    public Alumnos (String nombre, String matricula, String carrera, Integer prom)
    {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.prom = prom;
    }

    public Alumnos()
    {

    }

    public String toString()
    {
        return "\n Nombre del alumno: " + nombre +
               "\n Matricula correspondiente: " + matricula +
               "\n Carrera en curso: " + carrera +
               "\n Promedio general: " + prom;
    }

    public void setnombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setmatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public void setcarrera(String carrera) 
    {
        this.carrera = carrera;
    }

    public void setprom(Integer prom) 
    {
        this.prom = prom;
    }
}

public class Promedios
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        Integer prom[];
        prom = new Integer[15];

        Alumnos Armando = new Alumnos();
        Armando.setnombre("Armando Sauces Mendoza");
        Armando.setmatricula("73264591");
        Armando.setcarrera("TIID");
        Armando.setprom(teclado.nextInt());
        listaAlumnos.add(Armando);
        Alumnos Bianca = new Alumnos();
        Bianca.setnombre("Bianca Gutierrez Sineros");
        Bianca.setmatricula("68642482");
        Bianca.setcarrera("Mecatronica");
        Bianca.setprom(teclado.nextInt());
        listaAlumnos.add(Bianca);
        
        Alumnos Carlos = new Alumnos ("Carlos Torres Perciles", "29558562", "Administracion", prom[2]);
        System.out.println("Ingrese el promedio del alumno:");
        Carlos.setprom(teclado.nextInt());
        listaAlumnos.add(Carlos);
        Alumnos Daniel = new Alumnos ("Daniel Solis Flores", "57382042", "Automotriz", prom[3]);
        System.out.println("Ingrese el promedio del alumno:");
        Daniel.setprom(teclado.nextInt());
        listaAlumnos.add(Daniel);
        Alumnos Ernesto = new Alumnos ("Ernesto Santos Bedolla", "39582732", "TIID", prom[4]);
        System.out.println("Ingrese el promedio del alumno:");
        Ernesto.setprom(teclado.nextInt());
        listaAlumnos.add(Ernesto);
        Alumnos Fabiola = new Alumnos ("Fabiola Cervantes Quintero", "86427312", "Mecatronica", prom[5]);
        System.out.println("Ingrese el promedio del alumno:");
        Fabiola.setprom(teclado.nextInt());
        listaAlumnos.add(Fabiola);
        Alumnos Gerardo = new Alumnos ("Gerardo Monreal Durango", "32409502", "Automotriz", prom[6]);
        System.out.println("Ingrese el promedio del alumno:");
        Gerardo.setprom(teclado.nextInt());
        listaAlumnos.add(Gerardo);
        Alumnos Horacio = new Alumnos ("Horacio Estrada Jimenez", "95830522", "Administracion", prom[7]);
        System.out.println("Ingrese el promedio del alumno:");
        Horacio.setprom(teclado.nextInt());
        listaAlumnos.add(Horacio);
        Alumnos Ignacio = new Alumnos ("Ignacio Omali Dysten", "47257582", "TIID", prom[8]);
        System.out.println("Ingrese el promedio del alumno:");
        Ignacio.setprom(teclado.nextInt());
        listaAlumnos.add(Ignacio);
        Alumnos Jessie = new Alumnos ("Jessie Grey Sloan", "19238432", "Mecatronica", prom[9]);
        System.out.println("Ingrese el promedio del alumno:");
        Jessie.setprom(teclado.nextInt());
        listaAlumnos.add(Jessie);
        Alumnos Karla = new Alumnos ("Karla Tintero Espinoza", "45724932", "Automotriz", prom[10]);
        System.out.println("Ingrese el promedio del alumno:");
        Karla.setprom(teclado.nextInt());
        listaAlumnos.add(Karla);
        Alumnos Luis = new Alumnos ("Luis Lopez Laros", "46906462", "Administracion", prom[11]);
        System.out.println("Ingrese el promedio del alumno:");
        Luis.setprom(teclado.nextInt());
        listaAlumnos.add(Luis);
        Alumnos Marcos = new Alumnos ("Marcos Mineros Gomez", "69046932", "TIID", prom[12]);
        System.out.println("Ingrese el promedio del alumno:");
        Marcos.setprom(teclado.nextInt());
        listaAlumnos.add(Marcos);
        Alumnos Nancy = new Alumnos ("Nancy Canto Mendoza", "43421302", "Mecatronica", prom[13]);
        System.out.println("Ingrese el promedio del alumno:");
        Nancy.setprom(teclado.nextInt());
        listaAlumnos.add(Nancy);
        Alumnos Peter = new Alumnos ("Peter Bolaños Mendez", "86427312", "Automotriz", prom[14]);
        System.out.println("Ingrese el promedio del alumno:");
        Peter.setprom(teclado.nextInt());
        listaAlumnos.add(Peter);
        System.out.println("Peter:" + (Peter.toString()));

        sc.close();
        teclado.close();

        

    }

}
