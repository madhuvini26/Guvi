package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class MaximumSumByPicking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Input : ");
        int n=sc.nextInt();
        int[] array=new int[n];
        
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("Output : \n" + maximumSum(array));
    }
    private static int maximumSum(int[] array)
    {
        int including=array[0];
        int excluding=0;
        
        for(int i=1;i<array.length;i++)
        {
            int newExcluding=(including>excluding)?including:excluding;
            including=excluding+array[i];
            excluding=newExcluding;
            System.out.println(newExcluding + " " + including + " " + excluding);
        }
        return including>excluding?including:excluding;
    }
}
