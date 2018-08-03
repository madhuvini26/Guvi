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
