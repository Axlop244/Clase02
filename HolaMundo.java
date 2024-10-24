import java.util.Scanner;

public class HolaMundo{
    public static void main(String[] args){
        //Imprimir en el terminal, consola 
        System.out.println("Hola Alisson!"); //cambia de linea 

        System.out.print("Como estas"); //No salta la linea, 
        //puedo imprimir numeros,decimales, caracteres 'comilla sencilla'

        System.out.printf("aqui va una cadena: %s", "Alisson"); //cadena con formato, imprimir 
        //diferentes cosas con formato
        System.out.printf("aqui va una entero: %d", 10); //cadena con formato, imprim
        System.out.printf("Mi nombre es %s y tengo %d años","Alisson", 15);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
}
