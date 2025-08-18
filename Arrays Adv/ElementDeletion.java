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

        int pos = sc.nextInt();
        if (pos < 1 || pos > size) { 
            System.out.print("Deletion not possible.");
            return;
        }

        for (int i = pos - 1; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
