package package1;

public class Class7 {

	public static void main(String[] args) {
		A obj=new A(6);
		obj.show();
		
		

	}

}
class A{
	
	private int i;//i is Instance variable
	
	public A(int i) {//a is Local variable
		this.i=i; //current instance
		
		
	}
	public void show() {
		System.out.println(i);
		
	}
	
}