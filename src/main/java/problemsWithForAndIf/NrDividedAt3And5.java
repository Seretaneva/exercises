package problemsWithForAndIf;

import java.util.Scanner;

public class NrDividedAt3And5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();
        System.out.print("Enter m number: ");
        int m = scanner.nextInt();
        for (int i = n; i <=m;i++){
            if (i%3 == 0 || i%5 == 0){
                System.out.print(i + " ");
            }
        }
    }

}
