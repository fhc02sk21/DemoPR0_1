import java.util.Scanner;

public class DemoApp {

    // main / psvm
    public static void main(String[] args) {

        int yearOfBirth = 0;
        int currentYear = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Jahr ein: ");
        yearOfBirth = console.nextInt();

        System.out.println("Das Geburtsjahr lautet: " + yearOfBirth);

        System.out.println("Welches Jahr haben wir aktuell?");
        currentYear = console.nextInt();

        int age = currentYear - yearOfBirth;

        System.out.println("Ihr Alter lautet: " + age);
    }
}
