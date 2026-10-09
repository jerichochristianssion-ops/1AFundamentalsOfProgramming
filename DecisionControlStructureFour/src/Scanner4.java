import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter Citizenship code (C/N): ");
        char citizenship = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter Recomendee code (R/N)");
        char recomendee = sc.next().toUpperCase().charAt(0);

        if (recomendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }

        sc.close();
    }
}