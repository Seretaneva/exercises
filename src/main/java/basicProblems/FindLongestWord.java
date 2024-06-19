package basicProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FindLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        String max = words[0];
        for (int i = 0; i < words.length - 1; i++) {
            if (max.length() < words[i + 1].length()) {
                max = words[i + 1];
            }
        }
        System.out.println(max);
        System.out.println("Contine " + max.length() + " litere.");

    }
}
