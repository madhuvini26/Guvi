package mypackage;

import java.util.Scanner;

/**
 *
 * @author Hariharan
 */
public class Substring2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input : ");
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("Output :\n" + (s1.contains(s2) ? "yes" : "no"));
    }
}
