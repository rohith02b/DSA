import java.util.Arrays;

class Array {
  int arr[] = null;

  public Array(int size) {
    arr = new int[size];
  }

  public void insert(int index, int value) {
    try {
      if (arr[index] == 0) {
        arr[index] = value;
      } else
        System.out.println("The cell is already occupied");
    } catch (Exception e) {
      System.out.println("Inavid index , index out of bounds of the array");
    }
  }

  public void getElementAtIndex(int index) {
    try {
      System.out.println("The element at index " + index + " is " + arr[index]);
    } catch (Exception e) {
      System.out.println("Inavid index , index out of bounds of the array or Array is empty");
    }
  }

  public void display() {
    try {
      Boolean isArrEmpty = getArrStatus();
      if (isArrEmpty) {
        throw (new Exception("Array is empty"));
      }
      System.out.println(Arrays.toString(arr));
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private Boolean getArrStatus() {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0)
        return false;
    }

    return true;
  }
}