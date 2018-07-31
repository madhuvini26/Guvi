package mypackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Hariharan
 */
public class Thief {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int items=sc.nextInt();
        int[] values=new int[items];
        int capacity=sc.nextInt();
        
        for(int i=0;i<items;i++)
            values[i]=sc.nextInt();
        
        TreeSet<Integer> possibleCosts = new TreeSet<>();
        
        for(int i=0;i<items;i++)
        {
            possibleCosts.add(values[i] * capacity);
        }
        
        for(int i=1;i<(1<<items);i++)
        {
            String binary=convertToBinary(i,items);
            int c=capacity;
            if(noOfOnes(binary)==c)
            {
                int sum=0;
                for(int j=0;j<binary.length();j++)
                {
                    if(binary.charAt(j)=='1')
                    {
                        sum+=values[j];
                    }
                }
                possibleCosts.add(sum);
            }
        }
        Iterator iterator=possibleCosts.iterator();
        
        System.out.println("Output :");
	while (iterator.hasNext()) 
        {
		System.out.print(iterator.next() + " ");
	}
    }
    
    static String convertToBinary(int decimal,int n)
    {
        String binary=new String();
        while(decimal!=0)
        {
            if(decimal%2==0)
                binary= "0" + binary;
            else
                binary= "1" + binary;
            decimal/=2;
        }
        char[] repeat = new char[n-binary.length()];
        Arrays.fill(repeat,'0');
        binary = new String(repeat) + binary;
        return binary;
    }
    
    static int noOfOnes(String binary)
    {
        int count=0;
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
    }
}
