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
        double totalProvisionForCompany = 0; // total to provision
        if (listOfEmployees != null) {
        	for(Employee employeeElem : listOfEmployees) {
        		totalProvisionForCompany+= employeeElem.calculateExpensesForEmploye();
            }
            System.out.println("Total before other expenses: " + totalProvisionForCompany);
            // this part calculate the fix expenses independently of the type of employee
            totalProvisionForCompany += GeneralConstants.COST_OF_RENT; 
        }
        return (long)totalProvisionForCompany;
    }

/*


Project structura
-Move files .class to another
-create packages in order to  organize DTO in other package and difference betwen dto and manager
-Create test with the happy path

DTO
Create inheritance, manager must extends from employee and employee must have a a default department related

New clases
Create an enumeration with the list of departmeents and the departament factor related, there must be an empty/default department for employess

Create a general constant class for magit numbers on manager
- rent value -> in the future must be loaded from preferences
- conversion of values

Changes of manager


**/
}
