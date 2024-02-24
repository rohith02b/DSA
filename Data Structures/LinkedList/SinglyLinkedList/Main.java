import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SLL linkedList = new SLL();
        int choice;
        do {
            System.out.println("1. Insert node at end");
            System.out.println("2. Insert node at start");
            System.out.println("3. Insert node at index");
            System.out.println("4. Display linked list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at end: ");
                    int valueAtEnd = scanner.nextInt();
                    linkedList.insertNodeAtEnd(valueAtEnd);
                    break;
                case 2:
                    System.out.print("Enter value to insert at start: ");
                    int valueAtStart = scanner.nextInt();
                    linkedList.insertNodeAtStart(valueAtStart);
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter value to insert at index " + index + ": ");
                    int valueAtIndex = scanner.nextInt();
                    linkedList.insertNodeAtIndex(index, valueAtIndex);
                    break;
                case 4:
                    System.out.println("Linked List:");
                    linkedList.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
