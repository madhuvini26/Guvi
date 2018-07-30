package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int t=sc.nextInt();
        
        int[] workTime=new int[n];
        int remainingTime;
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            workTime[i]=sc.nextInt();
            remainingTime=86400-workTime[i];
            t-=remainingTime;
            count++;
            if(t<=0)
                break;
        }
        System.out.println("Output : \n" + count);
    }
}
