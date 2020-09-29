/** 
 * Demo.java 
 * 
 * Run a demo of the code. 
 * 
 * @author Chase Faine 
 * @version Summer 2020 
 */ 
public class Demo {
    /** 
     * Main 
     * 
     * Main method.  
     * 
     * @param args 
     */ 
    public static void main(String[] args) {
        Cookie yum = new SugarCookie();
        yum = new PowderedSugar(yum);
        yum = new PowderedSugar(yum);
        yum = new Sprinkles(yum);
        System.out.println(yum.toString());
     
        Cookie yum2 = new GingerbreadCookie();
        yum2 = new PowderedSugar(yum2);
        yum2 = new Sprinkles(yum2);
        yum2 = new Walnuts(yum2);
        yum2 = new Pecans(yum2);
        System.out.println(yum2.toString());
        
        Cookie yum3 = new SugarCookie();
        yum3 = new Walnuts(yum3);
        System.out.println(yum3.toString());
        System.out.println(yum3.hasNuts()); 
    }
}
