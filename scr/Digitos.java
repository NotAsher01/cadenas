public class Digitos {
    public static void main(String[] args) {
        String frase="1234 Hola 1234";


        System.out.println("hay "+ cuantosSonDigitos(frase) + " digitos");
    }
    public static int cuantosSonDigitos(String frase){
        int digitos=0;
        for(int i=0;i<frase.length();i++){
            if(Character.isDigit(frase.charAt(i))){
                digitos++;
            }
        }return digitos;
    }
}
