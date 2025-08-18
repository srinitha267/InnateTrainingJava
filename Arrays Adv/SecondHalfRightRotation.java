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
        int a[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        
        int start = size / 2;  
        int halfLen = size - start;
        n = n % halfLen;   
        
        if (n > 0) {
            for (int l = start, r = start + n - 1; l < r; l++, r--) {
                int temp = a[l]; 
                a[l] = a[r]; 
                a[r] = temp;
            }
            
            for (int l = start + n, r = size - 1; l < r; l++, r--) {
                int temp = a[l]; 
                a[l] = a[r]; 
                a[r] = temp;
            }
            
            for (int l = start, r = size - 1; l < r; l++, r--) {
                int temp = a[l]; 
                a[l] = a[r]; 
                a[r] = temp;
            }
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
