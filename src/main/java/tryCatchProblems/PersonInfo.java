package tryCatchProblems;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

//scrie un program care:
//- cere sa introduca numele, prenumele, data nasterii in formatul dd/mm/yyyy si valideaza datele
// (numele si prenumele sa contina mai mult de 3 caractere, sa nu contina numere, si data sa fie in formatul
// corect, si valorile sa fie corecte), daca nu-s corecte sa arunge IllegalArgumentException cu mesajul
// corespunzator
public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Enter date of birth : ");
        Date birthday = Date.from(Instant.ofEpochSecond(scanner.nextInt()));

    }
}
