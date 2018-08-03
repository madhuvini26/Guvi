package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class SmallestNumberAfterDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        long number=sc.nextLong();
        String numberString;
        int k=sc.nextInt();
        long min;
        
        while(k-->0)
        {
            min=Long.MAX_VALUE;
            numberString=String.valueOf(number);
            for(int i=0;i<noOfDigits(number);i++)
            {
                long numberAfterRemoval=
                        Long.parseLong(numberString.substring(0,i) 
                        + numberString.substring(i+1));
                if(numberAfterRemoval<min)
                {
                    min=numberAfterRemoval;
                }
            }
            number=min;
        }
        System.out.println("Output :\n" + number);
    }
    private static int noOfDigits(long n)
    {
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        return count;   
    }
    
}
