package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by raymour on 7/14/16.
 */
public class SnakeTest{

    Snake snake = new Snake(true);


    @Test
public void testSnakeNoise() throws Exception {
    assertEquals("Hiss!!!", snake.makeNoise());
}

    @Test
public void testSnakeSpeed() throws Exception {
    assertEquals(5, snake.getTopSpeed());

    }
}