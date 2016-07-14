package ly.generalassemb.drewmahrt.oofundamentals;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by raymour on 7/14/16.
 */
public class LionTest {

    Lion lion = new Lion(true);

    @Test
    public void testLionNoise() throws Exception {
        assertEquals("Roar!!!", lion.makeNoise());

    }

    @Test
    public void testLionSpeed() throws Exception{
        assertEquals(50, lion.getTopSpeed());



    }
}
