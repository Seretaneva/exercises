package doubleFor;

import java.util.Scanner;

public class NNrIteratedNTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int nr = scanner.nextInt();
        for (int i = 1; i <= nr; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }

        }
    }
}
