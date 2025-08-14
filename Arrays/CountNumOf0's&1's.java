import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int zcount = 0;
        int ocount = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] == 0) {
                zcount++;
            } else if (a[i] == 1) {
                ocount++;
            }
        }
        System.out.println("zc = " + zcount);
        System.out.println("oc = " + ocount);
    }
}
