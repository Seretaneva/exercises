package basicProblems;

import java.util.Scanner;

public class NrFibonacci {
    public static void main(String[] args) {
        nrFibonacci();
    }

    private static void nrFibonacci() {
        int nr = 9;
        int fibonacci = 0;
        int previous = 1;
        int next = 1;
        for (int i = 3; i <= nr; i++) {
            fibonacci = previous + next;
            previous = next;
            next = fibonacci;
        }
        System.out.println(fibonacci);
    }
}