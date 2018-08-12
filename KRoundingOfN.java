/*
For a given positive integer N denote its K-rounding as the minimum positive integer x, such that x ends with k or more zeros 
in base 10 and is divisible by n. For example, 4-rounding of 375 is 375*80 = 30000. 30000 is the minimum integer such that it 
ends with 4 or more zeros and is divisible by 375. Write a program that will perform the k-rounding of N.
Input Size : 1<=N<=1000000000, K<=8 
Example:
INPUT
375 4
OUTPUT
30000
*/package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class KRoundingOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        long n=sc.nextInt();
        long k=sc.nextInt();
        
        int i=1;
        while(true)
        {
            long product=n*i;
            if(product%(Math.pow(10,k))==0)
            {
                System.out.println("Output :\n"+product);
                break;
            }   
            i+=(i>1)?10:9;
        }
    }
}
