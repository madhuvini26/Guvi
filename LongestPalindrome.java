/*
Find the length of remaining string from the given string after removing the longest palindrome from it.
Input Size : |s|<=1000
Example:
INPUT
abbac
OUTPUT
1
*/package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestPalindrome {
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
        System.out.print("Output : \n" +largestPalindrome.length());
    }
    private static boolean isPalindrome(String string)
    {
        return string.equalsIgnoreCase((new StringBuilder(string).reverse()).toString());
    }
    
}
