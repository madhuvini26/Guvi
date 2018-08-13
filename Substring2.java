/*
Given a String S and a string P, find if P is a substring of S. Print 'yes' if it is a substring else 'no'.
Input Size : |s| <= 10000 |p| <= 1000.
Sample Testcase :
INPUT
sundar sun
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Substring2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("Output :\n" + (s1.contains(s2) ? "yes" : "no"));
    }
}
