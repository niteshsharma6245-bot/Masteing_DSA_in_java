package Recursion;

import java.util.Scanner;
public class L_06_Palindrone_number
{
    static boolean palindroneNumber1( int num , int rev , int cpy )
    {
        if( num == 0 )
        {
            return cpy == rev   ;
        }
        rev = rev*10 + num%10 ;
        return palindroneNumber1( num/10 , rev , cpy );

    }

    static void palindroneNumber( int num , int rev , int cpy  )
    {

        if( num == 0 )
        {
            System.out.println( cpy == rev );
            return  ;
        }
        rev = rev*10 + num%10 ;
        palindroneNumber( num/10 , rev , cpy );
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter the number ");
        int num = sc.nextInt() ;
        palindroneNumber1( num , 0 , num);

    }
}
