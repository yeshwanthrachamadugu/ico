package topics;

interface abc {
	public abstract void  run();
	
}
/*interface abcde {
	public abstract void  run();
	
}
interface abcd extends abc,abcde {
	public abstract void  run();
	
	
}
 class xyz implements abcd{
	public void run() {
		System.out.println("jnsnss");
	}
	public void runs() {
		System.out.println("abcde");
	}
	
}
*/
class aaa implements abc{
	public void run() {
		System.out.println("jnsnss");
	}
	
	public void runs() {
		System.out.println("abcde");
	}
}


public class Interfaceexample {

	public static void main(String[] args) {
		/*abc i=()-> System.out.println("Hi");
		i.run();*/
		abc a=new aaa();
		a.run();
//		a.runs();
			
		
		

	}

}
