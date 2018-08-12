/*
33 - Given a string S, print the longest substring P such that P > S lexicographically. You may assume that such substring exists.
Input Size : |S|<=10000
Example:
INPUT
string
OUTPUT
tring
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class LongestGreaterSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String s=sc.next();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) > s.charAt(0))
            {
                System.out.println("Output :\n" + s.substring(i));
                break;
            }
        }
    }
}
