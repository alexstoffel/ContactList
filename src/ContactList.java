import java.util.ArrayList;

public class ContactList {
    private ArrayList<Person> contacts;

    // Constructor
    public ContactList(){
        contacts = new ArrayList<Person>();
    }

    // Getters
    public ArrayList<Person> getContacts() {
        return contacts;
    }

    // Setters
    public void addContact(Adult adult){
        contacts.add(adult);
    }
    public void addContact(Student student){
        contacts.add(student);
    }

    // Print contacts
    public void printContacts(){
        for(Person p: contacts){
            System.out.println(p);
        }
    }

    // Sort function
    public void sort(int sortBy){
        if(sortBy == 0){

        }
    }
}
