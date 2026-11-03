public class Digitos2 {
    public static void main(String[] args) {
        String frase="12 3 45 1a";
        System.out.println("Contador: " + contarNumeros(frase));
    }
    public static int contarNumeros(String frase) {
        String[] palabras = frase.split("\\s+");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            boolean esnum = true;
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                if (!Character.isDigit(palabra.charAt(j))) {
                    esnum = false;
                    break;
                }
            }
            if (esnum) {
                contador++;
            }
        }
        return contador;
    }
}