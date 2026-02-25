package Loops_Problems;

import java.util.Scanner;

public class L_07_Armstrong_numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter you number ");
        int num = sc.nextInt() ;
        int dup  = num ;
        int n = num ;
        int count = 0 ;
        int sum = 0 ;
        while( n != 0 )
        {
            count++ ;
            n /= 10 ;
        }
        while( num != 0 )
        {
            sum +=(int)Math.pow(num % 10 , count ) ;
            num /= 10 ;
        }
        if( sum == dup)
        {
            System.out.println("armstrong number");
        }

    }
}
