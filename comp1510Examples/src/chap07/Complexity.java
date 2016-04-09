package chap07;

/**
 * Represents the interface for an object that can be assigned an
 * explicit complexity.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public interface Complexity {
    
    /** default complexity. */
    int DEFAULT_COMPLEXITY = 1;
    
    /** set complexity of item.
     * @param complexity new value for complexity
     */
    void setComplexity(int complexity);

    /** get complexity of item.
     * @return complexity of item
     */
    int getComplexity();
    

}
