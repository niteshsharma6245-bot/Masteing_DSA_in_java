package Loops_Problems;
import java.util.* ;
import java.util.Scanner;

public class L_11_Frequency_of_digit_in_a_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number ");
        int num = sc.nextInt() ;

        Map<Integer,Integer> map1 = new HashMap<>() ;
        while( num != 0 )
        {
            if( !map1.containsKey( num % 10 ))
            {
                map1.put( num % 10 , 1 ) ;
            }
            else
            {
                map1.put( num % 10 , map1.get( num % 10 ) + 1 ) ;
            }
            num /= 10 ;
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
