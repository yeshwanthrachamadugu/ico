package fileHandling;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling 
{
	static  File f= new File("newest.txt");
	
	public static void main(String[] args) throws Exception
	{
		dataPassing();
		dataRetreving();
	}
	
	public static void dataPassing() throws Exception 
	{
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeUTF("Hi Hello");
		dos.close();
	}

	public static void dataRetreving() throws Exception 
	{
        FileInputStream fis = new  FileInputStream(f);
		DataInputStream dis= new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
		dis.close();
	}
}
