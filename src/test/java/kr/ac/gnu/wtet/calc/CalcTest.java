package kr.ac.gnu.wtet.calc;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
        Calc c = new Calc();
        assertEquals(30, c.add(10, 20));
    }
}
