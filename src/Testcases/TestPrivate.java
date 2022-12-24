package Testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import string.Private;

class TestPrivate {

	@Test
	public void testTwoNum() {
		Private p = new Private();
		int sum = p.Sum(10, 20);
		assertEquals(30, sum);
	}

	@Test
	public void testSumOfTwoNumbers()
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {

		Method method = Private.class.getDeclaredMethod("sumOfTwoNum", Integer.class, Integer.class);
		method.setAccessible(true); // we should invoke obj,param
		Private p = new Private();
		int sum = (int) method.invoke(p, 10, 20);
		assertEquals(30, sum);

	}
}
