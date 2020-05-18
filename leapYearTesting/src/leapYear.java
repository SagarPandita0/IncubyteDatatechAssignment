public class leapYear
{
        public int checkLeap(int year)
        {

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
