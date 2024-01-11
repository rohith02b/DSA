import java.util.Arrays;

class Array {
  int arr[] = null;

  public Array(int size) {
    arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.MIN_VALUE;
    }
  }

  public void insert(int index, int value) {
    try {
      if (arr[index] == Integer.MIN_VALUE) {
        arr[index] = value;
      } else {
        System.out.println("The cell is already occupied");
      }
    } catch (Exception e) {
      System.out.println("Invalid index, index out of bounds of the array");
    }
  }

  public void getElementAtIndex(int index) {
    try {
      Boolean isArrayEmpty = getArrStatus();
      if (isArrayEmpty) {
        System.out.println("The array is empty");
        return;
      } 
      System.out.println("The element at index " + index + " is " + arr[index]);
    } catch (Exception e) {
        System.out.println("Invalid index, index out of bounds of the array");
    } 
  }

  public void display() {
    try {
      Boolean isArrEmpty = getArrStatus();
      if (isArrEmpty) {
        throw new Exception("Array is empty");
      }
      System.out.print("[ ");
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != Integer.MIN_VALUE) {
          System.out.print(arr[i] + " ");
        }
      }
      System.out.print("]");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private Boolean getArrStatus() {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != Integer.MIN_VALUE) {
        return false;
      }
    }
    return true;
  }
}
