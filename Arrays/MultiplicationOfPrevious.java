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
        int arr[] = new int[n];
        int mul[] = new int[n];
        
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0)
                mul[i] = arr[i] * arr[i + 1]; // First 
            else if (i == n - 1)
                mul[i] = arr[i] * arr[i - 1]; // Last 
            else
                mul[i] = arr[i - 1] * arr[i + 1]; // Midd
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mul[i] + " ");
        }
    }
}
