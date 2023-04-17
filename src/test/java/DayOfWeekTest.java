import StaticClassesEnumExceptions.DayOfWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayOfWeekTest {

    private DayOfWeek dayOfWeek;

    @BeforeEach
    public void setup() {
        dayOfWeek = new DayOfWeek();
    }

    @Test
    public void testPositive() {
        Assertions.assertEquals("Sunday", dayOfWeek.getDay(1));
        Assertions.assertEquals("Monday", dayOfWeek.getDay(2));
        Assertions.assertEquals("Tuesday", dayOfWeek.getDay(3));
        Assertions.assertEquals("Wednesday", dayOfWeek.getDay(4));
        Assertions.assertEquals("Thursday", dayOfWeek.getDay(5));
        Assertions.assertEquals("Friday", dayOfWeek.getDay(6));
        Assertions.assertEquals("Saturday", dayOfWeek.getDay(7));
    }

    @Test
    public void testNegative() {
        Assertions.assertEquals("The number should be equal or larger than 1", dayOfWeek.getDay(0));
        Assertions.assertEquals("The number should be equal or smaller than 7", dayOfWeek.getDay(8));
    }

    @Test
    public void testNullValue() {
        Assertions.assertThrows(NullPointerException.class, () -> dayOfWeek.getDay(null));
    }
}