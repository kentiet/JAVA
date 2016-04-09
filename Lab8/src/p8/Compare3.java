/**
 * 
 */
package p8;

/**
 * Compare3.java.
 * @author KenTiet
 * @version 1.0
 */
public abstract class Compare3 implements Comparable<Compare3>  {
    /*
    private Object val1;
    private Object val2;
    private Object val3;
    
    /*
    private String s1;
    private String s2;
    private String s3;
    */

    
    /*
    private String str;
    
    public Compare3(String newStr) {
        str = newStr;
    }*/
        /*str1 = s1;
        str2 = s2;
        str3 = s3;
    }*/
    /**
     * Get largest method.
     * @param compare1 first comparable object.
     * @param compare2 second comparable object.
     * @param compare3 third comparable object.
     * @return the largest.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Comparable largest(Comparable compare1, 
            Comparable compare2, Comparable compare3) {
        if (compare1.compareTo(compare2) > 0) {
            if (compare1.compareTo(compare3) > 0) {
                return compare1;
            } else {
                return compare3;
            }
        } else {
            if (compare2.compareTo(compare3) > 0) {
                return compare2;
            } else {
                return compare3;
            }
        }
    }
    /*
    public int compareTo(Object obj) {
        return str.compareTo((String) ((Object) obj));
    }*/
        

        /*
         * if (str1.compareTo(str2) > 0) {
            if (str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if (str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
            
        }*/

}
    

