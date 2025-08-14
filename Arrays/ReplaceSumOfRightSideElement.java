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
        int arr[] = new int [size];
        int result [] = new int [size];
        
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < size ; i++){
            int sum = 0;
            for(int j = i + 1 ; j < size ; j++){
            sum+= arr[j];
            }
            result[i]=sum;
        }
        for(int i = 0 ; i < size ; i++){
            System.out.print(result[i]+" ");
        }
    }
}
