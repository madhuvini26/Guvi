package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] queue=new int[n];
        
        for(int i=0;i<n;i++)
            queue[i]=sc.nextInt();
        
        Arrays.sort(queue);
        
        int waitingTime=0;
        int notDisappointed=0;
        
        for(int i=0;i<n;i++)
        {
            if(waitingTime<=queue[i])
                notDisappointed++;
            waitingTime+=queue[i];
        }
        System.out.println("Output : \n" + notDisappointed);
    }
}
