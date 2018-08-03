package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class CommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        String[] strings=new String[n];
        int minStringLength=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            strings[i]=sc.next();
            if(strings[i].length()<minStringLength)
            {
                minStringLength=strings[i].length();
            }
        } 
        String commonPrefix=new String();
        int i,j;
        for(i=1;i<=minStringLength;i++)
        {
            String testPrefix=strings[0].substring(0,i);
            for(j=1;j<strings.length;j++)
            {
                if(!strings[j].substring(0,i).equalsIgnoreCase(testPrefix))
                    break;
            }
            if(j!=strings.length)
                break;
            commonPrefix=testPrefix;            
        }
        System.out.println("Output :\n" + commonPrefix);
    }
}
