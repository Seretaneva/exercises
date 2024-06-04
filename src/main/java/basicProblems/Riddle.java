package basicProblems;

public class Riddle {
    public static void main(String[] args) {
        findTheNumbers(6, 36);
    }

    private static void findTheNumbers(int nr1, int nr2) {
        int max = 0;
        int min = 0;
        if (nr1 > nr2) {
            max = nr1;
            min = nr2;
        } else if (nr1 < nr2) {
            max = nr2;
            min = nr1;
        } else {
            max = nr1;
            min = nr2;
        }
//5 6
//2 3
        int impartitor = max / 2;
for (int i = 0; i <= max; i++){
    if (max%2 == 1 && max% i != 0){
        impartitor = max/3;
    }
}

        if ( max%5 != 0 && max%6 != 0 && max%7 != 0  ){

        } else if (max % 5 == 0) {
            impartitor = max/5;
        }
        int scazator = min - impartitor;
        int sum = impartitor + scazator;
        int produs = impartitor * scazator;
        if (sum == min && produs == max) {
            System.out.println(scazator + " " + impartitor);
        }

    }
}
