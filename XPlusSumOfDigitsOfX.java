/*
Given a number N, print the number of ways of choosing another number 'x' such that'x+sum of digits of x=N' and print each 'x' 
in a new line.
Input Size : 1<=N<=1000000000
Example:
INPUT
21
OUTPUT
1
15 
*/
package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class XPlusSumOfDigitsOfX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        long n=sc.nextInt();
        List<Long> x=new ArrayList<>();
        int count=0;
        for(long i=n;i>=n/2;i--)
        {
            if(i+sumOfTheDigits(i) == n)
            {
                x.add(i);
                count++;
                break;
            }
        }
        
        System.out.println("Output :\n" + count);
        for(int i=0;i<x.size();i++)
            System.out.println(x.get(i));
            
    }
    private static long sumOfTheDigits(long n)
    {
        long sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
