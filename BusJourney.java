/*
A bus moves along the coordinate line Ox from the point x = 0 to the point x = a. After starting from the point x = 0, 
it reaches the point x = a, immediately turns back and then moves to the point x = 0. After returning to the point x = 0 
it immediately goes back to the point x = a and so on. Thus, the bus moves from x = 0 to x = a and back. Moving from the 
point x = 0 to x = a or from the point x = a to x = 0 is called a bus journey. In total, the bus must make k journeys. 
The petrol tank of the bus can hold b liters of gasoline. To pass a single unit of distance the bus needs to spend exactly 
one liter of gasoline. The bus starts its first journey with a full petrol tank. There is a gas station in point x = f. 
This point is between points x = 0 and x = a. There are no other gas stations on the bus route. While passing by a gas 
station in either direction the bus can stop and completely refuel its tank. Thus, after stopping to refuel the tank will 
contain b liters of gasoline. What is the minimum number of times the bus needs to refuel at the point x = f to make k journeys? 
The first journey starts in the point x = 0. 
The first line contains four integers a, b, f, k (0 < f < a ≤ 1000000, 1 ≤ b ≤ 1000000000, 1 ≤ k ≤ 10000) 
— the endpoint of the first bus journey, the capacity of the fuel tank of the bus, the point where the gas station is located, 
and the required number of journeys.
Example:
INPUT
6 9 2 4
OUTPUT
4
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class BusJourney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        //System.out.println("End point of first journey: ");
        int a=sc.nextInt();
        //System.out.println("Fuel capacity: ");
        int b=sc.nextInt();
        //System.out.println("Location of gas station: ");
        int f=sc.nextInt();
        int count=0;
        if(f>0 && f<a && b>=f)
        {
            //System.out.println("Number of journeys: ");
            int j=sc.nextInt();
            
            boolean forward=true;
            int fuel=b;
            for(int i=1;i<=j;i++)
            {
                if(forward)
                {                    
                    for(int k=0;k<=a;k++)
                    {                        
                        if(k==f)
                        {                            ;
                            if(fuel<2*(a-f))
                            {
                                count++;
                                fuel+=b-fuel;                                
                            }
                        }
                        fuel--;
                    }
                    forward=false;
                    fuel++;                    
                }
                else
                {                    
                    for(int k=a;k>=0;k--)
                    {                        
                        if(k==f)
                        {
                            if(fuel<2*f)
                            {
                                count++;
                                fuel+=b-fuel;                                
                            }
                        }
                        fuel--;
                    }
                    forward=true;
                    fuel++;
                }
            }
            System.out.println("Output :\n"+count);
        }
        else
        {
            System.out.println("Output :\nInvalid location / Bus will run out of fuel before reaching gas station");
        }
    }
}
