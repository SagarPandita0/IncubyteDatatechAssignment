import java.util.Scanner;

public class leapYear
{   //Added code for Human Interaction with the code.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int intValue;

            System.out.print("Please enter the Year: ");
            String next = scanner.next();
            //with try-catch we are preventing values greater than Integer.MAX_VALUE to pass.
            try {
                intValue = Integer.parseInt(next);
                int i = checkLeap(intValue);
                String j = (i==1) ? "is a Leap Year" : "is NOT a Leap Year";
                System.out.println(intValue+" "+j);
                }
            catch (NumberFormatException exp) {
                System.out.println("Enter a valid Year value");
            }

    }
        public static int checkLeap(int year)
        {
            if (year <= 0) // negative values or '0000' don't make any sense for calculating leap-year.
            {
                throw new IllegalArgumentException();
            }
            boolean isLeap ;
            if(year % 4 == 0)
            {
                if(year % 100 == 0 )
                {
                    if(year % 400 == 0)
                    {
                        isLeap = true;
                    }
                    else
                        isLeap = false;
                }
                else
                    isLeap = true;
            }
            else
            {
                isLeap = false;
            }
            if(isLeap) //'isLeap == true' is simplified to 'isLeap'
                return 1; //This means that it is a leap year.
            else
                return 0; // This means that it is NOT a leap year.

        }
}
