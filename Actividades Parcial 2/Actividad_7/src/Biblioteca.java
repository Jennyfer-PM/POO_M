import java.util.ArrayList;
import java.util.Scanner;

class Libros
{
    String tipo;
    String titulo;
    String autor_p;
    String autor_s;
    String edicion;
    String editorial;
    String anio;
    String isbn;
    String clasificacion;
    String tema;
    String idioma;

    public Libros(String tipo, String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio, String isbn, String clasificacion, String tema, String idioma) 
    {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor_p = autor_p;
        this.autor_s = autor_s;
        this.edicion = edicion;
        this.editorial = editorial;
        this.anio = anio;
        this.isbn = isbn;
        this.clasificacion = clasificacion;
        this.tema = tema;
        this.idioma = idioma;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor_p() 
    {
        return autor_p;
    }

    public void setAutor_p(String autor_p) 
    {
        this.autor_p = autor_p;
    }

    public String getISBN() 
    {
        return isbn;
    }

    public void setISBN(String isbn) 
    {
        this.isbn = isbn;
    }

    public String getClasificacion() 
    {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) 
    {
        this.clasificacion = clasificacion;
    }

    public String toString() 
    {
        return "\n Tipo: " + tipo +
                "\n Titulo: " + titulo +
                "\n Autor principal: " + autor_p +
                "\n Autor secundario: " + autor_s +
                "\n Edición: " + edicion +
                "\n Editorial: " + editorial +
                "\n Año: " + anio +
                "\n ISBN: " + isbn +
                "\n Clasificación: " + clasificacion +
                "\n Tema: " + tema +
                "\n Idioma: " + idioma;
    }
}

class Novela extends Libros
{
    public Novela(String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio, String isbn, String clasificacion, String tema, String idioma) 
    {
        super("Novela", titulo, autor_p, autor_s, edicion, editorial, anio, isbn, clasificacion, tema, idioma);
    }
}

class Poesia extends Libros
{
    public Poesia(String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio, String isbn, String clasificacion, String tema, String idioma) 
    {
        super("Poesia", titulo, autor_p, autor_s, edicion, editorial, anio, isbn, clasificacion, tema, idioma);
    }
}

class Saga extends Libros
{
    public Saga(String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio,
            String isbn, String clasificacion, String tema, String idioma) {
        super("Saga", titulo, autor_p, autor_s, edicion, editorial, anio, isbn, clasificacion, tema, idioma);
    }
}

class Cuento extends Libros
{
    public Cuento(String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio, String isbn, String clasificacion, String tema, String idioma) 
    {
        super("Cuento", titulo, autor_p, autor_s, edicion, editorial, anio, isbn, clasificacion, tema, idioma);
    }
}

class Academico extends Libros
{
    public Academico(String titulo, String autor_p, String autor_s, String edicion, String editorial, String anio, String isbn, String clasificacion, String tema, String idioma) 
    {
        super("Academico", titulo, autor_p, autor_s, edicion, editorial, anio, isbn, clasificacion, tema, idioma);
    }
}

public class Biblioteca 
{
    public static void main(String[] args) 
    {
        ArrayList<Libros> listaLibros = new ArrayList<Libros>();

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        Novela Perfume = new Novela ("El perfume", "Patrick Süskind", "No aplica", "Edición 30 aniversario", "Booket", "2015", "9786070726873", "Novela de horror, misterio, postmodernismo y naturalismo", "El poder de los olores, la seducción, la intranquilidad mental", "Español");
        listaLibros.add(Perfume);
        Novela Misery = new Novela("Misery", "Stephen King", "No aplica", "Primera edición", "Scribner books", "2020", "9781982150808", "Terror psicológico, suspenso y thriller", "Fanatismo extremo y la psicosis de un fan", "Inglés");
        listaLibros.add(Misery);
        Novela Book = new Novela ("Book Lovers", "Emily Henry", "No aplica", "Primera edición", "Berkley", "2022", "9780593334836", "Romance contemporáneo y Ficción contemporánea", "Romace, amor y clichés literarios", "Inglés");
        listaLibros.add(Book);
        Novela Deseo = new Novela ("Su último deseo", "Joan Didion", "No aplica", "Edición en español", "Literatura Random House", "2019", "9788439736004", "Thriller y Ficción", "Thriller político pregnante y complejo", "Español");
        listaLibros.add(Deseo);
        Novela Misericordia = new Novela ("Misericordia", "Benito Pérez Galdós", "No aplica", "Primera edición", "Cátedra", "1897", "9788437639697", "Realismo literario", "Compasión en medio de la miseria", "Español");
        listaLibros.add(Misericordia);

        Poesia Colores = new Poesia ("Los colores de Japón", "Nancy Peña", "No aplica", "Primera edición", "Del nuevo extremo", "2022", "9788418354878", "Romance y Naturaleza", "Evanescencia de las cosas", "Español");
        listaLibros.add(Colores);
        Poesia Adoniada = new Poesia ("Adoniada", "Adonis", "No aplica", "Primera edición", "Vaso roto ediciones", "2021", "9788412600650", "Fantasia y literatura", "Autodescubrimiento, poesia y literatura", "Español");
        listaLibros.add(Adoniada);
        Poesia Mar = new Poesia ("Son de mar", "Aurora Hernández", "No aplica", "Primera edición", "Letras líquidas", "1999", "9786079980719", "Romance y Reflexivo", "Vivencias y reflexiones en torno al amor sanador", "Español");
        listaLibros.add(Mar);
        Poesia Sol = new Poesia ("Ojos de Sol", "Miguel Gane", "No aplica", "Primera edición", "Aguilar", "2022", "9788403522060", "Romance y Vida cotidiana", "Homenaje al amor y a la gente común", "Español");
        listaLibros.add(Sol);
        Poesia Duelo = new Poesia ("El duelo es esa cosa con alas", "Max Porter", "No aplica", "Primera edición", "Literatura Random House", "2023", "9788439741503", "Contemporáneo y Ficción", "La pérdida y el proceso de duelo", "Español");
        listaLibros.add(Duelo);

        Saga Magia = new Saga ("Harry Potter y la piedra filosofal", "J. K. Rowling", "No aplica", "Edición 25 Aniversario", "Salamandra", "2022", "9786073193894", "Fantasia", "Lucha entre el bien y el mal", "Español");
        listaLibros.add(Magia);
        Saga Tronos = new Saga ("Festín de cuervos", "George R. R. Martín", "No aplica", "Primera edición", "Plaza & Janés", "2012", "9786073109963", "Fantasía épica", "Consecuencias de la guerra y las intrigas políticas", "Español");
        listaLibros.add(Tronos);
        Saga Anillos = new Saga ("El silmarillion", "J. R. R. Tolkien", "No aplica", "Edición revisada", "Minotauro", "2022", "9786070791390", "Fantasía épica", "La guerra entre el bien y el mal", "Español");
        listaLibros.add(Anillos);
        Saga Bridgerton = new Saga ("Una noche inolvidable", "Julia Quinn", "No aplica", "Primera edición", "Titania", "2013", "9786077483045", "Romance", "Historia de romance complejo en una época contemporánea", "Español");
        listaLibros.add(Bridgerton);
        Saga After = new Saga ("After", "Anna Todd", "No aplica", "Edición película", "Booket", "2019", "9786070758300", "Drama y Romance", "Historia de amor entre dos polos opuestos", "Español");
        listaLibros.add(After);

        Cuento Romanticos = new Cuento ("Cuentos románticos", "Justo Sierra", "No aplica", "Primera edición", "Penguin classics", "2019", "9786073184816", "Ficción y Modernismo", "Variedad de temas, mitología universal, sobrenatural, etc", "Español");
        listaLibros.add(Romanticos);
        Cuento Soldados = new Cuento ("Cuentos de soldados", "Ambrose Bierce", "No aplica", "Primera edición", "Alianza editorial", "2011", "9788420654874", "Ficción y Guerra", "Vida de soldados y civiles durante la Guerra", "Español");
        listaLibros.add(Soldados);
        Cuento Perfecto = new Cuento ("Un cuento perfecto", "Elísabet Benavent", "No aplica", "Primera Edición", "Suma", "2020", "9786073196543", "Comedia romántica y Contemporánea", "Amor, desafios personales, búsqueda de uno mismo", "Español");
        listaLibros.add(Perfecto);
        Cuento Rosali = new Cuento ("Capitana Rosalí", "Timothée de Fombelle", "Isabelle Arsenault", "Primera edición", "Loqueleo", "2021", "9786070145704", "infantil ilustrado", "Una niña con una misión secreta: aprende a leer", "Español");
        listaLibros.add(Rosali);
        Cuento Robot = new Cuento ("Robot salvaje", "Peter Brown", "No aplica", "Primera edición", "Booket México", "2024", "9786073911139", "Infantil y Ciencia ficción", "Amistad inesperada entre un robot y animales", "Español");
        listaLibros.add(Robot);

        Academico Sociologia = new Academico ("Sociología", "Philip W. Sutton", "Anthony Giddens", "Octava edición", "Alianza editorial", "2022", "9788413629445", "Política y Ciencias sociales", "Promover un enfoque sociológico al estudio de la vida social", "Español");
        listaLibros.add(Sociologia);
        Academico Economia = new Academico ("Microeconomía", "Robert S. Pindyck", "Daniel L. Rubinfeld", "Séptima edición", "Pearson", "2009", "9788490355749", "Economía", "Conceptos y herramientas de la microeconomía", "Español");
        listaLibros.add(Economia);
        Academico Astronomia = new Academico ("De la tierra al universo", "David Galadí-Enriquez", "Jordi Gutiérrez Cabello", "Segunda edición", "Akal", "2022", "9788446051459", "Ciencias naturales y Astronomía", "Introducción a la astronomía", "Español");
        listaLibros.add(Astronomia);
        Academico Fisica = new Academico ("Las diez claves de la realidad", "Frank Wilczek", "No aplica", "Primera edición", "Crítica", "2022", "9786075692548", "Física", "Comprensión científica de la realidad física con un lenguaje sencillo", "Español");
        listaLibros.add(Fisica);

        System.out.println("Filtros de busqueda: ");
        System.out.println("1.- Titulo del libro. ");
        System.out.println("2.- Autor principal. ");
        System.out.println("3.- isbn. ");
        System.out.println("4.- Clasificación. ");
        System.out.println("5.- Salir. ");
        System.out.println("Eliga una de las opciones anteriores: ");
        opcion = teclado.nextInt();

        while (opcion != 5)
        {
            System.out.println("Eliga una de las opciones anteriores: ");
            opcion = teclado.nextInt();
            switch (opcion) 
            {
               case 1:
                    System.out.println("Ingresa el titulo del libro a buscar: ");

                    Libros buscado_1 = findByTitulo(sc.nextLine(), listaLibros);

                    if (buscado_1 == null) 
                    {
                      System.out.println("El libro no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_1.toString());
                      }
                    break;
                case 2:
                    System.out.println("Ingresa el autor principal del libro a buscar: ");

                    Libros buscado_2 = findByAutor_p(sc.nextLine(), listaLibros);

                    if (buscado_2 == null) 
                    {
                      System.out.println("El libro no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_2.toString());
                      }
                    break;
                case 3:
                    System.out.println("Ingresa la ISBN del libro a buscar: ");

                    Libros buscado_3 = findByISBN(sc.nextLine(), listaLibros);

                    if (buscado_3 == null) 
                    {
                      System.out.println("El libro no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_3.toString());
                      }
                    break;
                case 4:
                    System.out.println("Ingresa la clasificación del libro a buscar: ");

                    Libros buscado_4 = findByClasificacion(sc.nextLine(), listaLibros);

                    if (buscado_4 == null) 
                    {
                      System.out.println("El libro no ha sido encontrado");
                    } else 
                      {
                        System.out.println(buscado_4.toString());
                      }
                    break;
                case 5:
                    System.out.println("Busqueda terminada");
                    break;
            }
        }

        teclado.close();
        sc.close();
    }

    public static Libros findByTitulo(String nombreLibro, ArrayList<Libros> listaLibros) 
    {
        for (Libros libro : listaLibros) 
        {
           if (libro.getTitulo().equals(nombreLibro)) 
           {
               return libro;
           }
       }
       return null;
    }

    public static Libros findByAutor_p(String autor_pLibro, ArrayList<Libros> listaLibros) 
    {
      for (Libros libro : listaLibros) 
        {
            if (libro.getTitulo().equals(autor_pLibro)) 
            {
                return libro;
            }
        }
        return null;
    }

    public static Libros findByISBN(String isbnLibro, ArrayList<Libros> listaLibros) 
    {
        for (Libros libro : listaLibros) 
        {
            if (libro.getTitulo().equals(isbnLibro)) 
            {
                return libro;
            }
        }
        return null;
    }

    public static Libros findByClasificacion(String clasificacionLibro, ArrayList<Libros> listaLibros) 
    {
        for (Libros libro : listaLibros) 
        {
            if (libro.getTitulo().equals(clasificacionLibro)) 
            {
                return libro;
            }
        }
        return null;
    }
}
