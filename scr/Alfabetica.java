public class Alfabetica {
    static void main(String[] args) {
        String palabra="himno";
        if(esAlfabetica(palabra)){
            System.out.println("si");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean esAlfabetica(String palabra) {
        boolean alfabetica=true;
        for (int i = 0; i<palabra.length()-1; i++) {
            if (palabra.charAt(i)>palabra.charAt(i+1)) {
                alfabetica = false;
                break;
            }
        }
        return alfabetica;
    }
}
