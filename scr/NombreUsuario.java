import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        String nombre = "jUAN pérez LÓPEZ";

        String[] partes=nombre.split(" ");
        for(int i=0;i<partes.length;i++){
            partes[i]=partes[i].substring(0,1).toUpperCase() +
                    partes[i].substring(1).toLowerCase();
        }
        for(int i=0;i<partes.length;i++){
            System.out.print(partes[i] + " ");
        }
        String nombre_formateado=partes[partes.length-1];
        System.out.println("Nombre formateado: "+nombre_formateado);
    }
}
