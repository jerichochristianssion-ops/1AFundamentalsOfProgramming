import javax.swing.JOptionPane;

public class JOptionpane4 {
    public static void main(String[] args) {
        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height (cm):"));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));

        char citizenship = JOptionPane.showInputDialog(
                        "Enter citizenship code (C/N):")
                .toUpperCase().charAt(0);

        char recommendee = JOptionPane.showInputDialog(
                        "Enter recommendee code (R/N):")
                .toUpperCase().charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25
                        && citizenship == 'C')) {
            JOptionPane.showMessageDialog(null,
                    "Accepted");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Rejected");
        }
    }
}