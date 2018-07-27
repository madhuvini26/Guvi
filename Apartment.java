package mypackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Apartment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int min=n;
        int max=0;
        int count;
        for(int i=1;i<(1<<n);i++)
        {
            
            String binary=convertToBinary(i,n);
            if(noOfOnes(binary)==k)
            {
                count=0;
                for(int j=0;j<binary.length();j++)
                {
                    if(!(j==0 && j==(binary.length()-1)))
                    {
                        if(binary.charAt(j)=='0')
                        {
                            if((j==0 && binary.charAt(j+1)=='1')
                                    ||(j==binary.length()-1 && binary.charAt(j-1)=='1')
                                    ||( (j!=0 && binary.charAt(j-1)=='1') || (j!=binary.length()-1 && binary.charAt(j+1)=='1')))
                            {
                                count++;
                            }
                        }
                    }
                }
                if(count>max)
                    max=count;
                else if(count<min)
                    min=count;
            }
        }
        System.out.println("Output :");
        System.out.print(min + " " + max);
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
