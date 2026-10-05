import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffered {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("Enter hourly pay rate: ");
            double rate = Double.parseDouble(br.readLine());

            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(br.readLine());

            double grossPay = rate * hours;
            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double tax = grossPay * taxRate;
            double netPay = grossPay - tax;

            System.out.printf("Gross Pay: PHP %.2f%n", grossPay);
            System.out.printf("Withholding Tax: PHP %.2f%n", tax);
            System.out.printf("Net Pay: PHP %.2f%n", netPay);

        } catch (IOException e) {
            System.out.println("Input error.");
        }
    }
}

