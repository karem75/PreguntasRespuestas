package preguntas;
import respuestas.Respuesta;

public class PreguntasN5 {
    public void preguntasNivel5(){
        Preguntas[] preguntas = {
            new Preguntas("La sal común está formada por dos elementos, ¿cuáles son?", new Respuesta[] {
                new Respuesta("Sodio y potasio", 'A', false),
                new Respuesta("Sodio y cloro", 'B', true),
                new Respuesta("Sodio y carbono", 'C', false),
                new Respuesta(" Potasio y cloro", 'D', false),
            }),
        };
        for(Preguntas p: preguntas){
            p.preguntar();          
        }
    }   
}