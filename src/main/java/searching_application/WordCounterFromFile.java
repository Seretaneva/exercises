package searching_aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class WordCounterFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        while (1 == 1) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                String linie;
                int count = 0;

                System.out.print("Enter the word: ");
                String word = scanner.nextLine();

                while ((linie = br.readLine()) != null) {
                    String[] words = linie.split("[\\s\\.]+");
                    for (int i = 0; i < words.length; i++) {
                        if (Objects.equals(word, words[i])) {
                            count++;
                        }
                    }
                    System.out.print(word + "->" + count + " ");
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
