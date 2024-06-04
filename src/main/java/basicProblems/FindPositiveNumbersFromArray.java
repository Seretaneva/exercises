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
        System.out.println("The positive numbers are :  " );
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 0) {
                int[] array2 = new int[]{array1[i]};

                for (int j = 0; j < array2.length; j++) {

                    System.out.print(array2[j] + " ");
                }


            }

        }

    }
}
