package opps;
class Heart{
	private float weight;
	private int bpm;
	public Heart(float weight,int bpm) {
		this.weight=weight;
		this.bpm=bpm;
	}
	public float getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
}
class Brain{
	private String color;
	private float weight;
	public Brain(String color,float weight) {
		this.color=color;
		this.weight=weight;
	}
	public String getColor() {
		return color;
	}
	public float getWeight() {
		return weight;
	}
}
class Bike{
	private String name;
	private float mailaze;
	public Bike(String name,float mailaze) {
		this.name=name;
		this.mailaze=mailaze;
	}
	public String getName() {
		return name;
	}
	public float getMailaze() {
		return mailaze;
	}
}
class Book{
	private String bookName;
	private String author;
	public Book(String bookName,String author) {
		this.bookName=bookName;
		this.author=author;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	
}
class Student1{
	Heart h=new Heart(250f,72);
	Brain br=new Brain("gray",1.4f);
	void hasA(Bike b) {
		System.out.println(b.getMailaze());
		System.out.println(b.getName());
	}
	void hasA2(Book bk) {
		System.out.println(bk.getBookName());
		System.out.println(bk.getAuthor());
		
	}
}

public class AggregationAndComposition2 {

	public static void main(String[] args) {
		Student1 s=new Student1();
		Bike b=new Bike("pulsar",35.5f);
		Book bk=new Book("java","James Gosling");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.br.getColor());
		System.out.println(s.br.getWeight());
		s.hasA(b);
		s.hasA2(bk);
	}

}
