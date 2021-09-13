package preguntas;
import respuestas.Respuesta;

public class PreguntasN4 {
    public void preguntasNivel4(){
        Preguntas[] preguntas = {
            new Preguntas("¿Cuál es el libro más vendido en el mundo después de la Biblia?", new Respuesta[] {
                new Respuesta("El Señor de los Anillos", 'A', false),
                new Respuesta("Don Quijote de la Mancha", 'B', true),
                new Respuesta("El Principito", 'C', false),
                new Respuesta("Cien años de Soledad", 'D', false),
            }),
        };
        for(Preguntas p: preguntas){
            p.preguntar();
            
        }
    }   
}