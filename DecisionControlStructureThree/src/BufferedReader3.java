import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader3 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(br.readLine());

            System.out.print("Enter parents' salary: ");
            double salary = Double.parseDouble(br.readLine());

            System.out.print("Enter entrance exam score: ");
            double entrance = Double.parseDouble(br.readLine());

            double average = (nsat + entrance) / 2;

            if (salary > 10000 || nsat < 90 || entrance < 85) {
                System.out.println("Rejected");
            }
            else if (salary <= 3500 && average >= 91) {
                System.out.println("Accepted");
            }
            else {
                System.out.println("For further study");
            }

        } catch (IOException e) {
            System.out.println("Input error.");
        }
    }
}