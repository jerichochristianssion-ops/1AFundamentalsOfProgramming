import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BuffedStreamReader {
    public static void main(String[] args) {

        try {
            BufferedReader dataIn = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("Enter a year: ");
            int year = Integer.parseInt(dataIn.readLine());

            if (year % 400 == 0) {
                System.out.println("Leap year.");
            } else if (year % 100 == 0) {
                System.out.println("Not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println("Leap year.");
            } else {
                System.out.println("Not a leap year.");

                // Buffered Reader reads the year entered by user.
// if-else statement checks if the input is a leap year or not a leap year
                // while Integer.parseInt converts the text into a integer.
                //InputStream allows it to read the keyboards inputs.
                // and of course system.out.println displays the result
            }

        } catch (IOException e) {
            System.out.println("An input/output error occurred.");
        }
    }
}