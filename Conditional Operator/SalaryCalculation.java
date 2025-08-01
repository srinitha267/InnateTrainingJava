import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int bs = input.nextInt();
        float hra,da,tot;
        if(bs<=10000)
        {            
            hra = bs*0.2f;
            da = bs*0.8f;
        }
        else if(bs<=20000)
        {
            hra = bs*0.25f;
            da = bs*0.9f;
        }
        else
        {
            hra = bs*0.3f;
            da = bs*0.95f;
        }
        tot = bs+hra+da;
        System.out.printf("Rs.%.2f",tot);
    }
}
