package doubleFor;

import java.util.Scanner;

public class DrawCorners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension of the rectangle: ");
        int dimension = scanner.nextInt();
        int[][] rectangle = new int[dimension][dimension];
        findRectanglesCornersPoints(dimension, rectangle);
    }

    public static void findRectanglesCornersPoints(int dimension, int[][] rectangle) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (j == 0 && i == 0) {
                    System.out.print("* ");
                } else if (j == rectangle.length - 1 && i == 0) {
                    System.out.print("* ");
                } else if (j == 0 && i == rectangle.length - 1) {
                    System.out.print("* ");
                } else if (j == rectangle.length - 1 && i == rectangle.length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}