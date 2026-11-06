public class Siglas {
    public static void main(String[] args) {
        String frase = "Instituto Nacional de Estadística";
        System.out.println(siglas(frase));
    }
    public static String siglas(String frase){
        String[] palabras = frase.split("\\s+");
        String resultado="";
        for(int i=0;i<palabras.length;i++){
            if(Character.isLowerCase(palabras[i].charAt(0))){
                continue;
            }
            resultado+=palabras[i].charAt(0);
        }
        return resultado;
    }
}