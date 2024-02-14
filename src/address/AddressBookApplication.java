package address;

// address.data is a sub package
import address.data.AddressEntry;

/**
 * AddressBookApplication is a class that contains an instance of AddressBook
 * it displays the contact information to the console window by calling the list() method
 */
public class AddressBookApplication {

    // main method of AddressBookApplication
    public static void main(String[] args)
    {

        // create an instance of AddressBook called addressBook
        AddressBook addressBook = new AddressBook();

        // call initAddressBookExercise to initialize the AddressBook
        initAddressBookExercise(addressBook);

    }

    // method to initialize AddressBook with two AddressEntry instances
    public static void initAddressBookExercise(AddressBook ab)
    {
        // create two instances of AddressEntry
        AddressEntry person1 = new AddressEntry("John", "Doe", "123 Main St", "Alameda",
                                                "California", 12345, "111-1111", "john@example.com");
        AddressEntry person2 = new AddressEntry("Jane", "Smith", "456 Oak St", "Aspen",
                                                "Colorado", 67891, "222-2222", "jane@example.com");

        // add AddressEntry instances to the AddressBook
        ab.add(person1);
        ab.add(person2);

        // call the AddressBook's list() method to display entries
        ab.list();
    }

}