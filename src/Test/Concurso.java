package Test;

import preguntas.*;

public class Concurso {

    private Interfaz interfaz = new Interfaz();
    private PreguntasN1 preguntasN1 = new PreguntasN1();
    private PreguntasN2 preguntasN2 = new PreguntasN2();
    private PreguntasN3 preguntasN3 = new PreguntasN3();
    private PreguntasN4 preguntasN4 = new PreguntasN4();
    private PreguntasN5 preguntasN5 = new PreguntasN5();
   // private Preguntas preguntas = new Preguntas();

    public void iniciar(){
        menu();
    }
    private void menu(){
        int opcion;
        interfaz.mostrarTitulo();
        interfaz.mostrarOpcionMenu("Iniciar el juego", 1);
        interfaz.mostrarOpcionMenu("Ver reglas del juego", 2);
        interfaz.mostrarOpcionMenu("Salir del juego", 3);
        System.out.println();
        opcion = interfaz.preguntarNumero("Digite la opcion");
        procesarMenu(opcion);
    }

    public void procesarMenu(int opcion){
        switch(opcion){
            case 1:
                iniciarJuegoConcurso();
                break;
            case 2:
                mostrarReglas();
                menu();
                break;
            case 3:
                interfaz.salir();
                break;    
            default:
                break;

        }
    }

    public void iniciarJuegoConcurso(){

        interfaz.mostrarH1("Primera ronda 1");
        preguntasN1.preguntasNivel1();
        interfaz.mostrarPuntaje(100);
        interfaz.mostrarH1("Segunda ronda");
        preguntasN2.preguntasNivel2();
        interfaz.mostrarPuntaje(200);
        interfaz.mostrarH1("Tercera ronda");
        preguntasN3.preguntasNivel3();
        interfaz.mostrarPuntaje(300);
        interfaz.mostrarH1("Cuarta ronda");
        preguntasN4.preguntasNivel4();
        interfaz.mostrarPuntaje(400);
        interfaz.mostrarH1("Quinta ronda");
        preguntasN5.preguntasNivel5();
        interfaz.mostrarPuntaje(500);
    
    }

    public void mostrarReglas(){
        interfaz.mostrarH1("REGLAS");
        interfaz.mostrarRegla("Este juego consta de 5 nieveles");
        interfaz.mostrarRegla("Tendras una pregunta por cada nivel");
        interfaz.mostrarRegla("Para avanzar tendras que elegir entre 4 respuesta la correcta");
        interfaz.mostrarRegla("Por cada nivel que avances tendras 100 puntos");
        interfaz.mostrarRegla("Al escojer una respuesta errada terminara el juego");
        System.out.println(); 
    }
}