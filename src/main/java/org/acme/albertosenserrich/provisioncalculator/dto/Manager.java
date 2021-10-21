package org.acme.albertosenserrich.provisioncalculator.dto;

import org.acme.albertosenserrich.provisioncalculator.enums.Department;

public class Manager extends Employee{
    
    public Manager(int salary, int tenure, Department department) {
    	super();
        this.salary = salary;
        this.tenure = tenure;
        this.departmentType = department;
    }
}
