package respuestas;

public class Respuesta {
    private String respuesta;
    private char letra;
    private boolean correcta;
    
    public Respuesta(String respuesta, char letra, boolean correcta) {
        this.respuesta = respuesta;
        this.letra = letra;
        this.correcta = correcta;
    }
    public String getRespuesta() {
        return respuesta;
    }
    public char getLetra() {
        return letra;
    }
    public boolean isCorrecta() {
        return correcta;
    } 
}