package package1;


interface Abcd{
	
	void show();
}
/*class Abcde implements Abcd{
	public void show() {
		System.out.println("Hi");
		}
	}*/
	

public class Interfaces {

	public static void main(String[] args) {
		Abcd obj = ()-> System.out.println("Hi");
	    obj.show();

	}

}
