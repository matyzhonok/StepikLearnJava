import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson_2_1_Test extends Assertions {



    @Test
    public void LeapYearCountTest() {
        assertEquals(0, Lesson_2_1.leapYearCount(1));
        assertEquals(1, Lesson_2_1.leapYearCount(4));
        assertEquals(24, Lesson_2_1.leapYearCount(100));
    }
}
