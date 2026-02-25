package Loops_Problems;
import java.util.Arrays;
import java.util.Scanner ;

public class L_03_Prime_number_Sieve_of_Erathothenes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter the number ");
        int num = sc.nextInt() ;
        boolean [] primes = new boolean[num+1] ;
        Arrays.fill( primes , true ) ;
        primes[0] = false ;
        primes[1] = false ;
        for( int i = 2 ; i*i <= num ; i++ )
        {
            if( primes[i] == true  )
            {
                for( int j = 2*i ; j <= num ; j += i )
                {
                    primes[j] = false ;
                }
            }
        }
        int count = 0 ;
        for( boolean val : primes )
        {
            if( val == true )
            {
                count++ ;
            }
        }
        System.out.println("number of prime number is :" + count);


    }

}
