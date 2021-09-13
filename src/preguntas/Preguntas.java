package preguntas;
import java.util.Scanner;

import respuestas.Respuesta;

public class Preguntas {
    private String pregunta;
    private Respuesta[] respuestasPosibles;
    public Preguntas(String pregunta, Respuesta[] respuestasPosibles) {
        this.pregunta = pregunta;
        this.respuestasPosibles = respuestasPosibles;
    }
    
    
    public Preguntas() {
    }


    public void preguntar(){
        System.out.println(this.pregunta);
        char letraCorrecta = 'A';
        for(Respuesta opcion: this.respuestasPosibles){
            if(opcion.isCorrecta()) letraCorrecta = opcion.getLetra();
            System.out.println(String.valueOf(opcion.getLetra()) +")"+opcion.getRespuesta()+" ");
        }
        System.out.println("\nelige la opcion: ");
        Scanner sc = new Scanner(System.in);
        char letraElegida = sc.next().toUpperCase().charAt(0);
        if(letraElegida == letraCorrecta){
        System.out.println("Correcto\nAvanzas a la siguiente ronda \n ");
        }
        else{
        System.out.println("Incorrecto la letra correcta es: "+String.valueOf(letraCorrecta)+"\nEl juego a terminado \n");
        System.exit(letraElegida);
        }
    }


}
