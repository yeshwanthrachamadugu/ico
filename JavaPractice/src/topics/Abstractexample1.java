package topics;

public class Abstractexample1 {

	public static void main(String[] args) {
		Phone ph=new SureshPhone();
		
		ph.call();
		ph.speak();
		ph.dance();
		}
}
abstract class Phone{
	
	public void call() {
		
		System.out.println("calling....");
		
	}
	
	public abstract void dance();
	public abstract void speak();
}

abstract class RameshPhone extends Phone{
	public void dance() {
		System.out.println("dancing....");
		}
}

class SureshPhone extends RameshPhone{
	
	public void speak() {
		System.out.println("speaking....");
		}
	
}




