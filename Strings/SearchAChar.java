import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        String a = sc.nextLine();
    
        if(a.contains(String.valueOf(c)))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
    }
}
