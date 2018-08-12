/*
Once detective saikat was solving a murder case. While going to the crime scene he took the stairs and saw that a number 
is written on every stair. He found it suspicious and decides to remember all the numbers that he has seen till now. 
While remembering the numbers he found that he can find some pattern in those numbers. So he decides that for each number 
on the stairs he will note down the sum of all the numbers previously seen on the stairs which are smaller than the present 
number. Calculate the sum of all the numbers written on his notes diary.
Input Size : 1<=N<=100000
Example:
INPUT
3
1 2 3
OUTPUT
4(0+1+1+2) 
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class DetectiveSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int noOfSteps=sc.nextInt();
        int numberOnSteps[]=new int[noOfSteps];
        
        for(int i=0;i<noOfSteps;i++)
            numberOnSteps[i]=sc.nextInt();
        
        int totalSum=0;
        for(int i=0;i<noOfSteps;i++)
        {
            int sum=0;
            for(int j=0;j<i;j++)
            {
                if(numberOnSteps[j] < numberOnSteps[i])
                    sum+=numberOnSteps[j];
            }
            totalSum+=sum;
        }
        System.out.println("Output :\n" + totalSum);
    }
}
