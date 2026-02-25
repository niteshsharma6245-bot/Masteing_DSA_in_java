package Loops_Problems;

import java.util.Scanner;

public class L_08_Rotate_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in)  ;
        System.out.println("enter your number ");
        int num = sc.nextInt() ;
        System.out.println("enter number of rotations ");
        int rot = sc.nextInt() ;


       /*
        int dup = num ;
        int count = 0 ;
        while( dup != 0 )
        {
            count++ ;
            dup /= 10 ;
        }

        rot = rot % count ;
        int rot_num = 0 ;
        for( int i = 0 ; i < rot ; i++)
        {
            rot_num = (int) ((num % 10)*Math.pow(10,count-1) + (num/10));
            num = rot_num ;
        }
        System.out.println(rot_num);

        */
         int dup = num ;
         int count = 0 ;
         while( dup != 0 )
         {
             count++ ;
             dup /= 10 ;
         }

         rot = rot % count ;
         if( rot < 0 )
         {
             rot += count ;
         }
         int rhs = (int) (num % Math.pow(10 , rot )) ;
         int lhs = (int) (num / Math.pow(10 , rot )) ;
        int ans = (int) (rhs*Math.pow(10,count-rot)+lhs) ;
        System.out.println( ans);

    }
}
