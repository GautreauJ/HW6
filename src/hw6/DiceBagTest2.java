package hw6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceBagTest2 {

	@Test
	public void test() {
		DiceBag d = new DiceBag();
		OrderDie OrderDie = new OrderDie("Test", "Red");
		OrderDie OrderDie2 = new OrderDie("Test2", "Blue");
		d.addToken(OrderDie);
		d.addToken(OrderDie2);
		String actual = d.toString();
		String expected = " Dice left: 2\nTest\nTest2\n";
		assertEquals(expected, actual);
	}

}
