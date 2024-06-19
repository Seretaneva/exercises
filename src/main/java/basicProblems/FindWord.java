package basicProblems;

import java.util.Scanner;

public class FindWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        long startTime = System.nanoTime();
        String text = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.contains("Eva") || text.contains("eva")) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("S-a gasit cuvintul");
        } else {
            System.out.println("Nu exista asa cuvint ");
        }
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Timpul de execuție în milisecunde: eva " + duration / 1_000_000);



    }


}
