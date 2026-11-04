import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class HtoL {
    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num, highest = 0, lowest = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                num = Integer.parseInt(br.readLine());

                if (i == 1) {
                    highest = num;
                    lowest = num;
                } else {
                    if (num > highest) {
                        highest = num;
                    }
                    if (num < lowest) {
                        lowest = num;
                    }
                }
            }
            System.out.println("Highest number is " + highest);
            System.out.println("Lowest number is " + lowest);
        } catch (IOException e) {
            System.out.println("Input error!");
        }}}