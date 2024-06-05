package arrayProblems;

import java.util.Map;
import java.util.Scanner;

public class ArrayMinSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int nr = scanner.nextInt();
        int[] array = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }
        // 3 4 6 7 2 4
        for (int i =0; i < nr;i++){
            ptuMaxInTheEnd(array,nr-i);
        }

        for (int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        }
    private static void ptuMaxInTheEnd(int[] array, int nr){

        int temp = 0;
        for (int i = 0; i < nr-1;i++){

            if (array[i] > array[i+1]){
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }

        }
    }

    }




