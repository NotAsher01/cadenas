public class LongitudI {
    public static void main(String[] args) {
        String frase ="Ho que mal";

        int k=2;
        System.out.println(comprueba(frase,k));

    }
    public static int comprueba(String frase, int k){
        int cuantas=0;
        String[] palabra = frase.split("\\s");
        for(int i=0;i<palabra.length;i++){
            if(palabra[i].length()==k){
                cuantas++;
            }
        }
        return cuantas;
    }
}
