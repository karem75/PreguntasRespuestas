package preguntas;
import respuestas.Respuesta;

public class PreguntasN2 {
    public void preguntasNivel2(){
        Preguntas[] preguntas = {
            new Preguntas("\n¿Quién es el autor de la frase 'Pienso, luego existo'?", new Respuesta[] {
                new Respuesta("Platón", 'A', false),
                new Respuesta("Galileo Galilei", 'B', false),
                new Respuesta("Descartes", 'C', true),
                new Respuesta("Sócrates", 'D', false),
            }),
        };
        for(Preguntas p2: preguntas){
            p2.preguntar();
            
        }
    }   
}