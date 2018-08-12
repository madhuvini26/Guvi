/*
57 - Design an algorithm to accept 2 strings A and B from the user, and check whether any part of string A 
(comprising of minimum of 2 consecutive characters) is a sub-string of string B.
Input Size : A<=1000, B<=1000
Example:
INPUT
abcxyz hagsaabc
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String s1=sc.next();
        String s2=sc.next();
        boolean contains=false;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+2;j<s1.length();j++)
            {
                if(s2.contains(s1.substring(i,j)))
                {
                    contains=true;
                    break;
                }                    
            }
        }
        System.out.println("Output :");
        if(contains)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
