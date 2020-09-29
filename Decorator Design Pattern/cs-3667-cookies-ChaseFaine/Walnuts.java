/** 
 * Walnuts.java 
 * 
 * Addable topping. 
 * 
 * @author Chase Faine 
 * @version Fall 2020 
 */ 
public class Walnuts extends ToppingsDecorator {
    /** 
     * Constructor 
     * 
     * Constructor for Walnuts.
     *
     * @param cookie  
     */ 
    public Walnuts(Cookie cookie) {
        this.cookie = cookie;
    }
    
    /**
     * Determines the description. 
     * 
     * @return description  
     */ 
    public String getDescription() {
        return cookie.getDescription() + ", Walnuts";
    }
    
    /** 
     * Determines the cost. 
     * 
     * @return cost 
     */ 
    public double cost() {
        return 0.50 + cookie.cost();
    }
    
    /**  
     * Determine the number of calories. 
     * 
     * @return calories 
     */ 
    public int calories() {
        return 45 + cookie.calories();
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
