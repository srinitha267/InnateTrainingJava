import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + (units - 150) * 1.20;
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 250) * 1.50;
        }

        double surcharge = bill * 0.20;
        double total = bill + surcharge;

        System.out.printf("%.2f", total);
    }
}
