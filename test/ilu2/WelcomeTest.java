package ilu2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class WelcomeTest {

		@Test
		void testWelcomeEx1() {
			assertEquals(Welcome.welcome("bob"),"Hello, Bob");
			assertEquals(Welcome.welcome("hippolyte"),"Hello, Hippolyte");
		}
	@Test
	void testWelcomeEx2() {
		assertEquals(Welcome.welcome(" "),"Hello, my friend");
		assertEquals(Welcome.welcome(""),"Hello, my friend");
		assertEquals(Welcome.welcome("              "),"Hello, my friend");
	}
	
	@Test
	void testWelcomeEx3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
		assertEquals(Welcome.welcome("BOB"),"HELLO, BOB !");
	}
	

}
