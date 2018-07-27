package package1;


public class Class5 {

	public static void main(String[] args) {
		ABCDEFG obj=new ABCDEFG();
		obj.ABC(3);
		
	}

}
class AB
{
	int i=5;
	public AB() {
		System.out.println("super AB without parameters");
		
	}
	public AB(int i) {
		System.out.println("super AB with parameters");
		
	}
	public void ABC(int i) {
		System.out.println("sub ABC with parameters");
		
	}
	
	
}
class ABCDEFG extends AB
{
	int i=4;
	public ABCDEFG() {
		System.out.println("sub ABCDEFG without parameters");
		
	}
	public void ABC(int i) {
		super.ABC(i);
		System.out.println("sub ABCDEFG with parameters");
		
	}
	
	public void ab() {
		System.out.println(super.i);
		System.out.println(i);
	}
}