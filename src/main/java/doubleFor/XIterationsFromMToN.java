package doubleFor;

import java.util.Scanner;

public class XIterationsFromMToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        for (int i = 1 ; i <= x ;i++){
            for (int j = m; j <= n; j++){
                System.out.print(j+ " ");
            }
        }
    }
}
