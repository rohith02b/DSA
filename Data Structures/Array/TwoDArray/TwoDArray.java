import java.util.Arrays;

class TwoDArray {
	int arr[][] = null;
	int rows,cols;
	boolean isEmpty;

 	public TwoDArray(int rows,int cols) {
		arr = new int[rows][cols];
		this.rows = rows;
		this.cols = cols;
		this.isEmpty = true;
  		for(int i=0;i<rows;i++) {
   			for(int j=0;j<cols;j++) {
    				arr[i][j] = Integer.MIN_VALUE;
   			}
  		}
 	}

	public void insertAtIndex(int rowIndex,int colIndex,int value) { // O(1) time complexity 
		try {
			if(rowIndex >= rows || colIndex >= cols)
				throw new Exception("Invalid indices");
			
			if(arr[rowIndex][colIndex] == Integer.MIN_VALUE) {
				isEmpty = false;
				arr[rowIndex][colIndex] = value;
				System.out.println("Inserted value at  : " + rowIndex + " " + colIndex);	
			}
			else
				throw new Exception("Position occupied");

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public boolean search(int value) {  // O(rows * cols) time complexity 
		try {
			if(isEmpty)
				return false;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(arr[i][j] == value)
						return true;
				}	

			}

			return false;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public void deleteAtIndex (int row,int col) {
		try {
			if(isEmpty) {
				System.out.println("Array is empty");
				return;
			}

			if(arr[row][col] == Integer.MIN_VALUE) {
				System.out.println("Invalid index , cell is empty");
				return;
			}

			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Element deleted at the indices" + row + " " + col);

		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

	public void display()  { // O(rows * cols) time complexity
		try{
			if(isEmpty)
				throw new Exception("Array is empty");

			for(int i=0;i<rows;i++){ 
				for(int j=0;j<cols;j++) {
					if(arr[i][j] != Integer.MIN_VALUE)
						System.out.print(arr[i][j] + " ");
				}

				System.out.println();
			}
					
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	 
}
