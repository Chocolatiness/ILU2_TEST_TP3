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
	
	@Test
	void testWelcomeEx4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
	}
	
	@Test
	void testWelcomeEx5() {
		assertEquals(Welcome.welcome("amy,bob,hippolyte"),"Hello, Amy, Bob, Hippolyte");
		assertEquals(Welcome.welcome("amy,bob,hippolyte,thomas,benoit"),"Hello, Amy, Bob, Hippolyte, Thomas, Benoit");
	}
	
	@Test
	void testWelcomeEx6() {
		assertEquals(Welcome.welcome("amy,BOB,hippolyte"),"Hello, Amy, Hippolyte. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("THOMAS,amy,BOB,hippolyte"),"Hello, Amy, Hippolyte. AND HELLO, THOMAS, BOB !");
	}
	@Test
	void testWelcomeEx8() {
		assertEquals(Welcome.welcome("   amy  ,BOB      ,hippolyte"),"Hello, Amy, Hippolyte. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("THOMAS,amy,      ced,BOB ,    hippolyte"),"Hello, Amy, Ced, Hippolyte. AND HELLO, THOMAS, BOB !");
	}
}
