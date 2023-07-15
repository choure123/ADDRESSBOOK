import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private Map<String, String> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Address Book:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            // switch case in use ...
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("enter address ");
                    String address = scanner.nextLine();
                    addressBook.addContact(name, phoneNumber);
                    System.out.println("Contact added successfully.");
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String removeName = scanner.nextLine();
                    addressBook.removeContact(removeName);
                    System.out.println("Contact removed successfully.");
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

