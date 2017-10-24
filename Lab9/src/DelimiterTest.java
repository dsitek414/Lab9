import static org.junit.Assert.*;

import org.junit.Test;

public class DelimiterTest {

	@Test
	public void test() {
		DelimiterChecker testDelim = new DelimiterChecker();
		assertTrue(testDelim.check("")); // true
		
		assertFalse(testDelim.check("(")); // false
		assertFalse(testDelim.check(")")); // false
		assertTrue(testDelim.check("()")); // true
		
		assertFalse(testDelim.check("{")); // false
		assertFalse(testDelim.check("}")); // false
		assertTrue(testDelim.check("{}")); // true
		
		assertFalse(testDelim.check("[")); // false
		assertFalse(testDelim.check("]")); // false
		assertTrue(testDelim.check("[]")); // true
		
		assertTrue(testDelim.check("({})")); // true
		assertTrue(testDelim.check("(()) {}")); // true
		assertFalse(testDelim.check("[()}]")); // false
	}

}
