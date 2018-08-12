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
