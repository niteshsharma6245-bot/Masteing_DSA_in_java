package Recursion;

import java.util.Scanner;

public class L_02_Print_digits
{
    static void printDigit( int num )
    {
        if(num == 0 )
        {
            return ;
        }
        printDigit( num/10 );
        System.out.println(num%10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number ");
        int num = sc.nextInt() ;
        printDigit(num);
    }
}
