package code_wars.train;


import javax.security.sasl.SaslClient;
import java.util.ArrayList;

/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
 */
public class SquareDigit {
    public static void main(String[] args) {
      int result =   findSquareDigit(6793);
        System.out.println(result);
    }

    public static int findSquareDigit(int nr) {
        String number = String.valueOf(nr);
        ArrayList<Integer> transformedNr = new ArrayList<>();
        String transformedNumb = "";
        for (int i = 0; i < number.length(); i++) {
            transformedNr.add(Integer.parseInt(String.valueOf(number.charAt(i))));
        }
        for (int i = 0; i < transformedNr.size(); i++) {
            int squareNr = transformedNr.get(i) * transformedNr.get(i);
            transformedNumb = transformedNumb + squareNr;
        }
        return Integer.parseInt(transformedNumb);
    }
}