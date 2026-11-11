import java.util.Arrays;

public class Arrays2 { // panglan ng klass

    public static void main(String[] args) { //simula ng klass


// gumawa ng 2d string array na may 2 rows at 3 columns
        String[][] seats ={
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"},

        };
        // I print ang pangalan sa second row third column

        System.out.println("Second row, third column;"+ seats[1][2]);

        // tangalin ang pangalin ni bob at ilagay Vacant
        seats [0][1]= "Vacant";

        // print ang buong seating arrangement sa isang linya

        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));
    } // tapos ng main method

}// tapos ng end of class

// import java.util.Arrays ay importante para magamit natin ang Arrays.deeoToString.
// Ang String [] [] seats ay nag gagawa ng 2d array na merong dalawang rows at tatlong columns.
// Ang Arrays.deepToString ay pinapakita ang buong lan ng 2d array sa isang line.