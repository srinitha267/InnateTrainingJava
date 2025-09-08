import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[\\s-]", ""); // Remove hyphens and spaces
        
        if (cleaned.length() == 10) {
            if (isValidISBN10(cleaned)) {
                System.out.println("ISBN Number is Valid");
            } else {
                System.out.println("ISBN Number is Not Valid");
            }
        } else if (cleaned.length() == 13) {
            if (isValidISBN13(cleaned)) {
                System.out.println("ISBN Number is Valid");
            } else {
                System.out.println("ISBN Number is Not Valid");
            }
        } else {
            System.out.println("ISBN Number is Not Valid");
        }
    }
    
    public static boolean isValidISBN10(String s) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            char c = s.charAt(i);
            int digit;
            if (i == 9 && (c == 'X' || c == 'x')) {
                digit = 10;
            } else if (Character.isDigit(c)) {
                digit = c - '0';
            } else {
                return false; // Invalid character
            }
            sum += digit * (i + 1);
        }
        return (sum % 11 == 0);
    }
    
    public static boolean isValidISBN13(String s) {
        // Check if all are digits
        if (!s.matches("\\d+")) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int digit = s.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }
        return (sum % 10 == 1||sum % 10 == 0);
    }
}
