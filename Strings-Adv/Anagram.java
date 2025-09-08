import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        
        String l1=s1.toLowerCase();
        String l2=s2.toLowerCase();
        
        if(l1.length()==l2.length()){
            char[] c1 = l1.toCharArray();
            char[] c2 = l2.toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            boolean result=Arrays.equals(c1,c2);
            
            if(result){
                System.out.print(s1 +" and "+ s2 +" are Anagrams.");
            }
            else{
                System.out.print(s1 +" and "+ s2 +" are Not Anagrams.");
            }
        }
        else{
            System.out.print(s1 +" and "+ s2 +" are Not Anagrams.");
        } 
    }
}
