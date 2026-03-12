package Recursion;

import java.util.Scanner;
public class L_10_Factorial_of_a_number
{
    static int fact1( int num , int res)
    {
        if( num == 1 )
        {
            return 1 ;
        }
        res = fact1( num-1 , res )  ;
        res *= num ;
        return res ;
    }
    static void fact( int n , int res )
    {
        if( n == 0 )
        {
            System.out.println(res);
            return ;
        }
        fact( n-1 , res*n ) ;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number ");
        int num = sc.nextInt() ;
        fact( num , 1 );
        System.out.println(fact1( num , 1 ));

    }
}
