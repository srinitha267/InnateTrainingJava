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
        int a[]=new int[size+1];
        int data,pos;
        
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        data=sc.nextInt();
        pos=sc.nextInt();
        for(int i=size;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=data;
        for(int i=0;i<size+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
