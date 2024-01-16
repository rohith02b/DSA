import java.util.Arrays;

class Array {
  int[] arr = null;

  public Array(int size) {
    arr = new int[size];
      Arrays.fill(arr, Integer.MIN_VALUE);
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
      if(arr[index] == Integer.MIN_VALUE)
      {
        throw new Exception("");
      }
      System.out.println("The element at index " + index + " is " + arr[index]);
    } catch (Exception e) {
        System.out.println("Invalid index, index out of bounds of the array");
    } 
  }

  public int findElement(int element)
  {
    int flag=0;
    try{
      for (int i=0;i<arr.length;i++)
      {
        if(arr[i] == element) {
          flag=1;
          return i;
        }
      }

      if(flag == 0)
        throw new Exception("Element not found");

      return -1;
    }
    catch(Exception e) {
      return -1;
    }
  }

  public void deleteElementViaIndex(int index){
    try {
      if(arr[index] == Integer.MIN_VALUE) {
        System.out.println("Invalid index");
        return;
      }
      System.out.print("Removed element : " + arr[index]);
      arr[index] = Integer.MIN_VALUE;
    }
    catch(Exception e) {
      System.out.println("Invalid index");
    }
  }

  public void deleteElementViaValue(int value) {
      int index = findElement(value);
      if(index == -1) {
        System.out.println("Element not found");
        return;
      }
      arr[index] = Integer.MIN_VALUE;
  }

  public void display() {
    try {
      Boolean isArrEmpty = getArrStatus();
      if (isArrEmpty) {
        throw new Exception("Array is empty");
      }
      System.out.print("[ ");
        for (int j : arr) {
            if (j != Integer.MIN_VALUE) {
                System.out.print(j + " ");
            }
        }
      System.out.print("]");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  private Boolean getArrStatus() {
      for (int j : arr) {
          if (j != Integer.MIN_VALUE) {
              return false;
          }
      }
    return true;
  }
}
