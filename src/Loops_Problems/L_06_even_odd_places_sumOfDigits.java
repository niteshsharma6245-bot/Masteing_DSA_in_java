package Loops_Problems;

import java.util.Scanner ;

public class L_06_even_odd_places_sumOfDigits
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner( System.in) ;
        System.out.println("Enter the number ");
        int num = sc.nextInt() ;

        int evenSum = 0 ;
        int oddSum = 0 ;
        int pos = 0 ;
        while( num != 0 )
        {
            int lastdigit = num % 10 ;
            pos++ ;
            if( pos % 2 == 0 )
            {
                oddSum += lastdigit ;
            }
            else {
                evenSum += lastdigit ;
            }
            num /= 10 ;
        }
        System.out.println("even sum " + evenSum + "     odd sum " + oddSum);



    }
}
