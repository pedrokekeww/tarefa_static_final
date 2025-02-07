public class Usuario {
    private static int contador = 0;
    public Usuario() {
        contador++;
    }
    public static int getContador() {
        return contador;
    }
    
