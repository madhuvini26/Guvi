/*
11 - A kindergarten teacher has to arrange 2n children in n pairs for daily walks. Design an algorithm for this task so that 
for 2n − 1 days no pair would be the same and print the total number of distinct pairs.
Input Size : |2n|<=1000000000000000000
Example:
INPUT
4
OUTPUT
6
*/
package mypackage;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class KinderGarten {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        BigInteger n=sc.nextBigInteger();
        BigInteger two=BigInteger.valueOf(2);
        BigInteger p=factorialDivision(n,n.subtract(two));
        System.out.println("Output :\n" + p.divide(factorial(two)).toString());
    }
    static BigInteger factorial(BigInteger n)
    {
        if(n.compareTo(BigInteger.ONE)==0 || n.compareTo(BigInteger.ZERO)==0)
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    static BigInteger factorialDivision(BigInteger a,BigInteger b)
    {
        BigInteger diff=a.subtract(b);
        BigInteger factDiv=BigInteger.ONE;
        for(int i=1;i<=diff.intValue();i++)
        {
            factDiv=factDiv.multiply(a);
            a=a.subtract(BigInteger.ONE);
        }
        return factDiv;
    }
}
