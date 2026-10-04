import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // reads the input entered by the user

        System.out.print("Enter Year: ");
        int year = sc.nextInt(); // sc.nextInt() = reads the input as an integer.
        //Displays message to put in a year

        if (year % 400 == 0) {
            System.out.println(year + " Leap Year.");
        }else if (year % 100 == 0){
            System.out.println(year + " Not a leap year.");
        }else if (year % 4 ==  0 ){
            System.out.println(year + " Leap year.");
        }else{
            System.out.println(year + " Not a leap year.");
            // Checks if the year is divisible by 400.
            // % = modulus operator; returns the remainder.
            // == means "is equal to".
            // If the remainder is 0, the year is a leap year.
        }


    }
}
