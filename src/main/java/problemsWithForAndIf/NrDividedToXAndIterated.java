package problemsWithForAndIf;

import java.util.Scanner;

public class NrDividedToXAndIterated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % x != 0 || x == 0) {
                System.out.println(i);
            } else {
                System.out.print("Enter a number : ");
                int nr = scanner.nextInt();
                i = i + nr;
                if (i % x != 0) {
                    System.out.println(i);
                } else if (i % x == 0) {
                    System.out.print("Enter a number : ");
                    nr = scanner.nextInt();
                    i = i + nr;
                    System.out.println(i);
                } else {
                    break;
                }

            }
        }

    }
}

