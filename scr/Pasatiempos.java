public class Pasatiempos {
    static void main(String[] args) {
        String frase="un ejemplo de pasatiempos";

        System.out.println(crearPasatiempo(frase));
    }
    public static String crearPasatiempo(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e'  || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                frase = frase.replace(frase.charAt(i), '.');
            }
        }
        return frase;
    }
}
