package org.acme.albertosenserrich.provisioncalculator.enums;

public enum Seniority {

	JUNIOR(3, 1.0), ADVANCED(10 ,1.2), SENIOR(Integer.MAX_VALUE, 1.5);

	private final int minYearsInDeCompany;
	public final double salaryRatio;
	
	private Seniority(int yearsInDeCompany, double salaryRatio) {
		this.minYearsInDeCompany = yearsInDeCompany;
		this.salaryRatio = salaryRatio;
	}

	public static Seniority getSeniorityByYears(int actualYears) {
		Seniority selected = null;
		for (Seniority seniorityTemp : Seniority.values()) {
			if (seniorityTemp.minYearsInDeCompany > actualYears
					&& (selected == null || seniorityTemp.minYearsInDeCompany < selected.minYearsInDeCompany)) {
				selected = seniorityTemp;
			}
		}
		return selected;

	}
}