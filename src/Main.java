import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hej med dig!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast et tal: ");
        double x = scanner.nextInt();

        System.out.println("Indtast endnu et tal: ");
        double y = scanner.nextInt();

        int counts = 2;
        double sum = x + y;
        double result = sum / counts;
        System.out.println("Gennemsnittet af de indtastede tal er: " + result);
        System.out.println("Indtast endnu et tal: ");

        int i = 0;
        while ( i >= 0) {

            if (scanner.hasNextInt()) {

                y = scanner.nextInt();
                sum = sum + y;
                result = sum / ++counts;
                System.out.println("Gennemsnittet af de indtastede tal er: " + result);
                System.out.println("Indtast endnu et tal: ");

            }

            else {

                char ch = scanner.next().toUpperCase(Locale.ROOT).charAt(0);

                if (Character.toString(ch).matches("Q")) {
                    System.out.println("Slutter...");
                    break;
                }

                else {

                    System.out.println("Der er sket en fejl! Der kan kun indtastes tal. Er du færdig med at beregne skriv da Q eller q");

                }
            }
        }
    }
}
