package Loops_Problems;

import java.util.Scanner;

public class L_10_Strong_numbers
{
    static int fact(int n )
    {
        if( n == 0 || n == 1 )
        {
            return 1 ;
        }
        return n*fact(n-1) ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter you number ");
        int num = sc.nextInt() ;
        int dup = num ;
        int sum = 0 ;
        while( dup != 0 )
        {
            sum += fact(dup % 10 ) ;
            dup /= 10 ;
        }
        if( sum == num )
        {
            System.out.println("strong number ");
        }
    }
}
