package address;

import java.util.*; // brings in all classes from the java.util
import address.data.AddressEntry; // address.data is a sub package

/**
 * AddressBook is a class that holds a collection of objects of the AddressEntry
 * it displays the contact information to the console window
 */
public class AddressBook {

    // list of address entries stored in addressEntryList
    List<AddressEntry> addressEntryList = new ArrayList<>();

    // method that lists all entries in the AddressBook
    public void list()
    {
        // creating an iterator for the list of address entries
        Iterator<AddressEntry> iterator = addressEntryList.iterator();

        // iterate through addressEntryList
        while (iterator.hasNext())
        {
            AddressEntry entry = iterator.next();

            // for each item call toString() and print it out
            System.out.println(entry.toString());
        }
    }

    // method that adds new AddressEntry object to the addressEntryList
    public void add(AddressEntry entry)
    {
        addressEntryList.add(entry);
    }
}
