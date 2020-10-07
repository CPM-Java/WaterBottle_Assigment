/**
 * Program source code is what you are looking at on this page.
 * Source code is mostly -comments (//line comments  /*and block comments*)
 *                       -reserved words ('private'is a reserved word)
 *                       -identifiers ('myBeverageStr' is an identifier).
 * 
 * Reserved words are part of the actual java language and cannot be used for
 * anything other than their specified purpose. Surprisingly, for all of java's
 * capabilities, there are only 53 reserved words. 
 * 
 * Identifiers are chosen
 * by the programmer to represent variables, methods, objects and more.
 * Identifiers  follow a set of formatting guidelines such as using
 * 'my' to begin each instance identifier.
 * 
 * In the program below, circle the comments and put a # by each reserved word.
 * Then provide examples of the identifiers named at the bottom of the page.
 * 
 * @author MrCoyner
 * @version 8/8/17
 */
public class WaterBottle_Assign
{
    
    private final double CAPACITY = 16.0;
    private double myAmount = 0.0;
    private String myBeverageStr = "liquid";


    /**
     * This method removes the bottle's contents
     * 
     * @return     a String literal indicating the bottle is empty 
     */
    public String emptyBottle()
    {
        myAmount = 0;
        myBeverageStr = "liquid";
        return "The bottle is empty";
    }
    
    /**
     * This method fills the bottle to CAPACITY with the specified beverage.
     * It requires that the client specify the type of beverage as a String literal
     * When you make a String literal remember to put it in quotes: "orange juice"
     * 
     * @param   stuff a String identifier specifying the type of beverage in the bottle
     * @return     a String literal indicating the bottle is full 
     */
    public String fillBottle(String stuff)
    {
        myAmount = CAPACITY;
        myBeverageStr = stuff;
        return "The bottle is full of " + myBeverageStr;
    }
    
    /**
     * This method simulates another object consuming the beverage from the bottle.
     * It requires that the client specify the amount of beverage consumed in ounces.
     * 
     * @param   gulpAmt a double representing the amount consumed in ounces
     * @return     a String literal indicating the bottle is empty or the client object has been refreshed 
     */
    public String drink(double gulpAmt)
    {                                   
        myAmount = myAmount - gulpAmt; 
        
        if(myAmount <= 0) return this.emptyBottle();
        else return "Ahhh, Refreshing";
    }
    
    public String toString()
    {
        return "The bottle contains " + myAmount + " of " + myBeverageStr + "."; 
    }
}
/*Provide unique examples of the following as used in the source code above:
 * 
 * a. instance identifier
 * 
 * b. class identifier
 * 
 * c. method identifier
 * 
 * d. constant identifier
 * 
 * e. String identifier
 * 
 * f. double identifier
 * 
 * g. local identifier
 * 
 */