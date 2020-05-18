import org.junit.*;
import static org.junit.Assert.assertEquals;

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
        leapYear test = new leapYear();
        int output = test.checkLeap(2000);
        assertEquals(1,output);
    }

    @Test(expected = IllegalArgumentException.class)
    //had we not written this-> (expected = IllegalArgumentException.class) in front of @Test,
    // the test would have failed. But by mentioning in advance what to expect, passes the test.
    public void negativeValueShouldError()
    {
        leapYear test = new leapYear();
        int output = test.checkLeap(-5);
    }

    @Test
    public void checkNotLeapYearTest()
    {
        leapYear test = new leapYear();
        int output = test.checkLeap(2045);
        assertEquals(0,output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroYearShouldGiveError()
    {
        leapYear test = new leapYear();
        int output = test.checkLeap(0);
    }
}