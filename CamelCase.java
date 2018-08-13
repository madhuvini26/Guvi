/*
Given a sentence S as input check whether it is in camelcase. 
input size : |s| <= 100000
Sample Testcase :
INPUT
Good Laptop
OUTPUT
yes
*/
package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String[] words=sc.nextLine().replaceAll(" +", " ").split(" ");
        boolean camelCase=true;
        
        for(int i=0;i<words.length;i++)
        {
            if(Character.isLowerCase(words[i].charAt(0)))
            {
                camelCase=false;
                break;
            }
        }
        if(camelCase)
            System.out.println("Output :\nyes");
        else
            System.out.println("Output :\nno");
    }
}
