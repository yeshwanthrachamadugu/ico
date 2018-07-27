package topics;

public class Abstractexample2 {

	public static void main(String[] args) {
		Iphone obj=new Iphone();
		Samsungphone obj1= new Samsungphone();
		show(obj1);
		show(obj);
		}
	
	public static void show(Phone1 obj) {
		obj.showConfig();
	}
	
}
	abstract class Phone1{
		
		public abstract void showConfig();
	}


class Iphone extends Phone1{
	public void showConfig() {
		System.out.println("Iphone");
	}
}
class Samsungphone extends Phone1{
	public void showConfig() {
		System.out.println("Samsung");
	}
}