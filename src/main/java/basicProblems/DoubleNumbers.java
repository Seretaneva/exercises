package basicProblems;

import java.util.Scanner;

public class DoubleNumbers {
    public static void main(String[] args) {
        findDoubleNumbers();
    }

    private static void findDoubleNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int dim = scanner.nextInt();
        int[] array1 = new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            array1[i] = scanner.nextInt();
        }
        int count = 0;
        boolean isContinue = false;
        System.out.println("The doubled numbers are: ");
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] * 2 == array1[i + 1]) {
                if (isContinue) {
                    count++;
                } else {
                    count += 2;
                }
                isContinue = true;
            } else {
                isContinue = false;
            }
        }
        int[] array2 = new int[count];
        count = 0;
        isContinue = false;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] * 2 == array1[i + 1]) {
                if (isContinue) {
                    array2[count++] = array1[i + 1];
                } else {
                    array2[count++] = array1[i];
                    array2[count++] = array1[i + 1];
                }
                isContinue = true;
            } else {
                isContinue = false;
            }

        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 0) {

                System.out.print(array2[i] + " ");
            }
        }
    }
}
