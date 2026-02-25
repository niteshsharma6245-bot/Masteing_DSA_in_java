package Loops_Problems;

import java.util.Scanner;

public class L_12_GCD_HCF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter number 1 ");
        int num1 = sc.nextInt() ;
        System.out.println("enter number 2");
        int num2 = sc.nextInt() ;
        int gcd = 0 ;
        int key = Math.min( num1 , num2 ) ;
        while( key > 1 )
        {
            if( num1 % key == 0 && num2 % key == 0 )
            {
                System.out.println(key);
                break;
            }
            key-- ;
        }


    }
}
