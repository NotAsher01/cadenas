public class SumarBinario {
    public static void main(String[] args) {
        String uno="1011";
        String dos="1010";

        System.out.println(sumaBinario(uno,dos));
    }
    public static String sumaBinario(String uno, String dos){
        int b1,b2,suma,acarreo=0;
        String res="";
        for(int i= uno.length() -1;i>=0; i--){
            b1 = Character.getNumericValue(uno.charAt(i));
            b2 = Character.getNumericValue(dos.charAt(i));
            suma = b1+b2+acarreo;
            if (suma==0){
                res= "0" + res;
                acarreo=0;
            } else if (suma==1) {
                res= "1"+ res;
                acarreo=0;
            } else if (suma==2) {
                res= "0"+ res;
                acarreo=1;
            }
            else {
                res= "1" + res;
                acarreo=1;
            }
        }
        if(acarreo==1){
            res="1"+ res;
        }
        return res;
    }
}
