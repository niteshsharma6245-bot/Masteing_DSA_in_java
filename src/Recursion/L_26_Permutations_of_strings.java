package Recursion;

public class L_26_Permutations_of_strings
{
    static void genPermutations( String s , String res )
    {
        if( s.length() == 0 )
        {
            System.out.println( res );
            return ;
        }
        for( int i = 0 ; i < s.length() ; i++)
        {
            char current = s.charAt( i ) ;
            String rem = s.substring(0,i) + s.substring(i+1) ;
            genPermutations( rem , res+current);
        }
    }
    public static void main(String[] args)
    {
        genPermutations( "abc" , "");


    }
}
