package doubleFor;

import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if (m > n) {
                for (int j = n; j <= m; j++) {
                    System.out.print(j + " ");
                }
            } else if (n > m) {
                for (int j = m; j <= n; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }

}
