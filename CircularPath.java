/*
Given a string S, find if it denotes a circular motion(same initial and final positions).
The instructions are:
1)G:Move 1 Unit
2)L:Turn Left
3)R:Turn Right
Input Size : |S| <=10000000
Example:
INPUT
GLGLGLG
OUTPUT
no
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class CircularPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String instructions=sc.next();
        boolean circular=isCircularPath(instructions.toCharArray());
        System.out.println("Output :\n" + (circular?"yes":"no"));        
    }
    static boolean isCircularPath(char instructions[])
    {
        int x=0;
        int y=0;
        int direction=0;

        for (int i=0;i<instructions.length;i++)
        {
            char move=instructions[i];
            switch(move)
            {
                case 'R':
                    direction=(direction+1)%4;
                    break;
                case 'L':
                    direction=(4+direction-1)%4;
                    break;
                default:
                    switch(direction) 
                    {
                        case 0:
                            y++;
                            break;
                        case 1:
                            x++;
                            break;
                        case 2:
                            y--;
                            break;
                        case 3:
                            x--;
                            break;
                    }
                    break;
            }
        }
        return (x==0&&y==0);
    }
}
