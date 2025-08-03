import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); 

        int maxPrime = 1;  
        int i = 2;         

        while (n > 1) {
            if (n % i == 0) {
                maxPrime = i;
                while (n % i == 0) {
                    n = n / i;  
                }
            }
            i = i + 1;
        }

        if (maxPrime <= k) {
            System.out.println("Smooth Number");
        } else {
            System.out.println("Not a Smooth Number");
        }
    }
}
