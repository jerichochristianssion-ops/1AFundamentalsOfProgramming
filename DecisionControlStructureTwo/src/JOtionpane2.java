import javax.swing.JOptionPane;

public class JOtionpane2 {

    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog(
                "Enter hourly pay rate:");

        double rate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog(
                "Enter hours worked:");

        double hours = Double.parseDouble(hoursInput);

        double grossPay = rate * hours;

        double withholdingRate;


        if (grossPay <= 2000) {
            withholdingRate = 0.10;
        } else if (grossPay <= 4000) {
            withholdingRate = 0.12;
        } else if (grossPay <= 10000) {
            withholdingRate = 0.15;
        } else {
            withholdingRate = 0.20;
        }

        double withholdingTax = grossPay * withholdingRate;
        double netPay = grossPay - withholdingTax;

        String result = String.format(
                "Gross Pay: PHP %.2f\n" +
                        "Withholding Tax: PHP %.2f\n" +
                        "Net Pay: PHP %.2f",
                grossPay, withholdingTax, netPay);

        JOptionPane.showMessageDialog(null, result);
    }
}