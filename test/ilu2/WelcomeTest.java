package ilu2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcomeEx1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}

}
