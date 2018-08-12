package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class ChansCake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        char[][] cake=new char[rows][columns];
        
        char[][] possibleArrangement=new char[2][columns];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(i==0)
                {
                    if(j%2==0)
                        possibleArrangement[i][j]='R';
                    else
                        possibleArrangement[i][j]='G';
                }
                else
                {
                    if(j%2==0)
                        possibleArrangement[i][j]='G';
                    else
                        possibleArrangement[i][j]='R';
                }
            }
        }
        int minCost=0;
        
        for(int i=0;i<rows;i++)
        {
            int[] cost=new int[2];
            cake[i]=sc.next().toCharArray();
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<columns;k++)
                {
                    if(cake[i][k]!=possibleArrangement[j][k])
                    {
                        if(cake[i][k]=='R')
                            cost[j]+=5;
                        else
                            cost[j]+=3;
                    }
                }
            }
            minCost+=Math.min(cost[0], cost[1]);
        }
        System.out.println("Output :\n" + minCost);
    }
}
