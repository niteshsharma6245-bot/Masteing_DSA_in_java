package Basic_java;

public class L_06__Multiple_if_else {
    public static void main( String[] args)
    {
        int age = 28 ;

        if(age < 18 )
        {
            System.out.println("child");
        }
        else if(age >= 13 && age <= 19)
        {
            System.out.println("teenager");
        }
        else if(age >= 20 && age <=55)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("old");
        }
    }
}
