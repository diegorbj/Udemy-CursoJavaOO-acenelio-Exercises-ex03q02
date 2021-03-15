package aplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Primeiro Quadrante");
                } else {
                    System.out.println("Quarto Quadrante");
                }
            } else {
                if (y > 0) {
                    System.out.println("Segundo Quadrante");
                } else {
                    System.out.println("Tereciro Quadrante");
                }
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
