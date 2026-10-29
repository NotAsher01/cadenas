public class Longitud {
    public static void main(String[] args) {
        String frase ="Hola como estas hoy";
        String[] palabras = frase.split("\\s");
        int k=4;
        int cuantas=0;
        for(int i=0;i<palabras.length;i++){
            if(palabras[i].length()==k){
                cuantas++;
            }
        }
        System.out.println(cuantas);
    }
}
