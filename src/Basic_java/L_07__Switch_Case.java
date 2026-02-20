package Basic_java;

import java.util.Scanner ;
public class L_07__Switch_Case {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int x;
        int y;
        int result = 0  ;
        char ch ;

        System.out.println("enter first number ");
        x = sc.nextInt() ;

        System.out.println("enter second number ");
        y = sc.nextInt() ;

        System.out.println("enter opertion to be performed ");
        ch = sc.next().charAt(0) ; // whatever user say take the first letter


        switch ( ch  )
        {
            case '+' :
                result = x+ y ;
                break ;
            case '-' :
                result = x-y ;
                break ;
            case '*' :
                result = x*y ;
                break;
            default :
                System.out.println("not matched input");
        }
        System.out.println("result :" + result );
    }

    public static class L8__Loops {
        public static void main ( String[] args)
        {

            // FOR loop
            for( int i = 1 ; i <= 1000 ; i++ )
            {
                System.out.println("I am sorry ");
            }

            // while loop
           // int i = 0;

           // while (i < 5) {  // condition checked first
            //    System.out.println("Inside while loop, i = " + i);
             //   i++;
           // }

           // System.out.println("While loop ended");

            // do while loop
            //int i = 5;

            //do {
               // System.out.println("Inside do-while loop, i = " + i);
              //  i++;
          //  } while (i < 5);   // condition checked after execution

            //System.out.println("Do-while loop ended");
        }
    }
}
