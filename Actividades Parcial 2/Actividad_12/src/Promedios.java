import java.util.ArrayList;
import java.util.Scanner;

class Alumnos
{
    String nombre;
    String matricula;
    String carrera;

    public Alumnos (String nombre, String matricula, String carrera)
    {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public Alumnos()
    {

    }

    public String toString()
    {
        return "\n Nombre del alumno: " + nombre +
               "\n Matricula correspondiente: " + matricula +
               "\n Carrera en curso: " + carrera;
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
}

public class Promedios
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

        Scanner teclado = new Scanner(System.in);

        Alumnos Armando = new Alumnos("Armando Sauces Mendoza", "73264591", "TIID");
        listaAlumnos.add(Armando);
        Alumnos Bianca = new Alumnos("Bianca Gutierrez Sineros", "68642482", "Mecatronica");
        listaAlumnos.add(Bianca);
        
        teclado.close();

        System.out.println(Bianca.toString());

    }

}
