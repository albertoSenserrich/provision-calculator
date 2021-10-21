package org.acme.albertosenserrich.provisioncalculator.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.albertosenserrich.provisioncalculator.constants.GeneralConstants;
import org.acme.albertosenserrich.provisioncalculator.dto.Employee;


@ApplicationScoped
public class ProvisionCalculator {
    
    /**
     * This method calculates the provision for next year
     * @param listOfEmployees List with current Employees
     */
    public long calculateProvision(List<Employee> listOfEmployees) {
        long totalProvisionForCompany = 0; // total to provision
        if (listOfEmployees != null) {
        	for(Employee employeeElem : listOfEmployees) {
        		totalProvisionForCompany += employeeElem.calculateExpensesForEmploye();
            }
            totalProvisionForCompany += GeneralConstants.COST_OF_RENT ; 
        }
        return totalProvisionForCompany;
    }

}
