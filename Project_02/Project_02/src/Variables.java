public class Variables {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2;
        numero2 = 3.14; //Puede requerir colocar una D o d al final del valor
        float numero3;
        numero3 = 3.14159F; //Requiere colocar una F o f al final del valor
        char caracter1 = 'A', caracter2 = 65;
        boolean opcion = true;
        long numero4;
        numero4 = 987654321L; //Puede requerir L o l al final del valor
        byte numero5 = 126;
        short numero6 = 128;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);

        //Variables de referencia

        String mensaje, mensaje2;
        mensaje = "Esto es un mensaje";
        mensaje2 = """
                Este
                es
                un mensaje
                multilinea
                """;
        
        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje + " " + numero1);
        System.out.println(mensaje.toUpperCase());
        String numero1_string = Integer.toString(numero1);
        System.out.println(mensaje.concat(numero1_string));

        //Variable general

        var variable1 = 15L;
        var variable2 = "f";
        var variable3 = 2.8754F;

        final var PI = 3.14159;

        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(PI);
        
    }
}
