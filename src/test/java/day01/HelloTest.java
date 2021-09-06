package day01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	public void case01() {
		// Arrange
		Hello hello = new Hello();
		// Act
		String actualResult = hello.sayhi("pongsakorn");
		// Assert
		assertEquals("Hello, pongsakorn", actualResult);
		
	}

}
