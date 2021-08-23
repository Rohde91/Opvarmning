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

        int i = 0;
        while ( i >= 0) {

            System.out.println("Indtast endnu et tal: ");
            y = scanner.nextInt();
            sum = sum + y;
            result = sum / ++counts;
            System.out.println("Gennemsnittet af de indtastede tal er: " + result);

        }
    }
}
