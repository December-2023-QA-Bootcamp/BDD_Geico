package unittest;

import org.junit.Test;

public class StringFormatter {

	@Test
	public void testStringFormat() {
		String name = "Md Nasir";
		System.err.println(String.format("My Name is [%s], I live in {%s}. I am %d years old",
				name, "New York", 55));
	}
}
