import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int pos=0;
        
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int data = sc.nextInt();
        for(int i=0;i<size;i++){
            if(data==a[i]){
                pos+=1;
            }
        }
        if(pos==1){
            System.out.print("Found");
        }
        else{
            System.out.print("Not found");
        }
    }
}
