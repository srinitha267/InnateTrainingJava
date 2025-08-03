import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,i=2,count=0;
        n = sc.nextInt();
        
        while(n!=1){
            if(n%i==0){
                count++;
                n=n/i;
            }
            else{
                if(count>0)
                    System.out.println(i+"->"+count);
                i++;
                count = 0;
            }
                
        }
        System.out.println(i+"->"+count);
    }
}
        import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,i=2,count=0;
        n = sc.nextInt();
        
        while(n!=1){
            if(n%i==0){
                count++;
                n=n/i;
            }
            else{
                if(count>0)
                    System.out.println(i+"->"+count);
                i++;
                count = 0;
            }
                
        }
        System.out.println(i+"->"+count);
    }
}
        
