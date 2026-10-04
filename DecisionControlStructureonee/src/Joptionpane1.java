import javax.swing.JOptionPane;


public class Joptionpane1 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a Year");

        int year = Integer.parseInt(input);

        if (year % 400 == 0){
            JOptionPane.showMessageDialog(null, year + " Is a leap year.");
        }else if (year % 100 == 0){
            JOptionPane.showMessageDialog(null, year + " Not a leap year." );
        }else if (year % 4 == 0){
            JOptionPane.showMessageDialog(null, year + " Is a leap year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " Not a leap year.");
        }





    }
}

