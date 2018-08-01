package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Soldiers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int t=sc.nextInt();
        int[] scores=new int[t];
        
        for(int tc=0;tc<t;tc++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            long n=factorialDivision(a,b);
            int score=0;
            
            while(n>1)
            {
                for(int i=2;i<=n;i++)
                {
                    if(n%i==0)
                    {
                        score++;
                        n=n/i;
                        break;
                    }
                }
            }
            scores[tc]=score;
        }
        System.out.println("Output :");
        for(int i=0;i<t;i++)
        {
            System.out.println(scores[i]);
        }
    }
    static long factorialDivision(int a,int b)
    {
        int diff=a-b;
        long factDiv=1;
        for(int i=1;i<=diff;i++)
        {
            factDiv*=a--;
        }
        return factDiv;
    }
}
