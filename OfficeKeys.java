/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class OfficeKeys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Input : ");
        int persons=sc.nextInt();
        int[] personLocations=new int[persons];
        int keys=sc.nextInt();
        int[] keyLocations=new int[keys];
        int office=sc.nextInt();
        
        for(i=0;i<persons;i++)
            personLocations[i]=sc.nextInt();
        
        Arrays.sort(personLocations);
        
        for(i=0;i<keys;i++)
            keyLocations[i]=sc.nextInt();
        
        int maxDistance=Integer.MIN_VALUE,minDistance,distance,totalTime;
        
        for(i=0;i<persons;i++)
        {
            minDistance=Integer.MAX_VALUE;
            int person=personLocations[i];
            int keyPos=-1;
            for(j=0;j<keys;j++)
            {
                if(keyLocations[j]!=-1)
                {
                    int key=keyLocations[j];
                    if(person<office)
                    {
                        if(key<=person)
                            distance=(person-key)+(office-key);
                        else if(key>=person && key<office)
                            distance=office-person;
                        else
                            distance=(key-person)+(key-office);                    
                    }
                    else
                    {
                        if(key<office)
                            distance=(person-key)+(office-key);
                        else if(key>office && key<=person)
                            distance=person-office;
                        else
                            distance=(key-person)+(key-office);
                    }
                    if(distance<minDistance)
                    {
                        minDistance=distance;
                        keyPos=j;
                    }
                }
            }
            //System.out.println(minDistance);
            keyLocations[keyPos]=-1;
            if(minDistance>maxDistance)
                maxDistance=minDistance;
        }
        System.out.println("Output :\n"+maxDistance);
    }
}
