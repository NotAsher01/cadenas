public class Parentesis {
    static void main(String[] args) {
        String frase="(una)(";
        if(esParentizada(frase)){
            System.out.println("esta bien");
        }
        else{
            System.out.println("esta mal");
        }
    }
    public static boolean esParentizada(String frase){
        int contador=0;
        boolean bien= true;
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='('){
                contador++;
            }
            else if(frase.charAt(i)==')'){
                contador--;
                if(contador<0){
                    bien=false;
                }
            }

        }
        if(contador!=0){
            bien=false;
        }

        return bien;
    }
}
