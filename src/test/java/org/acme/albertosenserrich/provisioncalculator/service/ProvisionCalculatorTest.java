package org.acme.albertosenserrich.provisioncalculator.service;

import java.util.Arrays;

import javax.inject.Inject;

import org.acme.albertosenserrich.provisioncalculator.dto.Employee;
import org.acme.albertosenserrich.provisioncalculator.dto.Manager;
import org.acme.albertosenserrich.provisioncalculator.enums.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ProvisionCalculatorTest {

	@Inject
	ProvisionCalculator serviceProvisionCalculator;

	@Test
    public void baseTestCase() {
		//having
    	 Employee employee1 = new Employee(30000, 5);
	      Manager manager = new Manager(28000,7, Department.HR);
    	//when
		long result = serviceProvisionCalculator.calculateProvision(Arrays.asList(employee1, manager));
		// then
		Assertions.assertEquals(result, 4396606);
    }

	@Test
    public void AllDepartmentsAllTenances() {
		//having
    	 Employee employee1 = new Employee(30000, 5);
    	 Employee employee2 = new Employee(30000, 15);
	      Manager manager = new Manager(28000,7, Department.HR);
	      Manager manager2 = new Manager(28000,1, Department.FINANCE);
    	//when
	    long result = serviceProvisionCalculator.calculateProvision(Arrays.asList(employee1,manager,manager2,employee2));
	    //then
        Assertions.assertEquals(result, 4483806 );
    }
	

}
