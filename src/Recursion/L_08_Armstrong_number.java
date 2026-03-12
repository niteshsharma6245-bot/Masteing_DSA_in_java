package Recursion;

import java.util.Scanner;

public class L_08_Armstrong_number
{

    static void ArmstrongNumber( int num , int count , int res , int cpy  )
    {
        if( num == 0 )
        {
            System.out.println( res == cpy ) ;
            return ;
        }
        ArmstrongNumber( num/10 , count , res+(int)Math.pow( num%10 , count ) , cpy );
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter the number ");
        int num = sc.nextInt() ;
        int count = 0 ;
        int dup = num ;
        while( num != 0 )
        {
            count++ ;
            num /= 10 ;
        }
        num = dup ;
        ArmstrongNumber( num , count , 0 , num );

    }
}
