public class Palíndromo {
    public static void main(String[] args) {
        String frase= "Anita lava la tina";
        String invertido="";


        for(int i=frase.length()-1;i>=0;i--){
            invertido=invertido+frase.charAt(i);
        }
        System.out.println(invertido);
        String frasesinespacio= frase.replace(" ","");
        String invertidosinespacio= invertido.replace(" ","");
        if(invertidosinespacio.equalsIgnoreCase(frasesinespacio)){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
    }
}
