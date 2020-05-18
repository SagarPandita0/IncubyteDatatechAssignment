import org.junit.*;
import static org.junit.Assert.assertEquals;

public class leapYearTest
{
    private leapYear year;

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

}