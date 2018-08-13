/*
Given a string  of length N, find the longest palindromic substring.
Input Size : 1 <= N <= 1000
Sample Testcase :
INPUT
RADAR
DIEHEIDI
OUTPUT
RADAR
DIEHEID
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String string=sc.next();
        String largestPalindrome=new String();
        int maxLength=0;
        
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<=string.length();j++)
            {
                String subString=string.substring(i,j);
                if(isPalindrome(subString))
                {
                    if(subString.length() > maxLength)
                    {
                        largestPalindrome=subString;
                        maxLength=subString.length();
                    }
                }
            }
        }
        System.out.println("Output : \n" +largestPalindrome);
    }
    private static boolean isPalindrome(String string)
    {
        return string.equalsIgnoreCase((new StringBuilder(string).reverse()).toString());
    }
    
}
