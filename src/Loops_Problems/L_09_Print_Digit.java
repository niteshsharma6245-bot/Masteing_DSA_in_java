package Loops_Problems;

import java.util.Scanner;

public class L_09_Print_Digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter your number ");
        int num = sc.nextInt() ;

        int dup = num ;
        int count = 0 ;
        while( dup != 0 )
        {
            count++ ;
            dup /= 10 ;
        }
        for( int i = count - 1 ; i >= 0 ; i-- )
        {
            int power = (int)Math.pow(10,i );
            System.out.println( num / power);
            num = (int) (num % Math.pow(10,i));
        }

    }
}
