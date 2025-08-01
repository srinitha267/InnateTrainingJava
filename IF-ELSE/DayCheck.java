import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int daynum = sc.nextInt();
        
        String day;
        switch(daynum){
            case 0: 
                day="Sunday";
                break;
            case 1: 
                day="Monday";
                break;
            case 2: 
                day="Tuesday";
                break;
            case 3: 
                day="wednesday";
                break;
            case 4: 
                day="Thursday";
                break;
            case 5: 
                day="Friday";
                break;
            case 6: 
                day="Saturday";
                break;
            default:
                day="Invalid";
                break;       
        }
        System.out.println(day);
        
    }
}
