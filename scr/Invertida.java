import java.util.Arrays;

public class Invertida {
    public static void main(String[] args) {
        String frase= "Hola como estas";
        System.out.print(invertir(frase));
    }
    public static String invertir(String frase){
        String[] utilidades = frase.split("\\s+");
        String reves="";
        for (int i = utilidades.length -1; i >= 0; i--) {
            reves=reves+utilidades[i] + " ";
        }
        return reves;
    }
}
