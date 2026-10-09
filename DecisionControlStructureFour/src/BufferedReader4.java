import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            System.out.print("Enter height (cm): ");
            double height = Double.parseDouble(br.readLine());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter citizenship code (C/N): ");
            char citizenship = br.readLine().toUpperCase().charAt(0);

            System.out.print("Enter recommendee code (R/N): ");
            char recommendee = br.readLine().toUpperCase().charAt(0);

            if (recommendee == 'R' ||
                    (height >= 200 && age >= 21 && age <= 25
                            && citizenship == 'C')) {
                System.out.println("Applicant Accepted");
            } else {
                System.out.println("Applicant Rejected");
            }

        } catch (IOException e) {
            System.out.println("Input error.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }
}