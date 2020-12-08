package kr.ac.gnu.wtet.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calc2Test {

	@Test
	public void test() {
		Calc2 c = new Calc2();
		assertEquals(30, c.multiple(5, 6));
	}

}
