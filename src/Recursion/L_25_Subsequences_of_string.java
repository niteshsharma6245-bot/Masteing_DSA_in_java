package Recursion;

public class L_25_Subsequences_of_string
{
    static void subsequences( String initial , int i , String res )
    {
        if( i == initial.length())
        {
            System.out.println(res );
            return ;
        }
        subsequences( initial , i+1 , res + initial.charAt(i));
        subsequences( initial , i+1 , res );
    }
    static int subsequences( String initial , int i  )
    {
        if( i == initial.length())
        {

            return 1;
        }
        return subsequences( initial , i+1 )+subsequences( initial , i+1  );

    }
    public static void main(String[] args)
    {
        subsequences( "tejas" , 0 , "");
        System.out.println(subsequences("tejas" , 0));
    }
}
