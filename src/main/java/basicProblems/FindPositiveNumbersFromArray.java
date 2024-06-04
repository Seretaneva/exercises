package basicProblems;

import java.util.Scanner;

public class FindPositiveNumbersFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int nr = scanner.nextInt();
        int[] array1 = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[nr];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 0) {
                array2[i] = array1[i];
                count ++;
            }

        }
        System.out.print("The dimension of the array is " + count);
        System.out.println();
        System.out.println("The positive numbers are :  ");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 0) {
                System.out.print(array2[i] + " ");

            }
        }
    }
}
