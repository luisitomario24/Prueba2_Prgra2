package PruebaFinal_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);

        ITunes i = new ITunes();

        int opcion = 0, cod = 0, estrellas  = 0;
        double precio;
        long Offset = 0;
        String nombreCancion, nombrecantante, g, cliente;

        System.out.println("Bienvenido , seleccione una de las siguintes opciones :)"
                + "\n1.Agregar una cancion"
                + "\n2.Ver la review de una cancion"
                + "\n3.Descargar Cancion"
                + "\n4.Canciones"
                + "\n5.Informacion de las canciones"
                + "\n6.Salir");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:

                System.out.println("\n ***Codigo disponible *** \n");
                System.out.print("Ingrese el Offset (0 o 4): ");
                Offset = leer.nextLong();
                System.out.println(i.getCodigo(Offset));
                i.addSong("Luis", "Luis", opcion);
                break;

            case 2:

                System.out.println("\n ***Añadir cancion*** \n");
                System.out.print("Nombre de la cancion: ");
                nombreCancion = leer.nextLine();
                leer.nextLine();

                System.out.print(" Nombre del Cantante: ");
                nombrecantante = leer.nextLine();
                leer.nextLine();

                System.out.print("Precio: ");
                precio = leer.nextDouble();
                //Prueba 
                i.reviewSong(opcion, opcion);
                break;
            case 3:
                System.out.println("\n *** Hacer un review de una cancion *** \n");
                System.out.print("Ingrese el cdigo de la cancion que desea hcaerle review: ");
                cod = leer.nextInt();

                System.out.println("Ingrese la cantidad de estrellas que desea dar (0 a 5)");
                estrellas  = leer.nextInt();
                i.reviewSong(cod, estrellas);
                break;
            case 4:
                i.songs("Altamar");
                break;
            case 5:
                i.infoSong(opcion);
                break;
            case 6:

                break;

        }
    }

}
