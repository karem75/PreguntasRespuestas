package preguntas;

import respuestas.Respuesta;
public class PreguntasN1 {

    public void preguntasNivel1(){
        Preguntas[] preguntas = {
            new Preguntas("\n¿Cuántos litros de sangre tiene una persona adulta?", new Respuesta[]{
                new Respuesta("Tiene entre 2 y 4 litros", 'A', false),
                new Respuesta("Tiene entre 4 y 6 litros", 'B', true),
                new Respuesta("Tiene 10 litros", 'C', false),
                new Respuesta("Tiene 7 litros", 'D', false),
            }),
        };
        for(Preguntas p: preguntas){
            p.preguntar();
            
        }
    }
}