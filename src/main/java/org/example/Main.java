package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  printImpar();
        //printNumbersThaAreDividedAt2And3();
        printNumbersFromBiggestToSmallestWithoutCenterNumber();
    }


    //*3-Printeaza numerele de la 0 - 100 doar impare
    public static void printImpar() {
        for (int i = 0; i <= 100; i++) {
            int nr = i % 2;
            if (nr == 1) {
                System.out.println(i);
            }
        }
    }

    // *7-Printeaza numerele de la 100 pan la -100 care se impart la 2 si 3 fara rest

    public static void printNumbersThaAreDividedAt2And3() {
        for (int i = 100; i >= -100; i--) {
            int rest1 = i % 2;
            int rest2 = i % 3;
            if (rest1 == 0 && rest2 == 0) {
                System.out.println(i);
            }
        }
    }

    // *10-Cere 3 numere de la tastiera si printeaza de la nr cel mai mare pan la nr cel mai mic in afara de nr din mijloc
    public static void printNumbersFromBiggestToSmallestWithoutCenterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu trei numere : ");
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        int nr3 = scanner.nextInt();
        int max = 0;
        int min = 0;
        int mijlloc = 0;
        for (int i = 0; i <= nr1; i++) {
            for (int j = 0; j <= nr2; j++) {
                for (int k = 0; k <= nr3; k++) {
                    if (nr1 > nr2 && nr1 > nr3) {
                        max = nr1;
                    } else if (nr2 > nr1 && nr2 > nr3) {
                        max = nr2;
                    } else {
                        max = nr3;
                    }
                    if (nr1 < nr2 && nr1 < nr3) {
                        min = nr1;
                    } else if (nr2 < nr1 && nr2 < nr3) {
                        min = nr2;
                    } else {
                        min = nr3;
                    }
                }
            }
            if (nr1 != max && nr1 != min) {
                mijlloc = nr1;

            } else if (nr2 != max && nr2 != min) {
                mijlloc = nr2;
            } else {
                mijlloc = nr3;
            }

        }
        System.out.println("Numerele sunt: ");
        for (int i = min; i <= max; i++) {

            if (i == mijlloc) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}