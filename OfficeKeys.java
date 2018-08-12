/*
There are n people and k keys on a straight line. Every person wants to get to the office which is located on the line as well. 
To do that, he needs to reach some point with a key, take the key and then go to the office. Once a key is taken by somebody, 
it couldn't be taken by anybody else. You are to determine the minimum time needed for all n people to get to the office with 
keys. Assume that people move a unit distance per 1 second. If two people reach a key at the same time, only one of them can 
take the key. A person can pass through a point with a key without taking it. The first line contains three integers n, k and p 
(1 ≤ n ≤ 1 000, n ≤ k ≤ 2 000, 1 ≤ p ≤ 1000000000) — the number of people, the number of keys and the office location. 
The second line contains n distinct integers a1, a2, ..., an (1 ≤ ai ≤ 1000000000) — positions in which people are located 
initially. The positions are given in arbitrary order. The third line contains k distinct integers b1, b2, ..., bk (1 ≤ bj ≤ 1000000000) 
— positions of the keys. The positions are given in arbitrary order. Note that there can't be more than one person or more than one 
key in the same point. A person and a key can be located in the same point.
Example:
INPUT
2 4 50
20 100
60 10 40 80
OUTPUT
50
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
