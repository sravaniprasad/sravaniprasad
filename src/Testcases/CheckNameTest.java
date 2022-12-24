package Testcases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckNameTest {

	@Test
	public void Username() {
String userName="sravani123";
String userName1="sravani 123";
String userName2="sravani_123";
String userName3="sravani@123";
assertEquals("sravani123", userName);

//assertTrue(isValidUsername(userName));

	}
}
