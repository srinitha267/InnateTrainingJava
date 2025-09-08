import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int l=0,u=0,d=0,s=0;
        
        if(a.length()>=10){
            for(int i=0;i<a.length();i++){
                char ch = a.charAt(i);
                
                if(ch>='a' && ch<='z'){
                    l++;
                }else if(ch>='A' && ch<='Z'){
                    u++;
                }else if(ch>='0' && ch<='9'){
                    d++;
                }else{
                    s++;
                }
            }
            if(l>0 && u>0 && d>0 && s>0)
                System.out.println("Strong password");
            else
                System.out.println("Weak password");
        }
        else
            System.out.println("Weak password");
    }
}
