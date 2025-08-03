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
        int num = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                num = num+i;
            }
        }
        System.out.print(num);
    }
}
