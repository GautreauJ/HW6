package hw6;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceBagTest3 {

	@Test
	public void test() {
		DiceBag d = new DiceBag();
		OrderDie OrderDie = new OrderDie("Test", "Blue");
		OrderDie OrderDie2 = new OrderDie("Test2", "Blue");
		OrderDie OrderDie3 = new OrderDie("Test3", "Blue");
		OrderDie OrderDie4 = new OrderDie("Test4", "Red");
		OrderDie OrderDie5 = new OrderDie("Test5", "Red");
		d.addToken(OrderDie);
		d.addToken(OrderDie2);
		d.addToken(OrderDie3);
		d.addToken(OrderDie4);
		d.addToken(OrderDie5);
		String actual = d.toString();
		String expected = " Dice left: 5\nTest\nTest2\nTest3\nTest4\nTest5\n";
		assertEquals(expected, actual);
	}

}
