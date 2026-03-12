package Recursion;

import java.util.Scanner;

public class L_17_replace_hi_with_hello
{
    static String replaceHiWithHello(String s)
    {
        // Base case
        if (s.length() <= 1)
        {
            return s;
        }

        // If string starts with "hi"
        if (s.startsWith("hi"))
        {
            return "hello" + replaceHiWithHello(s.substring(2));
        }

        // Otherwise keep first character
        return s.charAt(0) + replaceHiWithHello(s.substring(1));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println(replaceHiWithHello(s));
    }
}