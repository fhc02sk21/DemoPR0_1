import java.util.Scanner;

public class OperatorDemoApp {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Wert für a eingeben:");
        a = sc.nextInt();
        System.out.println("Bitte Wert für b eingeben:");
        b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int multiplicate = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + multiplicate);
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " % " + b + " = " + modulo);

    }
}
