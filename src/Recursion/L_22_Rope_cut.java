package Recursion;

public class L_22_Rope_cut
{
    static int ropecut( int n , int a , int b , int c )
    {
        if( n < 0 )
        {
            return 0 ;
        }
        if( n == 0 )
        {
            return 1 ;
        }
        int option1 = ropecut( n-a , a , b , c ) ;
        int option2 = ropecut( n-b , a , b , c ) ;
        int option3 = ropecut( n-c , a , b , c ) ;
//        int final_result = Math.max(Math.max( option1 , option3),option2 ) ;
//        if( final_result == -1 )
//        {
//            return -1 ;
//        }
//        return final_result + 1;

        return option1 + option2 +option3 ;
    }
    public static void main(String[] args)
    {
        System.out.println( ropecut( 5 , 2 ,5, 1));

    }
}
