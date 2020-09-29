/** 
 * ToppingsDecorator.java 
 * 
 * Toppings. 
 * 
 * @author Chase Faine 
 * @version Summer 2020 
 */ 

/** 
 * Toppings Decorator class for Cookie.
 *
 * @author Chase Faine 
 * @version Fall 2020  
 */ 
public abstract class ToppingsDecorator extends Cookie { 
    Cookie cookie;
    
   /**   
    * Get description for cookie. Made by topping classes. 
    * 
    * @return description 
    */ 
    abstract public String getDescription();
    
    /** 
     * Determine the number of calories. 
     * 
     * @return calories 
     */ 
    abstract public int calories();
   
    /** 
     * Determine the cost. 
     * 
     * @return cost 
     */ 
    abstract public double cost();
    
    /** 
     * Checks if nuts are present. 
     *
     * @return if nuts are present
     */  
    abstract public boolean hasNuts(); 
}
