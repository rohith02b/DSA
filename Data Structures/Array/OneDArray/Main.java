public class Main {
  public static void main(String[] args) {
    Array a = new Array(5);

    // Empty array case
    a.display();
    a.getElementAtIndex(1);

    a.insert(1, 100);
    a.insert(2, 200);
    a.insert(3, 300);

    // Occupied case
    a.insert(1, 100);

    a.getElementAtIndex(1);

    // out of bounds case
    a.getElementAtIndex(5);

    a.display();
  }
}