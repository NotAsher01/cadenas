public class LongitudIII {
    public static void main(String[] args) {
        String frase= "Hol que tal";
        int k=2;
        if (comprueba(frase, k)){
            System.out.println("Hay una palabra más larga");
        }
        else {
            System.out.println("No hay ninguna palabra más larga");
        }
    }
    public  static boolean comprueba(String frase, int k){
        boolean es_verd=false;
        String[] palabras= frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > k) {
                es_verd = true;
            }
        }
        return es_verd;
    }
}
