package Basic_java;

import java.util.Scanner ;
public class L_04__Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        int a = sc.nextInt() ;

        System.out.println("enter second number :");
        int b = sc.nextInt() ;

        int sum = a+b ;
        int sub = a-b ;
        int mul = a*b ;
        int div = a/b ;

        System.out.println("sum" + sum);
        System.out.println("sub" + sub);
        System.out.println("mul" + mul);
        System.out.println("div" + div);
    }

}
