/*
There are n students in an institution. For each student you know the number of times he/she has participated in the ACM ICPC 
world programming championship. According to the ACM ICPCrules, each person can participate in the world championship at most 
5 times. The head of the institution is recently gathering teams to participate in the world championship. Each team must 
consist of exactly three people, at that, any person cannot be a member of two ormore teams. What maximum number of teams 
can the head make if he wants each team to participate in the world championship with the same members at least k times?
Input Size : N<=10000
Example:
INPUT
5 2
0 4 5 1 0
OUTPUT
1
*/
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Teams {
    final static int MAX_PARTICIPATION=5;
    final static int MAX_MEMBERS=3;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int noOfStudents=sc.nextInt();
        int[] participation=new int[noOfStudents];
        int k=sc.nextInt();
        
        for(int i=0;i<noOfStudents;i++)
            participation[i]=sc.nextInt();
        
        int count=0;
        while(true)
        {
            int max=getMaximum(participation);
            if(MAX_PARTICIPATION-max >= k)
                break;
            
            for(int j=0;j<noOfStudents;j++)
            {
                if(participation[j]==max)
                {
                    participation[j]=-1;
                    count++;
                }
            }
        }
        System.out.println("Output :\n" + (noOfStudents-count)/MAX_MEMBERS);   
    }
    private static int getMaximum(int[] array)
    {
        Arrays.sort(array);
        return array[array.length-1];
    }
}
