import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long minPrime = n; 

        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                minPrime = i;
                break; 
            }
        }

        System.out.println(minPrime);
    }
}
