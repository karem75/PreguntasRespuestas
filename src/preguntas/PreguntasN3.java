package preguntas;
import respuestas.Respuesta;

public class PreguntasN3 {
    public void preguntasNivel3(){
        Preguntas[] preguntas = {
            new Preguntas("¿Cuál es el país más grande y el más pequeño del mundo?", new Respuesta[] {
                new Respuesta("Rusia y Vaticano", 'A', true),
                new Respuesta("China y Nauru", 'B', false),
                new Respuesta(" Canadá y Mónaco", 'C', false),
                new Respuesta("Estados Unidos y Malta", 'D', false),
            }),    
        };
        for(Preguntas p: preguntas){
            p.preguntar();
            
        }
    }   
}