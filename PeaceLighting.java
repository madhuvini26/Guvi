/*
Dhoni plays his favorite game 'Peace Lightning'. Now he is flying a bomber on a very specific map. Formally, map is a checkered 
field of size 1 × n, the cells of which are numbered from 1 to n, in each cell there can be one or several tanks. Dhoni doesn't 
know the number of tanks and their positions, because he flies very high, but he can drop a bomb in any cell. All tanks in this 
cell will be damaged. If a tank takes damage for the first time, it instantly moves to one of the neighboring cells (a tank in 
the cell n can only move to the cell n - 1, a tank in the cell 1 can only move to the cell 2). If a tank takes damage for the 
second time, it's counted as destroyed and never moves again. The tanks move only when they are damaged for the first time, 
they do not move by themselves. Help Dhoni to destroy all tanks using as few bombs as possible.
Input Size : N<=1000000 
Example:
INPUT
2
OUTPUT
3
2 1 2 
*/package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class PeaceLighting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        boolean even=true;
        int count=0;
        System.out.println("Output : \n" + (n+(n/2)));
        for(int i=1;i<=n;i++)
        {
            //System.out.println(i);
            if(count==(n+(n/2)))
                break;
            if(even)
            {
                if(i%2==0)
                {
                    System.out.print(i + " ");
                    count++;
                }
                if(i==n)
                {
                    even=false;
                    i=0;
                }
            }
            else
            {
                if(i%2!=0)
                {
                    System.out.print(i + " ");
                    count++;
                }
                if(i==n)
                {
                    even=true;
                    i=0;
                }
            }
        }
    }
}
