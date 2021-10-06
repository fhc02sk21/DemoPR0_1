public class DemoMethodsApp {

    public static void main(String[] args) {
        int currentDay = 6;
        int countDays = 7;

        doCalculate(currentDay, countDays);
        System.out.println("countDays = " + countDays);
        System.out.println("currentDay = " + currentDay);
        System.out.println("program finished");
        
        int sum = performCalculate(countDays, currentDay);
        System.out.println("sum = " + sum);
    }

    public static void doCalculate(int a, int b){
        a = 11;
        b = 19;
        System.out.println("a = " + a + ", b = " + b + ", sum = " + (a + b));
    }

    public static int performCalculate(int a, int b) {
        int erg = a + b;
        return erg;
    }
}
