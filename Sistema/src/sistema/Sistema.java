package sistema;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int Opcion;
        System.out.println("Ingresar Opción: ");
        Opcion = leer.nextInt();
        System.out.println("La Opción ingresada fue: " + Opcion);
    }
    
}
