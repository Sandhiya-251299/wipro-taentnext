

import java.util.Scanner;

class GenderAge

{

    public static void main(String[] args)

    {

        String Gender;

        int Age;

        float interest;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the Gender");

        Gender=sc.next();

        System.out.println("enter the Age");

        Age=sc.nextInt();

        if(interest==8.2%)

        {

            System.out.println("the gender is female");

            System.out.println("the age is between 1 to 58");

        }

        else if(interest==7.6%)

        {

            System.out.println("the gender is female");

            System.out.println("the age is between 59-100");

        }

        else if(interest==9.2%)

        {

            System.out.println("the gender is male");

            System.out.println("the age is between 1-60");

        }

        else if(interest==8.3%)

        {

            System.out.println("the gender is male");

            System.out.println("the age is between 61-120");

        }

        else

        {

            System.out.println("the age and gender cannot be determined");

        }

    }

}
