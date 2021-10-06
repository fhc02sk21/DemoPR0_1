import java.util.Scanner;

public class KilometerCalculatorDemoApp {

    public static void main(String[] args) {

        double kilometer = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Kilometerwert ein: ");

        kilometer = sc.nextDouble();

        double calculatedMiles = km2Landmiles(kilometer);
        //calculatedMiles = km2Landmiles(kilometer);
        System.out.println("calculatedMiles = " + calculatedMiles); // soutv
        
        double newKilometer = landmiles2Km(calculatedMiles);
        System.out.println("newKilometer = " + newKilometer);
    }

    public static double km2Landmiles(double km){
        double miles = km * 0.6214;
        return miles;
    }

    public static double landmiles2Km(double miles) {
        return miles / 0.6214;
    }

}
