package Test;

import java.util.Scanner;

public class Interfaz {

    private final String limpiarConsola = (char)27+"[0m";
    public static Scanner sc = new Scanner(System.in);

   public void mostrarTitulo(){
       System.out.println("Bienvenidos al concurso de preguntas y respuestas"+limpiarConsola);
       System.out.println();
   }

   public void mostrarOpcionMenu(String cadena, int numero){
       System.out.println(numero+"- "+limpiarConsola+cadena);
   }

   public int preguntarNumero(String pregunta){
       boolean validacion = false;
       int numero = 0;
       while(!validacion){
           System.out.println("- "+pregunta+": ");
           try{
            numero = sc.nextInt();
            validacion = true;
            if(numero < 0){
                validacion = false;
                mostrarError("solo numeros positivos");
            }
            } catch (Exception e){
                mostrarError("solo se permiten numero");
                sc.next();
                validacion = false;
            }
        }  
        
          
    System.out.println();
    return numero;
    }
    
    public void mostrarError(String error){
        System.out.println(error+" "+limpiarConsola);
    }

    public void mostrarH1(String cadena){
        System.out.println((char)27+"[37;42m "+(char)27 +(char)27 +"[37;42m "+cadena+" "+limpiarConsola);
    }
    public void mostrarRegla(String cadena){
        System.out.println("*"+cadena);
    }
    public void mostrarPuntaje(int puntos ){
        System.out.println("* felicidades tienes "+puntos+" puntos\n");
    }
    public void salir(){
        System.exit(0);;
    }
}