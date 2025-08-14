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
        int a[] = new int[n];
        
        //Boyer-Moore Majority Vote Algorithm
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            } else {
                
                System.out.println("No majority element found in the array");
                sc.close();
                return;
            }
        }
        
        
        int candidate = a[n / 2];
        
   
        int count = 0;
        for (int num : a) {
            if (num == candidate) {
                count++;
            }
        }
        
      
        if (count > n / 2) {
            System.out.println("The majority element is : " + candidate);
        } else {
            System.out.println("No majority element found in the array");
        }
    }
}
