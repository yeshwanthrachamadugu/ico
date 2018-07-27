package topics;


public class Streams {

	public static void main(String[] args) throws Exception {

		/*//In java, 3 streams are created for us automatically. All these streams are attached with console.
		System.out.println("Hi");
		System.err.println("Error");
		System.in.close();

		//Example
		int i=System.in.read();//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character  
		 */		
		/*//File Output Stream Examples
		FileOutputStream fos=new FileOutputStream("R:\\testout.txt");
		fos.write(65);//Output: A
		String S= "Hi Yeshwanth";
		byte b[]=S.getBytes();//converting string into byte array    
		fos.write(b);//Hi Yeshwanth
		fos.close();
		System.out.println("Success.....");*/


		//File InputStream Examples=====read single character

		/*FileInputStream fis=new FileInputStream("R:\\testout.txt");
		int i=fis.read();
		System.out.println((char)i);
		fis.close();
		*/
		//File InputStream Examples=====read all characters
		/*FileInputStream fis=new FileInputStream("R:\\testout.txt");
		int j=0; 
			while((j=fis.read())!=-1) {
		System.out.println((char)j);
			}
*/
		
		
	}

}
