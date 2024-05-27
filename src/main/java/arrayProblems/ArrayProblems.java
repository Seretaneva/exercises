package arrayProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        //versaArray();
        // doubleElementArray();
        sumOfTwoArrays();
    }

    // 3- Citeste un array de la tastiera si afiseaza array-ul inversat
    private static void versaArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nr of the elements: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter an array : ");
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("This is the reverse of the array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    //  5-Citeste un array de la tastiera si afiseaza dublu la fiecare element
    private static void doubleElementArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nr of array's elements : ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array  with doubled elements is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }
    }

    // 10-Citeste doua array de la tastiera de aceias lungime si afiseaza suma numerelor de pe indexul opus (1 cu ultimu, a 2-lea cu penultimul....)
    private static void sumOfTwoArrays() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the arrays : ");
        int arrayLength = scanner.nextInt();
        int[] firstArray = new int[arrayLength];
        int[] secondArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter " + (i + 1) + " element of the first array: ");
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter " + (i + 1) + " element of the second array: ");
            secondArray[i] = scanner.nextInt();
        }
        System.out.println("The sum of the elements are : ");
        for (int i = 0; i < firstArray.length; i++) {

                System.out.println(firstArray[i] + secondArray[firstArray.length-1-i]);
        }


    }
}
