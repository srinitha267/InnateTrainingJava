import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int r=0;
        
        int rs500=amount/500;
        amount=amount%500;
        
        int rs100=amount/100;
        amount=amount%100;

        int rs50=amount/50;
        amount=amount%50;
       
        int rs20=amount/20;
        amount=amount%20;
        
        int rs10=amount/10;
        amount=amount%10;

        int rs5=amount/5;
        amount=amount%5;

        int rs2=amount/2;
        amount=amount%2;

        int rs1=amount/1;
        amount=amount%1;

        System.out.println("Total number of notes: ");
        System.out.println("500 : "+rs500);
        System.out.println("100 : "+rs100);
        System.out.println("50 : "+rs50);
        System.out.println("20 : "+rs20);
        System.out.println("10 : "+rs10);
        System.out.println("5 : "+rs5);
        System.out.println("2 : "+rs2);
        System.out.println("1 : "+rs1);
    
    }
}
