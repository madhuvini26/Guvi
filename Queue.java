/*
There are N people in a queue. For each person we know time T needed to serve him. A person will be disappointed if the time 
he waits is more than the time needed to serve him. The time a person waits is the total time when all the people who stand in 
the queue in front of him are served.If we swap some people in the queue, then we can decrease the number of people who are 
disappointed, print the maximum number of not disappointed people that can be obtained after swapping optimally.
Input Size : 1<=N<=100000 
Example:
INPUT
5
15 2 1 5 3
OUTPUT
4
*/
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
