/*Check whether the given 4 points form a square or not.
Example:
INPUT
10 10
10 20
20 20
20 10
OUTPUT
yes*/

package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Point[] points=new Point[4];
        System.out.print("Input : ");
        for(int i=0;i<4;i++)
        {
            points[i]=new Point();
            points[i].x=sc.nextInt();
            points[i].y=sc.nextInt();
        }
        System.out.println("Output :\n" + isSquare(points));
    }
    static boolean isSquare(Point[] points)
    {
        int d1=distanceSquare(points[0],points[1]);
        int d2=distanceSquare(points[0],points[2]);
        int d3=distanceSquare(points[0],points[3]);
        int d;
        
        if(d1==d2 && 2*d1==d3)
        {
            d=distanceSquare(points[1],points[3]);
            return (d==d2 && d==distanceSquare(points[2],points[3]));
        }
        else if(d1==d3 && 2*d1==d2)
        {
            d=distanceSquare(points[1],points[2]);
            return (d==d3 && d==distanceSquare(points[3],points[2]));
        }
        else if(d2==d3 && 2*d2==d1)
        {
            d=distanceSquare(points[1],points[2]);
            return (d==d3 && d==distanceSquare(points[3],points[1]));
        }
        return false;
    }
    static int distanceSquare(Point p1,Point p2)
    {
        return (p2.x-p1.x) * (p2.x-p1.x) + (p2.y-p1.y) * (p2.y-p1.y);
    }
            
    static class Point
    {
        int x,y;
    }
}
