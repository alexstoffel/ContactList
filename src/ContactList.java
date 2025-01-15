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
        Person p;
        if(sortBy == 1){
            for (int i = 0; i < contacts.size()-1; i++){
                for(int j = 0; j < contacts.size()-1-i; j++) {
                    int num = contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName());
                    if (num > 0) {
                        p = contacts.get(i);
                        contacts.set(i, contacts.get(i + 1));
                        contacts.set(i + 1, p);
                    }
                }
            }
        }else if(sortBy == 0){
            for (int i = 0; i < contacts.size()-1; i++){
                for(int j = 0; j < contacts.size()-1-i; j++) {
                    int num = contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName());
                    if (num > 0) {
                        p = contacts.get(i);
                        contacts.set(i, contacts.get(i + 1));
                        contacts.set(i + 1, p);
                    }
                }
            }
        }else{
            for (int i = 0; i < contacts.size()-1; i++){
                for(int j = 0; j < contacts.size()-1-i; j++) {
                    int num = contacts.get(j).getPhoneNumber().compareTo(contacts.get(j + 1).getPhoneNumber());
                    if (num > 0) {
                        p = contacts.get(i);
                        contacts.set(i, contacts.get(i + 1));
                        contacts.set(i + 1, p);
                    }
                }
            }
        }
    }

}
