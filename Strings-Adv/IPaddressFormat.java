import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine(); 
        String[] parts = ip.split("\\.");  // Split by dot

        // Must have exactly 4 parts
        if (parts.length != 4) {
            System.out.println("Invalid");
            return;
        }

        boolean valid = true;

        for (String part : parts) {
            // Check if digits only
            if (!part.matches("\\d+")) {
                valid = false;
                break;
            }

            int num = Integer.parseInt(part);

            // Check range
            if (num < 0 || num > 255) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
