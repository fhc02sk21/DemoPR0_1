public class TeilerFindenApp {

    public static void main(String[] args) {

        int valueCheck = 99991;
        int countTeiler = 0;
        int i = 1;
        while (i <= valueCheck) {
            int rest = valueCheck % i;
            if (rest == 0) { // equals
                System.out.println(i + " ist ein Teiler von " + valueCheck);
                countTeiler = countTeiler + 1;
            }

            //i = i + 1;
            //i += 1;
            i++;
        }
        if (countTeiler == 2) {
            System.out.println(valueCheck + " ist eine Primzahl");
        }
        else {
            System.out.println(valueCheck + " ist keine Primzahl");
        }

    }
}
