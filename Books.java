/*
Recently Kohli bought a very interesting book. He knows that it will take t seconds to read the book. Kohli wants to finish 
reading as fast as he can.But he has some work to do in each of n next days. The number of seconds that Kohli has to spend 
working during i-th day is ai. If some free time remains, he can spend it on reading. Help Kohli to determine the minimum 
number of day when He finishes reading. It is guaranteed that the answer doesn't exceed n. Remember that there are 86400 
seconds in a day.
Input Size : N<=100T<=1000000 
example
INPUT
2 2
86400 86398
OUTPUT
2
*/
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
