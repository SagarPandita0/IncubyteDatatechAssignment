import org.junit.*;
import static org.junit.Assert.*;

public class leapYearTest
{
    public leapYear year;

    @Before
    public void setUpBeforeClass()
    {
        year = new leapYear();
    }

    @Test
    public void checkLeapYearTest()
    {
        int output = leapYear.checkLeap(2000);
        assertEquals(1,output);
    }

    @Test(expected = IllegalArgumentException.class)
    //had we not written this-> (expected = IllegalArgumentException.class) in front of @Test,
    // the test would have failed. But by mentioning in advance what to expect, passes the test.
    public void negativeValueShouldError()
    {
        int output = leapYear.checkLeap(-5);
    }

    @Test
    public void checkNotLeapYearTest()
    {
        int output = leapYear.checkLeap(2045);
        assertEquals(0,output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroYearShouldGiveError()
    {
        int output = leapYear.checkLeap(0);
    }

    @Test
    public void IntegerMax_Should_Give_False()
    {
        int output = leapYear.checkLeap(Integer.MAX_VALUE );
        assertEquals(0,output);
    }


}