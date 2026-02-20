package Basic_java;

public class L_03__Arithmatic_opertaions {
    public static void main(String[] args)
    {
        int a= 5 ;
        int b = 7 ;
        int c = 9 ;

        int add = a+b+c ;
        int mul = a*b*c ;
        int div = a/b ;

        int result = c-b*a/c+a-b ;

        /*
          mul and div have higher precedence than add or sub
          defaulty we move from lest to right
         */

        System.out.println(add);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(result);

    }
}
