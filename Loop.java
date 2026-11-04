import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 2; i <= 100; i+=2) {
            System.out.print(i+" ");

            if(i%20==0){
                System.out.println();
            }
        }
    }}






