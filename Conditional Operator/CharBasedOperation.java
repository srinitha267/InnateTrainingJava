import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b =sc.nextInt();
        
        int operator;
        switch(ch){
            case '+':
                operator=a+b;
                break;
            case '-':
                operator=a-b;
                break;
            case '*':
                operator=a*b;
                break;
            case '/':
                operator=a/b;
                break;
            default:
                operator=0;
                break;
                
        }
        System.out.println(operator);
        
        
    }
}
