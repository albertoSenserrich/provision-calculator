package org.acme.albertosenserrich.provisioncalculator.dto;

import org.acme.albertosenserrich.provisioncalculator.constants.GeneralConstants;
import org.acme.albertosenserrich.provisioncalculator.enums.Department;

public class Employee {

	protected int salary;
	protected int tenure; // years in the company
	protected Department departmentType;

	public Employee(int salary, int tenure) {
		this.salary = salary;
		this.tenure = tenure;
		this.departmentType = Department.OTHER;
	}

	public double calculateExpensesForEmploye() {
		double totalProvisionForCompany;
		if (this.tenure < 3) {
			totalProvisionForCompany = this.salary * this.departmentType.ratio;
		} else if (this.tenure < 10) {
			totalProvisionForCompany = this.salary * 1.2 * this.departmentType.ratio;
		} else {
			totalProvisionForCompany = this.salary * 1.5 * this.departmentType.ratio;
		}
		return totalProvisionForCompany+ GeneralConstants.DEFAULT_EXPENSE_FOR_EMPLOYE;
	}

	public Employee() {
	}

}
