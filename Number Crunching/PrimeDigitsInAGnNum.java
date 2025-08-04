import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n,p=1,ld;
        n=sc.nextLong();
        long copy=n;
        
        while(n>0){ //12345
            n=n/10; //n=1234//123//12//1//0
            p=p*10; //p=10//100//1000//10000
        }
        p=p/10; //p=10000/10=1000
        n=copy; //n=12345
        while(p>0){ //1000>0
            ld=n/p; //ld=1//2//3//4//5//0
            n=n%p;  //n=2345//345//45//5//0
            p=p/10; //p=1000//100//10//1//0
            if(ld==2||ld==3||ld==5||ld==7)
                System.out.print(ld+" ");
            
        }
    }
}
