/** 
 * GingerbreadCookie.java 
 * 
 * Gingerbread cookie abstraction. 
 * 
 * @author Chase Faine 
 * @version Summer 2020 
 */

/** 
 * GingerbreadCookie is a realization of the cookie abstraction. 
 * 
 * @author Chase Faine 
 * @version Summer 2020 
 */  
public class GingerbreadCookie extends Cookie {
    private int calories;
    private double cost;
    
    /**  
     * Constructor. 
     * 
     * GingerbreadCookie knows its attribute values. 
     */ 
    public GingerbreadCookie() {
        super.setDescription("Gingerbread");
        calories = 275;
        cost = 0.75;
    }

    /**  
     * Determines the number of calories in a cookie. 
     * 
     * @return number of calories 
     */ 
    public int calories() { 
        return calories; 
    }

    /**  
     * Determines the cost of a cookie. 
     * 
     * @return cost of cookie 
     */ 
    public double cost() {
        return cost;
    }
    
    /**  
     * String of object attribute values. 
     * 
     * @return object attribute values string-ified (String) 
     */ 
    public String toString() {
        return "[" + super.getDescription() + ","
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
