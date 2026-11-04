import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DineroAccount {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            double balance = 20000.00;
            double amount;

            while (true) {

                System.out.print("Enter amount (0 to stop): ");
                amount = Double.parseDouble(br.readLine());

                if (amount == 0) {
                    break;
                }

                if (amount > 0) {
                    balance += amount;
                } else {
                    if (balance >= Math.abs(amount)) {
                        balance += amount;
                    } else {
                        System.out.println("INSUFFICIENT FUNDS!");
                    }
                }

                System.out.printf("Outstanding Balance: %.2f%n", balance);
            }

            System.out.printf("Final Balance: %.2f%n", balance);

        } catch (IOException e) {
            System.out.println("Input error!");
        }
    }
}