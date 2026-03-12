package Recursion;

import java.util.Scanner;
public class L_07_Power_of_a_number
{
    static int powerOfNumber( int num , int power )
    {
        if( power == 0 )
        {
            return 1 ;
        }
        return 2 * powerOfNumber( num , power - 1) ;
    }

    static void powerOfNumber( int num, int power , int res  )
    {
        if( power == 0 )
        {
            System.out.println(res);
            return ;
        }
        powerOfNumber( num , power -1 , num*res );


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" enter your number ");
        int num = sc.nextInt();
        System.out.println(" enter the power ");
        int power = sc.nextInt();
        int res = 1 ;
        powerOfNumber(num,power,res);
        System.out.println(powerOfNumber(num,power));

    }
}
