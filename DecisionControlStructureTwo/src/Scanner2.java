import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        double grossPay = rate * hours;

        double withholdingRate;
        if (grossPay <= 2000) {
            withholdingRate = 0.10;
        } else if (grossPay <= 4000) {
            withholdingRate = 0.12;
        } else if (grossPay <= 10000) {
            withholdingRate = 0.15;
        } else {
            withholdingRate = 0.20;
        }

        double withholdingTax = grossPay * withholdingRate;
        double netPay = grossPay - withholdingTax;


        System.out.printf("Gross Pay: PHP %.2f%n", grossPay);
        System.out.printf("Withholding Tax: PHP %.2f%n", withholdingTax);
        System.out.printf("Net Pay: PHP %.2f%n", netPay);

        input.close();
    }
}

