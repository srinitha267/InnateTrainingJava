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
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 1) {
                // Odd row: print row (n times) followed by row+1
                for (int col = 1; col <= n; col++) {
                    System.out.print(row + " ");
                }
                System.out.print((row + 1) + " ");
            } else {
                // Even row: print row+1 followed by row (n times)
                System.out.print((row + 1) + " ");
                for (int col = 1; col <= n; col++) {
                    System.out.print(row + " ");
                }
            }
            System.out.println();
        }
    }
}
