import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num=0;
        
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                num=num+i; 
            }
        }
        if(num==b)
            System.out.print("Amicable Pair");
        else
            System.out.print("Not a Amicable Pair");
    }
}
