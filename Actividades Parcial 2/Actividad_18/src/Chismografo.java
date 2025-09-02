import java.util.ArrayList;
import java.util.Scanner;

class Preguntas
{
    String Nombre;
    String Edad;
    String Nacio;
    String Fecha;
    String Color;
    String Deporte;
    String Serie;
    String Pelicula;
    String Pasatiempo;
    String Lugar;
    String Sabor;
    String Maestro;
    String Materia;
    String Gusta;
    String PrimerBeso;
    String Besaste;
    String Novie;
    String CaeMal;
    String Peleas;
    String Novies;
    String Chisme1;
    String Chisme2;
    String Chisme3;

    public Preguntas (String Nombre, String Edad, String Nacio, String Fecha, String Color, String Deporte, String Serie,
                      String Pelicula, String Pasatiempo, String Lugar, String Sabor, String Maestro, String Materia,
                      String Gusta, String PrimerBeso, String Besaste, String Novie, String CaeMal, String Peleas,
                      String Novies, String Chisme1, String Chisme2, String Chisme3)
    {
        this.Fecha = Nombre;
        this.Edad = Edad;
        this.Nacio = Nacio;
        this.Fecha = Fecha;
        this.Color = Color;
        this.Deporte = Deporte;
        this.Serie = Serie;
        this.Pelicula = Pelicula;
        this.Pasatiempo = Pasatiempo;
        this.Lugar = Lugar;
        this.Sabor = Sabor;
        this.Maestro = Maestro;
        this.Materia = Materia;
        this.Gusta = Gusta;
        this.PrimerBeso = PrimerBeso;
        this.Besaste = Besaste;
        this.Novie = Novie;
        this.CaeMal = CaeMal;
        this.Peleas = Peleas;
        this.Novies = Novies;
        this.Chisme1 = Chisme1;
        this.Chisme2 = Chisme2;
        this.Chisme3 = Chisme3;
    }

    public Preguntas()
    {

    }

    public String toString()
    {
        return "\n\nNombre: " + Nombre + "\nEdad: " + Edad + "\nNacio en: " + Nacio + "\nNacio el: " + Fecha +
               "\nColor Favorito: " + Color + "\nDeporte Favorito: " + Deporte + "\nSerie Favorita: " + Serie +
               "\nPelicula Favorita: " + Pelicula + "\nPasatiempo/s: " + Pasatiempo + "\nLugar Favorito: " + Lugar +
               "\nSabor Helado Favorito: " + Sabor + "\nMaestro/a Favorito/a: " + Maestro + "\nMateria Favorita: " + Materia +
               "\nLe gusta: " + Gusta + "\nYa dio su primer beso: " + PrimerBeso + "\nHa besado ha: " + Besaste + 
               "\nTiene novio/a: " + Novie + "\nLe cae mal: " + CaeMal + "\nSe ha peleado: " + Peleas + 
               "\nNovios/as que ha tenido: " + Novies + "\nLo que opina del primer chisme: " + Chisme1 + 
               "\nLo que opina del segundo chisme: " + Chisme1 + "\nLo que opina del tercer chisme: " + Chisme3;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setEdad(String Edad) 
    {
        this.Edad = Edad;
    }

    public void setNacio(String Nacio) 
    {
        this.Nacio = Nacio;
    }

    public void setFecha(String Fecha) 
    {
        this.Fecha = Fecha;
    }

    public void setColor(String Color) 
    {
        this.Color = Color;
    }

    public void setDeporte(String Deporte) 
    {
        this.Deporte = Deporte;
    }

    public void setSerie(String Serie) 
    {
        this.Serie = Serie;
    }

    public void setPelicula(String Pelicula) 
    {
        this.Pelicula = Pelicula;
    }

    public void setPasatiempo(String Pasatiempo) 
    {
        this.Pasatiempo = Pasatiempo;
    }

    public void setLugar(String Lugar) 
    {
        this.Lugar = Lugar;
    }

    public void setSabor(String Sabor) 
    {
        this.Sabor = Sabor;
    }

    public void setMaestro(String Maestro) 
    {
        this.Maestro = Maestro;
    }

    public void setMateria(String Materia) 
    {
        this.Materia = Materia;
    }

    public void setGusta(String Gusta) 
    {
        this.Gusta = Gusta;
    }

    public void setPrimerBeso(String PrimerBeso) 
    {
        this.PrimerBeso = PrimerBeso;
    }

    public void setBesaste(String Besaste) 
    {
        this.Besaste = Besaste;
    }

    public void setNovie(String Novie) 
    {
        this.Novie = Novie;
    }

    public void setCaeMal(String CaeMal) 
    {
        this.CaeMal = CaeMal;
    }

    public void setPeleas(String Peleas) 
    {
        this.Peleas = Peleas;
    }

    public void setNovies(String Novies) 
    {
        this.Novies = Novies;
    }

    public void setChisme1(String Chisme1) 
    {
        this.Chisme1 = Chisme1;
    }

    public void setChisme2(String Chisme2) 
    {
        this.Chisme2 = Chisme2;
    }

    public void setChisme3(String Chisme3) 
    {
        this.Chisme3 = Chisme3;
    }
}

public class Chismografo 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Preguntas> listaPreguntas = new ArrayList<Preguntas>();

        Scanner sc = new Scanner(System.in);

        int contador;

        for (contador = 1; contador <=2; contador++) 
        {
            if(contador != 1)
            {
                sc.nextLine();
            }
            Preguntas info = new Preguntas();

            System.out.println("¿Cuál es tu nombre? ");
            info.setNombre(sc.nextLine());
            System.out.println("¿Cuántos años tienes? ");
            info.setEdad(sc.nextLine());
            System.out.println("¿En donde naciste? ");
            info.setNacio(sc.nextLine());
            System.out.println("¿Cuándo naciste? ");
            info.setFecha(sc.nextLine());
            System.out.println("¿Cuál es tu color favorito? ");
            info.setColor(sc.nextLine());
            System.out.println("¿Cuál es tu deporte favorito? ");
            info.setDeporte(sc.nextLine());
            System.out.println("¿Cuál es tu serie favorita? ");
            info.setSerie(sc.nextLine());
            System.out.println("¿Cuál es tu pelicula favorita? ");
            info.setPelicula(sc.nextLine());
            System.out.println("¿Cuál es tu pasatiempo? ");
            info.setPasatiempo(sc.nextLine());
            System.out.println("¿Cuál es tu lugar favorito? ");
            info.setLugar(sc.nextLine());
            System.out.println("¿Cuál es tu sabor de helado favorito? ");
            info.setSabor(sc.nextLine());
            System.out.println("¿Quién es tu maestro/a favorito/a? ");
            info.setMaestro(sc.nextLine());
            System.out.println("¿Cuál es tu materia favorita? ");
            info.setMateria(sc.nextLine());
            System.out.println("¿Quién te gusta? ");
            info.setGusta(sc.nextLine());
            System.out.println("¿Ya diste tu primer beso? ");
            info.setPrimerBeso(sc.nextLine());
            System.out.println("¿A cuántas personas has besado? ");
            info.setBesaste(sc.nextLine());
            System.out.println("¿Tienes novio? ");
            info.setNovie(sc.nextLine());
            System.out.println("¿Quién te cae mal? ");
            info.setCaeMal(sc.nextLine());
            System.out.println("¿Alguna vez te has peleado? ");
            info.setPeleas(sc.nextLine());
            System.out.println("¿Cuántos novios has tenido? ");
            info.setNovies(sc.nextLine());
            System.out.println("¿Qué opinas de que Rogelio engaño a su novia? ");
            info.setChisme1(sc.nextLine());
            System.out.println("¿Qué opinas de que Sara reprobo todas las materias y la van a expulsar? ");
            info.setChisme2(sc.nextLine());
            System.out.println("¿Qué opinas de que nadie soporta a Armando? ");
            info.setChisme3(sc.nextLine());
                        
            listaPreguntas.add(info);

            if (contador == 2)
            {
                sc.close();
            }

        }

        System.out.println(listaPreguntas);

    }
}
