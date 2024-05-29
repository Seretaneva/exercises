package basicProblems;

public class RowInAPage {
    public static void main(String[] args) {
        findRowAndPage(15, 43);
    }

    private static void findRowAndPage(int rows, int nrOfRow) {
        int page = 1;
        while (nrOfRow > rows){
            page++;
            nrOfRow = nrOfRow - rows;
        }
        System.out.println("Number of the page is : " + page + " and the number of the row is : " + nrOfRow);
    }
}
