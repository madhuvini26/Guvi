/*
Two soldiers are playing a game. At the beginning first of them chooses a positive integer n and gives it to the second 
soldier. Then the second one tries to make maximum possible number of rounds. Each round consists of choosing a positive integer 
x > 1, such that n is divisible by x and replacing n with n / x. When n becomes equal to 1 and there is no more possible valid 
moves the game is over and the score of the second soldier is equal to the number of rounds he performed. To make the game more 
interesting, first soldier chooses n of form a! / b! for some positive integer a and b (a ≥ b). Here by k! we denote the 
factorial of k that is defined as a product of all positive integers not large than k.
What is the maximum possible score of the second soldier?
The input consists of several test cases.
Input Size : 1<=T,A,B<=100000 
Example:
INPUT
2
3 1
6 3
OUTPUT
2
5
*/
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
