package test;

import org.junit.Test;
import pack.Square;
import static org.junit.Assert.*;

public class Mango {

	@Test
	public void testArea() {
		Square s = new Square(6.0);
		System.out.println(s.area());
		assert s.area() == 36.0;
	}
}
