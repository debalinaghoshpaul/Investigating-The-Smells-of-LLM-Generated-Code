import static org.junit.Assert.*;

public class WeekendTest {

    @Test
    public void testEnumContainsExpectedConstants() {
        assertTrue(Weekend.contains(Weekend.SATURDAY));
        assertTrue(Weekend.contains(Weekend.SUNDAY));
    }
}
