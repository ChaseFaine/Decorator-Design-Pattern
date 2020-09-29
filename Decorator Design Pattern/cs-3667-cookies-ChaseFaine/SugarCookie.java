/**
 * SugarCookie.java
 *
 * Sugar cookie abstraction.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 *
 * COPYRIGHT (C) 2020 Jay Fenwick. All Rights Reserved.
 * Rights granted to AppState CS students to copy/modify for educational 
 * purposes.
 */

/**
 * SugarCookie is a realization of the cookie abstraction.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 */

public class SugarCookie extends Cookie {
    private int calories;
    private double cost;
    private int nuts;

    /**
       Constructor.

       SugarCookie knows its attribute values.
    */
    public SugarCookie() {
	super.setDescription("Sugar");
	calories = 315;
	cost = 0.50;
    }

 
    /**
       Determines number of calories in cookie.

       @return number of calories in cookie (int)
    */
    public int calories() { return calories; }
 
    /**
       Determines cost of cookie.

       @return cost of cookie (double)
    */
    public double cost() { return cost; }
 
    /**
       Concise string of object attribute values.

       @return object attribute values string-ified (String)
    */
    public String toString() {
	return "[" 
	    + super.getDescription() + "," 
	    + calories + "," 
	    + "$ " + cost 
	    + "]";
    }
    
    /** 
     * Checks if nuts are present.
     *
     * @return if nuts are present 
     */ 
    public boolean hasNuts() {
        return false;
    }
}
