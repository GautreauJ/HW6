package hw6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceBagTest {

	@Test
	public void test() {
		OrderDie OrderDie = new OrderDie("Test", "Red");
		DiceBag d = new DiceBag();
		d.addToken(OrderDie);
		String actual = d.toString();
		String expected = " Dice left: 1\nTest\n";
		assertEquals(expected, actual);
	}
}
