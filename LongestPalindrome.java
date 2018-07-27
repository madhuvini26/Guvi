/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

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
        System.out.print("Output : \n" +string.replace(largestPalindrome,"").length());
    }
    private static boolean isPalindrome(String string)
    {
        return string.equalsIgnoreCase((new StringBuilder(string).reverse()).toString());
    }
    
}
