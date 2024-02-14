package address.data;

/**
 * AddressEntry is a class to represent a contact in the AddressBook
 * it contains contact information, etc. for the related person
 */

public class AddressEntry {
    // attributes of the class
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    // default constructor
    public AddressEntry()
    {
        // initialize default values
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.phone = "";
        this.email = "";
    }

    // parameterized constructor
    public AddressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String phone, String email)
    {
        // create instance and initialize all attribute values
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // method for printing
    public String toString()
    {
        // returns formatted information
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nStreet: " + street +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nPhone: " + phone +
                "\nEmail: " + email + "\n";

    }

    // getters and setters
    public void setFirstName(String firstname)
    {
        // set the first name
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        // get and return the first name
        return firstName;
    }
    public void setLastName(String lastName)
    {
        // set the last name
        this.lastName = lastName;
    }
    public String getLastName()
    {
        // get and return the last name
        return lastName;
    }

    public void setStreet(String street)
    {
        // set the street name
        this.street = street;
    }

    public String getStreet()
    {
        // get and return the street name
        return street;
    }
    public void setCity(String city)
    {
        // set the city name
        this.city = city;
    }
    public String getcity()
    {
        // get and return the city name
        return city;
    }
    public void setState(String state)
    {
        // set the state name
        this.state = state;
    }
    public String getState()
    {
        // get and return the state name
        return state;
    }

    // FINISH ALL THE REST OF THE set* and get* methods()

    public void setZip(Integer zip)
    {
        // set the zip code
        this.zip = zip;
    }

    public int getZip()
    {
        // get and return the zip code
        return zip;
    }

    public void setPhone(String phone)
    {
        // set the phone number
        this.phone = phone;
    }

    public String getPhone()
    {
        // get and return the phone number
        return phone;
    }

    public void setEmail(String email)
    {
        // set the email
        this.email = email;
    }

    public String getEmail()
    {
        // get and return the email
        return email;
    }

}
