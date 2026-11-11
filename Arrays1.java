public class Arrays1 { // pangalan ng class
    public static void main(String[] args) { // saan mag sisimula ang program

        //gumawa ng double array na may eksaktong 5 elements
        double[] temperatura = new double[5];

        //lagyan ang temperatura ang baway index

        temperatura[0] = 32.5; // 1st day
        temperatura[1] = 34.0; //2nd day
        temperatura[2] = 31.8; // 3rd day
        temperatura[3] = 33.2; // 4th day
        temperatura[4] = 35.1; // 5th day

        // gumamit ng for loop para ma print lahat ng temperatura

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Day "+(i+1)+": " + temperatura[i]);
        }

        // palitan ang temperatura sa third day mula 31.8 papuntang 32.0
        temperatura[2] = 32.0;

        // print ang updated ng temperatura sa third day
        System.out.println("Updated third day temperature: "+temperatura[2]);

    }
}