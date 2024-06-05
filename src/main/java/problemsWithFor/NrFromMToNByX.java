package problemsWithFor;

import java.util.Scanner;

public class NrFromMToNByX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        System.out.print("The numbers are: ");
        for (int i = m; i <= n; i = i + x){
            System.out.print(i + " ");
        }
    }
}
