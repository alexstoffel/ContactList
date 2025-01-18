import java.util.ArrayList;
import java.util.Scanner;

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
    public void sort(int sortBy) {
        Person p;
        if (sortBy == 1) {
            for (int i = 0; i < contacts.size() - 1; i++) {
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
                    int num = contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName());
                    if (num > 0) {
                        p = contacts.get(i);
                        contacts.set(i, contacts.get(i + 1));
                        contacts.set(i + 1, p);
                    }
                }
            }
        } else if (sortBy == 0) {
            for (int i = 0; i < contacts.size() - 1; i++) {
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
                    int num = contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName());
                    if (num > 0) {
                        p = contacts.get(i);
                        contacts.set(i, contacts.get(i + 1));
                        contacts.set(i + 1, p);
                    }
                }
            }
        } else {
            for (int i = 0; i < contacts.size() - 1; i++) {
                for (int j = 0; j < contacts.size() - 1 - i; j++) {
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

        // Searching functions

    public Person searchByFirstName(String firstName){
            for(Person p: contacts){
                if(p.getFirstName().equals(firstName)){
                    return p;
                }
            }
            return null;
    }

    public Person searchByLastName(String lastName){
        for(Person p: contacts){
            if(p.getLastName().equals(lastName)){
                return p;
            }
        }
        return null;
    }

    public Person searchByPhoneNumber(String phoneNumber){
        for(Person p: contacts){
            if(p.getPhoneNumber().equals(phoneNumber)){
                return p;
            }
        }
        return null;
    }

    public void listStudents(){
        for (Person p: contacts){
            if(p instanceof Student){
                System.out.println(p);
            }
        }
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        int num = 10;
        String name;
        String phoneNumber;
        String lastName;
        int grade;
        String netWorth;

        // Printing everything out
        while(true){
            System.out.println("Menu:\n1. Add Contact\n2. List all contacts by First Name"
             + "\n3. List all contacts by Last Name\n4. List all contacts by Phone Number"
            +"\n5. List all students\n6. Search by First Name\n7. Search by Last Name"
            + "\n8. Search by Phone Number\n0. Exit");
            num = input.nextInt();
            if(num==0){
                break;
            }else if(num == 1){
                System.out.println("Select a type of contact to add:\n1. Student\n2. Adult");
                int number = input.nextInt();
                input.nextLine();
                System.out.println("First Name:");
                name = input.nextLine();
                System.out.println("Last Name:");
                lastName = input.nextLine();
                System.out.println("Phone Number:");
                phoneNumber = input.nextLine();

                // Specific type of contact
                if(number == 1){
                    System.out.println("Grade:");
                    grade = input.nextInt();
                    contacts.add(new Student(name, lastName, phoneNumber, grade));
                }else if(number == 2) {
                    System.out.println("Net Worth:");
                    netWorth = input.nextLine();
                    contacts.add(new Adult(name, lastName, phoneNumber, netWorth));
                }
            }else if(num == 2){
                sort(1);
                System.out.println(contacts);
            }else if(num == 3){
                sort(0);
                System.out.println(contacts);
            }else if(num == 4){
                sort(2);
                System.out.println(contacts);
            }else if(num == 5){
                listStudents();
            }else if(num == 6){
                System.out.println("Enter a name:");
                input.nextLine();
                String aname = input.nextLine();
                if(searchByFirstName(aname) == null){
                    System.out.println(aname + " is not in the list");
                }else{
                    // REDO THIS PART
                    System.out.println(searchByFirstName(aname));
                }
            }else if(num == 7){
                System.out.println("Enter a last name:");
                input.nextLine();
                String alastName = input.nextLine();
                if(searchByLastName(alastName) == null){
                    System.out.println(alastName + " is not in the list");
                }else{
                    // REDO THIS PART
                    System.out.println(searchByLastName(alastName));
                }
            }else if(num == 8){
                System.out.println("Enter a Phone Number:");
                input.nextLine();
                String aphoneNumber = input.nextLine();
                if(searchByPhoneNumber(aphoneNumber) == null){
                    System.out.println(aphoneNumber + " is not in the list");
                }else{
                    // REDO THIS PART
                    System.out.println(searchByPhoneNumber(aphoneNumber));
                }

            }
            
        }
    }

    // main
    public static void main(String[] args) {
        ContactList game = new ContactList();
        game.run();
    }


}


