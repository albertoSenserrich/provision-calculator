package org.acme.albertosenserrich.provisioncalculator.enums;

public enum Department {

    HR("HR",1.2),
    FINANCE("Finance",1.5),
    OTHER("OTHER",1);

    public final String label;
    public final double ratio;
    
    private Department(String label, double ratio) {
        this.label = label;
        this.ratio  = ratio;
    }
}