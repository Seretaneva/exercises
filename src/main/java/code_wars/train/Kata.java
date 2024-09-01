package code_wars.train;

public class Kata {
    public static void main(String[] args) {
        boolean isPassed = solution("Evelina","na");
        System.out.println(isPassed);
    }
    public static boolean solution(String str, String ending) {
        if (!str.isEmpty() && ending.length() <= str.length()) {
            if (ending.isEmpty()) {
                return true;
            }
            int lengthOfEnding = ending.length();
            int indexOfEnding = 0;
            boolean isEqual = false;
            for (int i = str.length() - lengthOfEnding; i < str.length(); i++) {
                if (str.charAt(i) == ending.charAt(indexOfEnding)) {
                    indexOfEnding++;
                    isEqual = true;
                } else {
                    isEqual = false;
                    break;
                }
            }

            return isEqual;
        }
        return false;
    }

}
