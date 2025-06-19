package opps;

class Library{
	static int totalBooks=0;
	static void addBook(){
		totalBooks++;
	}
	static void display()
	 {
		 System.out.println("the total number of books="+totalBooks);
	 }
	
}
public class String3 {
	
	public static void main(String[] args) {
		
		Library.addBook();
		Library.addBook();
		Library.addBook();
		Library.addBook();
		Library.display();
	}

}
