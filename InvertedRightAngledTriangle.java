/*
Given a number N print a right-angled triangle with the top level having n 1's and each level is one 1 lesser.
Input Size : N <= 1000
Sample Testcase :
INPUT
3
OUTPUT
1 1 1
1 1
1
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        
        int n=sc.nextInt();
        
        System.out.println("Output : ");
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("1");
            System.out.println();
        }   
    }
}
