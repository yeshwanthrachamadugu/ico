package package1;

public class Class4 {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setI(5);
		e.setS("Yeshwanth");
		System.out.println(e.getI());
		System.out.println(e.getS());
		

	}

}
  class Employee //Here Employee is bin 
  {
	private int i;
	private String s;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
}