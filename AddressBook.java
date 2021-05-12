package apistream;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<AddressBookEntry> listOfEntries;

    public AddressBook() {
        //initialize list of entries
        this.listOfEntries = new ArrayList<>();
    }

    public void add(AddressBookEntry addressBookEntry){
        //List.add adds a new Object to a List
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(int index){
        //List.remove(int index) removes a object at the given index
        this.listOfEntries.remove(index);
    }

    public AddressBookEntry get(int index){
        //List.get(int index)returns object at the given index
        return this.listOfEntries.get(index);
    }

    public void  viewAll() {

        //Useing Stream
        listOfEntries.stream().forEach(data -> System.out.println(data));

    }
}
