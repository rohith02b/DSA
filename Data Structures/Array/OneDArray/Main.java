import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Array a = new Array(5);

    int choice;
    do {
      System.out.println("\nMenu:");
      System.out.println("1. Display array");
      System.out.println("2. Get element at index");
      System.out.println("3. Insert element");
      System.out.println("4. Find element");
      System.out.println("5. Delete element by index");
      System.out.println("6. Delete element by value");
      System.out.println("0. Exit");

      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          a.display();
          break;
        case 2:
          System.out.print("Enter index: ");
          int index = scanner.nextInt();
          a.getElementAtIndex(index);
          break;
        case 3:
          System.out.print("Enter index: ");
          int insertIndex = scanner.nextInt();
          System.out.print("Enter value: ");
          int insertValue = scanner.nextInt();
          a.insert(insertIndex, insertValue);
          break;
        case 4:
          System.out.print("Enter element to find: ");
          int elementToFind = scanner.nextInt();
          int foundIndex = a.findElement(elementToFind);
          if (foundIndex != -1)
            System.out.println("Found element at index: " + foundIndex);
          else
            System.out.println("Element not found.");
          break;
        case 5:
          System.out.print("Enter index to delete: ");
          int deleteIndex = scanner.nextInt();
          a.deleteElementViaIndex(deleteIndex);
          break;
        case 6:
          System.out.print("Enter value to delete: ");
          int deleteValue = scanner.nextInt();
          a.deleteElementViaValue(deleteValue);
          break;
        case 0:
          System.out.println("Exiting program. Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
          break;
      }
    } while (choice != 0);

    scanner.close();
  }
}
