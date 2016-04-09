package q3;

/**
 * <p>
 * Address.java This class is designed to create student home and school
 * addresses. In addtion, this class is used by Student class.
 * </p>
 * 
 * @author TIET, KIET
 * @version 1.0
 */
public class Address {

    /**
     * Street name of the address.
     */
    private String streetName;

    /**
     * City name of the address.
     */
    private String cityName;

    /**
     * State name of the address.
     */
    private String stateName;

    /**
     * The zipcode of the address.
     */
    private String zipCode;

    /**
     * Address Constructor with 4 parameters.
     * 
     * @param streetName
     *            Street name.
     * @param cityName
     *            City name.
     * @param stateName
     *            State name.
     * @param zipCode
     *            Zipcode number.
     */
    public Address(String streetName, String cityName, 
                String stateName, String zipCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "\nAddress \nStreetName: " + streetName + "\nCityName: " 
                + cityName + "\nStateName: " + stateName 
                + "\nZipCode: " + zipCode + "";
    }

}
