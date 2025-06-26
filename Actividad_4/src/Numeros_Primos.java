public class Numeros_Primos
{
    public static boolean Primos(numeros)
    {
        int contador;
        boolean primo = true;
        while ((primo) && (contador != numeros))
           {
                if (numeros % contador == 0)
                {
                    primo = false;
                    contador++;
                }
            }
            return primo;
        
    }
    public static void main(String[] args) throws Exception 
    {
        Integer numeros = 1;

        System.out.println("Los números primos del 0 al 100 son: ");
        
        do 
        {
            if (Primos(numeros) == true) 
            {
                System.out.println(numeros);
            }
            numeros++;
        } while (numeros <= 100);

    }
}
