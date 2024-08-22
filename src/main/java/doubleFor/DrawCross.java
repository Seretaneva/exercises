package doubleFor;

import java.util.Scanner;

public class DrawCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension of the rectangle: ");
        int dimension = scanner.nextInt();
        int[][] rectangle = new int[dimension][dimension];
        findCross(dimension, rectangle);
    }

    public static void findCross(int dimension, int[][] rectangle) {
        int half = dimension / 2;
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle.length; j++) {
                if (i == half || j == half) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
