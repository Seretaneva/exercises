package problemsWithFor;

public class OddNrFrom100ToNeg100 {
    public static void main(String[] args) {
        for (int i = 99; i >= -99; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}
