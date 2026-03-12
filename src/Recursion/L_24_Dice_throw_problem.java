package Recursion;

public class L_24_Dice_throw_problem
{
    static void diceThrow( int st , int target , String res )
    {
        if( st > target )
        {
            return ;
        }
        if( st == target )
        {
            System.out.println(res);
            return ;
        }
        for( int dice = 1 ; dice <= 6 ; dice++ )
        {
            diceThrow( st + dice , target , res + dice +"->");
        }
    }
    static int diceThrow( int st , int target  )
    {
        if( st > target )
        {
            return 0;
        }
        if( st == target )
        {
            return 1 ;
        }
        int count = 0 ;   // if you are thinking that in each recursively count will become 0 then
        // each recursion local copy of that variable so in each recursionit will be differnet ..
        for( int dice = 1 ; dice <= 6 ; dice++ )
        {
            count += diceThrow( st + dice , target);
        }
        return count ;
    }
    public static void main(String[] args)
    {
        diceThrow( 0 , 10 , "");
        System.out.println( diceThrow(0,10));


    }
}
