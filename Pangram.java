package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Pangram {
    
    static final String ALPHABETS="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String statement=sc.nextLine().toLowerCase();
        boolean pangram=true;
        for(int i=0;i<26;i++)
        {
            if(!statement.contains(String.valueOf(ALPHABETS.charAt(i))))
            {
                pangram=false;
                break;
            }
        }
        System.out.println("Output :");
        if(pangram)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
