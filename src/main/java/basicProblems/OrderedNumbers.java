package basicProblems;

import java.util.Scanner;

public class OrderedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int nr = scanner.nextInt();
        int temp = 0;
        boolean isOrdered = false;

        for (int i = 0; i < nr; i++) {
            if (i == 0) {
                temp = scanner.nextInt();
            } else {
                int number = scanner.nextInt();
                if (temp <= number) {
                    isOrdered = true;
                    temp = number;
                } else {
                    isOrdered = false;
                    break;
                }
            }
        }
        if (isOrdered) {
            System.out.println("Crescator");
        } else {
            System.out.println("Nu este crescator");
        }
    }
}
