package seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUsuario;
        long p1erValor = 0;
        long s2doValor = 1;
        long sigteValor = 0;

        System.out.println("\n\n\t\tPrograma que imprime la serie de Fibonacci hasta el número que quiera el usuario\n\n");
        System.out.println("Ingresa el número hasta el que quieres que se te muestre la serie: ");
        numUsuario = Integer.parseInt(scanner.nextLine());
        System.out.println("\n\nEl número de la serie de fibonacci hasta el que se te va a mostrar es: [ " + numUsuario + " ], siempre y cuando " + numUsuario + " exista en la serie, sino existe, te mostraré hasta su número más cercano. \n\nLa serie de Fibonacci hasta el número " + numUsuario + " es:  \n\n\n");

        if (numUsuario == 0) {
            System.out.print(" " + p1erValor);
        } else {
            System.out.print(" " + p1erValor + ",");
            System.out.print(" " + s2doValor + ",");

            for (int i = 0; i < numUsuario; i++) {
                sigteValor = p1erValor + s2doValor;
                if (sigteValor > numUsuario || sigteValor == 0) {
                    break;
                } else {
                    System.out.print(" " + sigteValor);
                }

                System.out.print(",");

                p1erValor = s2doValor;
                s2doValor = sigteValor;

            }
        }
        System.out.println("\n\n");
    }
}
