
public class Main {
	public static void main(String[] args) {
		TwoDArray a = new TwoDArray(3,3);	
		a.deleteAtIndex(0,0);	
		a.insertAtIndex(0,0,1);
		a.insertAtIndex(0,1,2);
		a.insertAtIndex(0,2,3);
		a.insertAtIndex(1,0,4);
		a.insertAtIndex(1,1,5);
		a.insertAtIndex(1,4,6);
		a.display();
		System.out.println(a.search(3));
		
		a.deleteAtIndex(0,0);	
		a.deleteAtIndex(1,2);	
	}
}
