package com.xyzcorp;

import org.junit.Test;
import org.junit.Assert;

public class EmployeeTest extends Object {
    @Test public void testFirstName() {
		Employee employee = new Employee("Carl", "Withers");
		Assert.assertEquals("Carl", employee.getFirstName());
	}
}
