/** 
 * ChocolateChips.java 
 * 
 * Addable topping. 
 * 
 * @author Chase Faine 
 * @version Fall 2020 
 */ 
public class ChocolateChips extends ToppingsDecorator {
    /** 
     * Constructor 
     * 
     * Constructor for ChocolateChips.
     *
     * @param cookie  
     */ 
    public ChocolateChips(Cookie cookie) {
        this.cookie = cookie;
    }
    
    /**
     * Determines the description. 
     * 
     * @return description  
     */ 
    public String getDescription() {
        return cookie.getDescription() + ", Chocolate Chips";
    }
    
    /** 
     * Determines the cost. 
     * 
     * @return cost 
     */ 
    public double cost() {
        return 0.55 + cookie.cost();
    }
    
    /**  
     * Determine the number of calories. 
     * 
     * @return calories 
     */ 
    public int calories() {
        return 60 + cookie.calories();
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
        if (hasNuts()) {
            return str + noots;
        }
        return str;       
    }
    
    /** 
     * Checks if nuts are present. 
     *
     * @return if nuts are present
     */ 
    public boolean hasNuts() {
        if (cookie.hasNuts()) {
            return true;
        }
        return false;
    }
}
