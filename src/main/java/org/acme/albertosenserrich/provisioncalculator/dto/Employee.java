package org.acme.albertosenserrich.provisioncalculator.dto;

import org.acme.albertosenserrich.provisioncalculator.constants.GeneralConstants;
import org.acme.albertosenserrich.provisioncalculator.enums.Department;
import org.acme.albertosenserrich.provisioncalculator.enums.Seniority;

public class Employee {

	protected int salary;
	protected int tenure; // years in the company
	protected Department departmentType;

	public Employee(int salary, int tenure) {
		this.salary = salary;
		this.tenure = tenure;
		this.departmentType = Department.OTHER;
	}

	public long calculateExpensesForEmploye() {
		long totalProvisionForCompany = salary;
		Seniority actualSeniority =  Seniority.getSeniorityByYears(this.tenure);
		//remove floating points from operators
		totalProvisionForCompany = (((long)(actualSeniority.salaryRatio *10)) * ((long)(this.departmentType.ratio *10)) * totalProvisionForCompany)/100;
		return totalProvisionForCompany + GeneralConstants.DEFAULT_EXPENSE_FOR_EMPLOYE;
	}

	public Employee() {
	}

}
