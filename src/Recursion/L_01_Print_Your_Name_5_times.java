package Recursion;

public class L_01_Print_Your_Name_5_times
{
    static void  printName( String name , String lastName,   int num )
    {
        if( num == 1 )
        {
            return ;
        }
        System.out.println( name + num );
        printName(name , lastName, num-1);
        System.out.println( lastName + num );

    }
    public static void main(String[] args)
    {
        printName("tejaswi" , "snadilya",5);


    }
}
