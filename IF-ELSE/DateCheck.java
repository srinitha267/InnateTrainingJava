import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String Date = sc.nextLine();
        String[] d = Date.split("/");
        
        int date = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int year = Integer.parseInt(d[2]);
        
        if(year>1900 && year<9999 && (month==1||month==3||month==5||month==7||month==8||month==10||month==12) && date>0 && date<32)
            System.out.println("Valid");
        else if(year>1900 && year<9999 && (month==4||month==6||month==9||month==11) && date>0 && date<31)
            System.out.println("Valid");
        else if(year>1900 && year<9999 && month==2 && date>0 && date<28)
            System.out.println("Valid");
        else if(year>1900 && year<9999 && month==2 && date==29 && year%400==0 && year%100==0 && year%4==0)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
            
    }
}
