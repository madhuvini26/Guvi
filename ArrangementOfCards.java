/*
Given 2 numbers N,M corresponding to the number of 0 and 1 respectively, print anarrangement of cards which satisfies the 
following conditions:
1)There wouldn't be a pair of any side-adjacent cards with zeroes in a row.
2)There wouldn't be a group of three consecutive cards containing numbers one.
Print '-1' if it is impossible.
Input Size : 1<=N<=100000
Example:
INPUT
1 2
OUTPUT
101
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class ArrangementOfCards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int zeros=sc.nextInt();
        int ones=sc.nextInt();
        
        System.out.println("Output :");
        if(ones>2*(zeros+1) || zeros>(ones+1))
        {
            System.out.println("-1");
            return;
        }              
        while(zeros>0 && ones>0)
        {
            if(ones>zeros)
            {
                System.out.print("110");
                ones-=2;
                zeros-=1;
            }
            else
            {
                if(ones==zeros)
                {
                    System.out.print("10");
                }
                else
                {
                    System.out.print("01");
                }
                ones-=1;
                zeros-=1;
            }
        }
        for(int i=1;i<=zeros;i++)
            System.out.print("0");
        for(int i=1;i<=ones;i++)
            System.out.print("1");
        System.out.println();
    }
}
