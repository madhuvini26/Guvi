/*
Let quasi-palindromic number be such number that adding some leading zeros (possible none) to it produces a palindromic string. String t is called a palindrome, if it reads the same from left to right and from right to left. For example, numbers 131 and 2010200 are quasi-palindromic, they can be transformed to strings '131' and '002010200', respectively, which are palindromes. You are given some integer number x. Check if it's a quasi-palindromic number.
Input Size : 1<=N<=1000000000
Example:
INPUT
131
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class QuasiPalindrome {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String number=String.valueOf(sc.nextInt());
        boolean quasiPalindrome=false;
        for(int i=0;i<=trailingZeros(number)-leadingZeros(number);i++)
        {
            if(isPalindrome(number))
            {
                quasiPalindrome=true;
                break;
            }
            number="0"+number;
        }
        if(quasiPalindrome)
            System.out.println("Output :\nyes");
        else
            System.out.println("Output :\nno");
    }
    private static boolean isPalindrome(String number)
    {
        return number.equalsIgnoreCase((new StringBuilder(number).reverse()).toString());
    }
    private static int trailingZeros(String number)
    {
        String reverse=(new StringBuilder(number).reverse()).toString();
        return leadingZeros(reverse);
    }
    private static int leadingZeros(String number)
    {
        int count=0;
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)!='0')
                break;
            count++;
        }
        return count;
    }
}
