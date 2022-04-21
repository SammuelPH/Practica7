import java.util.*;
public class Main {
    //Usaremos el public static que indicara que no es necesario crear una instancia de la clase
    public static void main (String []args){
        int i = 0;
        Pajaro1[] pajaro11 = new Pajaro1[CapturaEntrada.capturarEntero("\nPersonaliza a tu pajaro no.1 , ¿Cuantos nesitaras?")];
        Pajaro2[] pajaro22 = new Pajaro2[CapturaEntrada.capturarEntero("\nPersonaliza a tu pajaro no.2 , ¿Cuantos nesitaras?")];
        Pajaro3[] pajaro33 = new Pajaro3[CapturaEntrada.capturarEntero("\nPersonaliza a tu pajaro no.3 , ¿Cuantos nesitaras?")];
        for (i=0;i<pajaro11.length;i++)
        {
            pajaro11[i] = new Pajaro1();
        }
        for (i=0;i<pajaro22.length;i++)
        {
            pajaro22[i] = new Pajaro2();
        }
        for (i=0;i<pajaro33.length;i++)
        {
            pajaro33[i] = new Pajaro3();
        }
        for (i=0;i<pajaro11.length;i++)
        {
            System.out.println("\nEl nombre de tu pajaro es: "+pajaro11[i].getNombre());
            System.out.println("La fuerza de lanzamiento es igual a: "+pajaro11[i].getFuerzadelanzamiento() + " fue muy efectiva!");
            System.out.println("La direccion seleccionado es a: "+pajaro11[i].getDireccion() + " grados");
            System.out.println("La vida base es igual a: "+pajaro11[i].getvida() + " puntos de vida");
            System.out.println("El daño provocado es igual a: "+pajaro11[i].getdaño() + " puntos de daño");
            System.out.println("La explosion fue : "+pajaro11[i].getexplosion() + " , buena decision!");
            System.out.println("Se incremento su tamaño en: "+pajaro11[i].gettamaño() + " veces!\n");
        }
        for (i=0;i<pajaro22.length;i++)
        {
            System.out.println("\nEl nombre de tu pajaro es: "+pajaro22[i].getNombre());
            System.out.println("La fuerza de lanzamiento es igual a: "+pajaro22[i].getFuerzadelanzamiento() + " fue muy efectiva!");
            System.out.println("La direccion seleccionado es a: "+pajaro22[i].getDireccion() + " grados");
            System.out.println("La vida base es igual a: "+pajaro22[i].getvida() + " puntos de vida");
            System.out.println("El daño provocado es igual a: "+pajaro22[i].getdaño() + " puntos de daño");
            System.out.println("La velocidad recibida fue: "+pajaro22[i].getvelocidad() + " excelente decision");
            System.out.println("La cantidad de potencia fue: "+pajaro22[i].getpotencia() + " dio en el blanco!\n");
        }
        for (i=0;i<pajaro33.length;i++)
        {
            System.out.println("\nEl nombre de tu pajaro es: "+pajaro33[i].getNombre());
            System.out.println("La fuerza de lanzamiento es igual a: "+pajaro33[i].getFuerzadelanzamiento() + " fue muy efectiva!");
            System.out.println("La direccion seleccionado es a: "+pajaro33[i].getDireccion() + " grados");
            System.out.println("La vida base es igual a: "+pajaro33[i].getvida() + " puntos de vida");
            System.out.println("El daño provocado es igual a: "+pajaro33[i].getdaño() + " puntos de daño");
            System.out.println("Se dividio en : "+pajaro33[i].getdivision() + " veces");
            System.out.println("El nivel obtenido fue de : "+pajaro33[i].getnivel() + " con eso los venceras!\n");
        }
    }
}

class Pajaro {
    String nombre;
    int Fuerzadelanzamiento;
    int direccion;
    int vida;
    int daño;

    //Contructores
    public Pajaro() {
        setNombre(CapturaEntrada.capturarCadena("\nIngrese el nombre"));
        setFuerzadelanzamiento(CapturaEntrada.capturarEntero("Ingrese la fuerza de lanzamiento (Cantidad)"));
        setdireccion(CapturaEntrada.capturarEntero("Ingrese la direccion (En grados de 0 a 359 grados)"));
        setvida(CapturaEntrada.capturarEntero("Ingrese la cantidad de vida"));
        setdaño(CapturaEntrada.capturarEntero("Ingrese el daño"));
    }
    //Poner setters y getters
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFuerzadelanzamiento(int Fuerzadelanzamiento) {
        this.Fuerzadelanzamiento = Fuerzadelanzamiento;
    }
    public void setdireccion(int direccion) {
        this.direccion = direccion;
    }
    public void setvida(int vida) {
        this.vida = vida;
    }
    public void setdaño(int daño) {
        this.daño = daño;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public int getFuerzadelanzamiento() {
        return Fuerzadelanzamiento;
    }
    public int getvida() {
        return vida;
    }
    public int getDireccion() {
        return direccion;
    }
    public int getdaño() {
        return daño;
    }
}

class Pajaro1 extends Pajaro {

    String explosion;
    int tamaño;

    public Pajaro1() {
        setexplosion(CapturaEntrada.capturarCadena("Que tan grande quisiera que fuera su explosion? (Muy grande , chica , mediana)"));
        settamaño(CapturaEntrada.capturarEntero("En cuantas veces quiere que incremente su tamaño? (1 a 10)"));
    }

    //Sección de metodos: setters, getters

    public void setexplosion(String explosion) {
        this.explosion = explosion;
    }
    public void settamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public String getexplosion() {
        return explosion;
    }
    public int gettamaño() {
        return tamaño;
    }
}

class Pajaro2 extends Pajaro {

    String velocidad;
    int potencia;

    public Pajaro2() {
        setvelocidad(CapturaEntrada.capturarCadena("Ingrese la velocidad que le quiera agregar!"));
        setpotencia(CapturaEntrada.capturarEntero("Ingrese un numero de potencia extra!"));
    }

    //Sección de metodos: setters, getters

    public void setvelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    public void setpotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getvelocidad() {
        return velocidad;
    }
    public int getpotencia() {
        return potencia;
    }
}

class Pajaro3 extends Pajaro {

    int division;
    int nivel;

    public Pajaro3() {
        setdivision(CapturaEntrada.capturarEntero("Ingrese en cuanto se podria dividir"));
        setnivel(CapturaEntrada.capturarEntero("Ingrese el nivel que le quiere brindar"));
    }

    //Sección de metodos: setters, getters

    public void setdivision(int division) {
        this.division = division;
    }
    public void setnivel(int nivel) {
        this.nivel = nivel;
    }
    public int getdivision() {
        return division;
    }
    public int getnivel() {
        return nivel;
    }
}