package basicProblems;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        findNextNumber();
    }

    private static void findNextNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int nr1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int nr2 = scanner.nextInt();
        int max;
        int min;
        System.out.print("Enter the index of wanted element: ");
        int indexOfNextElement = scanner.nextInt();
        if (nr1 > nr2) {
            max = nr1;
            min = nr2;
        } else {
            max = nr2;
            min = nr1;
        }
        int progression = max - min;
        int nextElement = min + progression * (indexOfNextElement - 1);
        System.out.println("Your number is : " + nextElement);
    }
}
