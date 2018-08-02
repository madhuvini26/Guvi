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
