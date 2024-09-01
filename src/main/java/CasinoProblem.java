import java.util.Scanner;
/* Input data
The first line of the input file INPUT.TXT contains one even natural number N (2 ≤ N ≤ 100). The second line of the input file contains exactly N numbers Ai(1 ≤ Ai ≤ 106) – numbers written on playing cards. All numbers in the line are separated by single spaces, Ai is the number written on the i-th card. Cards are numbered sequentially, starting with one.

Imprint
The only line of the output file OUTPUT.TXT must contain exactly one integer - the maximum win that Shrek can get, taking into account his unique ability to see the numbers written on the cards.*/
public class CasinoProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many cards are on the table: ");
        int nrOfCards = scanner.nextInt();
        int[] totalCards = new int[nrOfCards];
        for (int i = 0; i < nrOfCards; i++) {
            totalCards[i] = scanner.nextInt();
        }
        int sumOfClosedCards = 0;
        int sumOfOpenCards = 0;
        if (nrOfCards % 2 == 0 && nrOfCards >= 2) {
            for (int i = 0; i < nrOfCards - 1; i++) {
                for (int j = 0; j < nrOfCards - 1; j++) {
                    if (totalCards[j] > totalCards[j + 1]) {
                        int temp = totalCards[j];
                        totalCards[j] = totalCards[j + 1];
                        totalCards[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < nrOfCards / 2; i++) {
                sumOfClosedCards += totalCards[i];
            }
            for (int i = nrOfCards / 2; i < nrOfCards; i++) {
                sumOfOpenCards += totalCards[i];
            }
            System.out.println("Maxim win of Shrek is : " + (sumOfOpenCards - sumOfClosedCards));
        } else {
            System.out.println("The number of cards should be even and should greater than 2!");
        }
    }
}
