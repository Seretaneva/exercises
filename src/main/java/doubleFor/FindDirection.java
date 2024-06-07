package doubleFor;

import java.util.Objects;
import java.util.Scanner;

public class FindDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter direction: ");
        String direction = scanner.nextLine();
        for (int i = 1; i <= x; i++) {
            if (Objects.equals(direction, "crescator")) {
                if (m > n) {
                    for (int j = n; j <= m; j++) {
                        System.out.print(j + " ");
                    }
                } else if (n > m) {
                    for (int j = m; j <= n; j++) {
                        System.out.print(j + " ");
                    }
                }
            } else if (Objects.equals(direction, "descrescator")) {
                if (m > n) {
                    for (int j = m; j >= n; j--) {
                        System.out.print(j + " ");
                    }
                } else if (n > m) {
                    for (int j = n; j >= m; j--) {
                        System.out.print(j + " ");
                    }
                }
            } else {
                System.out.println("Error!");
            }
            System.out.println();
        }
    }
}