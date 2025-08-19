import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count=0;
        
        for(int i=0;i<=a.length()-1;i++){
            char c = a.charAt(i);
            count++;
        }
        System.out.print(count);
    }
}
