package problemsWithForAndIf;

import java.util.Scanner;

public class DoubledNrIFDividedAtX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        System.out.print("Enter x number: ");
        int x = scanner.nextInt();
        for (int i = n; i <=m;i++){
            System.out.print(i + " " );
            if (i%x == 0){
                System.out.print(i + " ");
            }
        }
    }
}
