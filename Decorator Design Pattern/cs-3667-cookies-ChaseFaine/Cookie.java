/**
 * Cookie.java
 *
 * Cookie abstraction.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 *
 * COPYRIGHT (C) 2020 Jay Fenwick. All Rights Reserved.
 * Rights granted to AppState CS students to copy/modify for educational 
 * purposes.
 */

/**
 * Cookie is an abstraction of cookie objects.
 *
 * @author Jay Fenwick
 * @version Summer 2020
 */
public abstract class Cookie {
    private String description;
    
    /** 
     * Sets the cookie description. 
     *
     * @param d 
     */ 
    public void setDescription(String d) {
        description = d;
    }

    /**
       Returns object description attribute value.
       
       @return description attribute value.
    */
    public String getDescription() {
	return description;
    }
    
    /**
       Determines number of calories in cookie.

       Abstract cookie does not know value, so subclass must implement.

       @return number of calories in cookie (int)
    */
    abstract public int calories();

    /**
       Determines cost of cookie.

       Abstract cookie does not know value, so subclass must implement.

       @return cost of cookie (double)
    */
    abstract public double cost();

    /**
       Concise output of object attributes (not wordy like description).

       Abstract cookie does not know value, so subclass must implement.

       @return object attributes string (String)
    */
    abstract public String toString();
    
    /** 
     * Check if nuts are present. 
     *
     * @return if nuts are present
     */ 
    abstract public boolean hasNuts();
}

