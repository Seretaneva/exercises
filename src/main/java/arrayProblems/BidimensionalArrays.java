package arrayProblems;

import java.util.Scanner;

public class BidimensionalArrays {
    public static void main(String[] args) {
        //  minAndMaxNr();
        // mainDiagonal();
        //  secondaryDiagonal();
        numbersBelowSecondDiagonal();
    }

    // Citeste un array bidimensional de la tastatura de dimensiunea N x M si afiseaza min si max
    private static void minAndMaxNr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int[][] arr = new int[d1][d2];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.println("Enter [" + i + "][" + j + "] element: ");
                arr[i][j] = scanner.nextInt();

            }
        }
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Min is " + min + " and max is: " + max);
    }

    //  *7-Citeste un array bidimensional de la tastiera de lungimea N x M si afiseaza diagonala principala
    private static void mainDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimensions of the array : ");
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int[][] arr = new int[d1][d2];
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element: ");
                arr[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {

                    System.out.print(arr[i][j] + " ");

                }
            }
            System.out.println();
        }
    }

    //*8-Citeste un array bidimensional de la tastiera de lungimea N x M si afiseaza diagonala secundara
    private static void secondaryDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimensions of the array : ");
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int[][] arr = new int[d1][d2];
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element: ");
                arr[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }

            System.out.print(arr[i][arr[i].length - 1 - i] + " ");
        }

        System.out.println();
    }

    // *10-Citeste un array bidimensional de la tastiera de lungimea N x M si afiseaza desupt la diagonala secundara
    private static void numbersBelowSecondDiagonal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension ofthe array: ");
        int d = scanner.nextInt();
        int[][] arr = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < d; j++) {
                if (j > arr[i].length - 1 - i) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
