package address;

/**
 * Menu has a number of static prompt* methods that will ask user for details about
 * a new person for use in an addressbook.
 */
public class Menu {

    /**
     * prompt for First Name
     * @return the First Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_FirstName(){
        System.out.println("First Name:");

        //for now return a default first name
        return "Jane";
    }

//***YOU NOW FINISH CODE TO CALL ALL the rest of the Menu prompts and display to standard output

    /**
     * prompt for Last Name
     * @return the Last Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_LastName(){
        System.out.println("Last Name:");

        //for now return a default first name
        return "Doe";
    }

    /**
     * prompt for Street
     * @return the Street entered in by the user, if nothing entered in will use default
     */

    public static String prompt_Street(){
        System.out.println("Street:");

        //for now return a default first name
        return "Street name";
    }

    /**
     * prompt for City
     * @return the City entered in by the user, if nothing entered in will use default
     */

    public static String prompt_City(){
        System.out.println("City:");

        //for now return a default first name
        return "City name";
    }

    /**
     * prompt for State
     * @return the State entered in by the user, if nothing entered in will use default
     */

    public static String prompt_State(){
        System.out.println("State:");

        //for now return a default first name
        return "State name";
    }

    /**
     * prompt for Zip code
     * @return the Zip code entered in by the user, if nothing entered in will use default
     */

    public static String prompt_Zip(){
        System.out.println("Zip:");

        //for now return a default first name
        return "Zip code";
    }

    /**
     * prompt for Telephone
     * @return the Telephone entered in by the user, if nothing entered in will use default
     */

    public static String prompt_Telephone(){
        System.out.println("Telephone:");

        //for now return a default first name
        return "Telephone number";
    }

    /**
     * prompt for Email
     * @return the Email entered in by the user, if nothing entered in will use default
     */

    public static String prompt_Email(){
        System.out.println("Email:");

        //for now return a default first name
        return "Email";
    }

}