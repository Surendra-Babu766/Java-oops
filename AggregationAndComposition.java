package opps;
class Charger{
	private String brand;
	private float voltage;
	public Charger(String brand,float voltage) {
		this.brand=brand;
		this.voltage=voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}
class Os{
	private String name;
	private int size;
	public Os(String name,int size) {
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
class Mobile{
	Os o=new Os("Android",2);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}

public class AggregationAndComposition {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger("Samsung",12.0f);
		//mobile is with me
		System.out.println(m.o.getName());
		System.out.println(m.o.getSize());
		m.hasA(c);
		//mobile is lost
		m=null;
		//System.out.println(m.o.getName());
		//System.out.println(m.o.getSize());
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
		
	}

}
