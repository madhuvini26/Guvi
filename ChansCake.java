/*
Chan’s girlfriend's birthday is near, so he wants to surprise her by making a special cake for her. Chan knows that his 
girlfriend likes cherries on the cake, so he puts cherries on the top of the cake, but he was not satisfied. Therefore, 
he decided to replace some of the cherries to make a beautiful pattern. However, Chan has a lot of other work to do so he 
decided to ask for your help. The cherries are of two colors red and green. Now Chan wants the cherries to be placed in 
such a way that each cherry of one color must be adjacent to only cherries of the other color, two cherries are adjacent 
if they share a side. Now Chan has asked for your help in making that pattern on the cake.You can replace any cherry of 
given color with the other color. But there is a cost for each replacement: if you replace a red cherry with a green one, 
the cost is 5 units and if you replace a green cherry with a red one, the cost is 3 units. Help your friend Chan by making 
the cake special with minimum cost.
Input Size : N<=1000, M<=1000
Example:
INPUT
2 3
RRG
GGR
OUTPUT
8
*/
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
        for(int j=0;j<columns;j++)
        {
            if(j%2==0)
            {
                possibleArrangement[0][j]='R';
                possibleArrangement[1][j]='G';
            }
            else
            {
                possibleArrangement[0][j]='G';
                possibleArrangement[1][j]='R';
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
