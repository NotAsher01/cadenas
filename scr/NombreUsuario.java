public class NombreUsuario {
    public static void main(String[] args) {
        String nombre = "jUAN pérez LÓPEZ";

        String[] partes=nombre.split(" ");
        for(int i=0;i<partes.length;i++){
            partes[i]=partes[i].substring(0,1).toUpperCase() +
                    partes[i].substring(1).toLowerCase();
        }

        System.out.print("Nombre formateado: ");
        for(int i=0;i<partes.length;i++){
            System.out.print(partes[i] + " ");
        }
        System.out.println();

        System.out.print("Iniciales: ");
        for(int i=0;i<partes.length;i++){
            System.out.print(partes[i].charAt(0) + ".");
        }

        System.out.println();
        String usuario= partes[0].substring(0,1);
        usuario += partes[1];
        usuario += partes[2].substring(0,1);
        usuario = usuario.toLowerCase();
        System.out.println("Usuario: "+usuario);
    }
}
