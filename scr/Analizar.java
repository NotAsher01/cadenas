public class Analizar {
    public static void main(String[] args) {
        int contador=0;
        String palabra= "Programacion";
        System.out.println("longitud: " + palabra.length() );
        System.out.println("Primera letra: " +  palabra.charAt(0));
        System.out.println("Ultima letra: " +  palabra.charAt(palabra.length()-1));
        System.out.println("Mayusculas: " + palabra.toUpperCase());
        System.out.println("Minusculas: " + palabra.toLowerCase());
        for (int i = 0; i <= palabra.length() -1; i++) {
            if(palabra.charAt(i) == 'a'){
                contador++;
            }
        }
        System.out.println("Numero de 'a': " + contador);
    }
}
