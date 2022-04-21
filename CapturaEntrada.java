import java.util.*;

public class CapturaEntrada{

    //Aqui se capturara numeros enteros , asi que lo asignaremos con la variable int
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
    //La variable que se utilizara aqui sera el float para numeros de tipo entero y parte decimal
    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }
    //El valor que se obtendra aqui podemos conseguirlo de forma primaria asi que usaremos el double
    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }
    //Como sera captura de cadena de texto , utilizaremos la variable string
    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}