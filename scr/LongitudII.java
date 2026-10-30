public class LongitudII {
    public static void main(String[] args) {
        String frase = "Oh no que mal";
        String[] palabra = frase.split("\\s+");
        int k = 3;

        if (comprueba(frase, k)) {
            System.out.println("Hay alguna palabra con longitud de " + k + " caracteres");
        }
        else  {
            System.out.println("No hay alguna palabra con longitud de " + k + " caracteres");
        }
    }
    public static boolean comprueba(String frase, int k) {
        boolean es_verdad = false;
        String[] palabra = frase.split("\\s+");
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() == k) {
                es_verdad = true;
            }
        }
        return es_verdad;
    }
}
