package basicProblems;

import java.util.Scanner;

public class NrFibonacci {
    public static void main(String[] args) {
        nrFibonacci();
    }

    private static void nrFibonacci() {
        int nr = 7;
        int fibonacci = 0;
        int previous = 1;
        int next = 1;
        if (nr == 0) {
            System.out.println(0);
        } else if (nr == 1) {
            System.out.println(1);
        } else if (nr == 2) {
            System.out.println(1);
        } else {
            for (int i = 3; i <= nr; i++) {
                fibonacci = previous + next;
                previous = next;
                next = fibonacci;
            }
            System.out.println(fibonacci);
        }
    }
}