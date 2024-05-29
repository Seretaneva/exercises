package basicProblems;

public class Ortografie {
    public static void main(String[] args) {
        printCorrectWord(1);
    }

    private static void printCorrectWord(int letter) {
        String word = "Elvelina";
        StringBuilder correctWord = new StringBuilder(" ");

        correctWord = new StringBuilder(word.substring(0, letter) + word.substring(letter + 1, word.length()));
        System.out.println(correctWord);
    }

}

