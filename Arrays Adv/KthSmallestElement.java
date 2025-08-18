import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        
        if (k > size || k <= 0) {
            System.out.println("Out of Range");
        } else {
            Arrays.sort(a);
            System.out.println(a[k - 1]);
        }
    }
}
