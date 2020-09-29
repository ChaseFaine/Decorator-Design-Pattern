/** 
 * Pecans.java  
 * 
 * Addable topping. 
 * 
 * @author Chase Faine 
 * @version Fall 2020 
 */ 
public class Pecans extends ToppingsDecorator {
    /** 
     * Constructor 
     * 
     * Constructor for Pecans.
     *
     * @param cookie  
     */ 
    public Pecans(Cookie cookie) {
        this.cookie = cookie;
    }
    
    /**
     * Determines the description. 
     * 
     * @return description  
     */ 
    public String getDescription() {
        return cookie.getDescription() + ", Pecans";
    }
    
    /** 
     * Determines the cost. 
     * 
     * @return cost 
     */ 
    public double cost() {
        return 0.40 + cookie.cost();
    }
    
    /**  
     * Determine the number of calories. 
     * 
     * @return calories 
     */ 
    public int calories() {
        return 55 + cookie.calories();
    }
    
    /** 
     * String of object attribute values. 
     * 
     * @return cookie info in a string 
     */ 
    public String toString() {
        String str = "[" 
            + getDescription() + ","
            + calories() + ","
            + "$ " + cost()
            + "]";
        String noots = "CONTAINS NUTS!";
        return str + noots;       
    }
    
    /** 
     * Checks if nuts are present. 
     *
     * @return if nuts are present
     */ 
    public boolean hasNuts() {
        return true;
    }
}
