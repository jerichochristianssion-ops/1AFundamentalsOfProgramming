import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double entrance = input.nextDouble();

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

        input.close();
    }
}