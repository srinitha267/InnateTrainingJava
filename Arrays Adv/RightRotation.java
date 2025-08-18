import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int rotate=sc.nextInt();
        rotate=rotate%size;
        rotate=(size-rotate) % size;
        for(int i=0;i<size;i++){
            System.out.print(a[(i+rotate)% size]+" ");
        }
    }
}
