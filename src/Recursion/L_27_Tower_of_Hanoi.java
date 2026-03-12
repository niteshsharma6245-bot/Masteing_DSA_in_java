package Recursion;

public class L_27_Tower_of_Hanoi
{
    static void toh( int n , char source , char helper , char destination )
    {
        if( n == 1 )
        {
            System.out.println("move disk "+n+"from"+source+"to"+destination);
            return ;
        }
        toh( n-1 , source , destination , helper ) ;
        System.out.println( "move disk"+n+"from"+source+"to"+destination );
        toh( n-1 , helper , source , destination ) ;
    }
    public static void main(String[] args)
    {
        toh( 3 , 'A' , 'B' , 'C');


    }
}
