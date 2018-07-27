package propertiesFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Propertiesfile 
{
	static File f=new File("configuration.txt");
	static Properties p=new Properties();

	public static void main(String[] args) throws Exception 
	{
		propRetreive();
	}

	public static void propStorage() throws Exception 
	{
		FileOutputStream fos=new FileOutputStream(f);
		p.setProperty("URL", "https://qaapp.moolya.global");
		p.setProperty("Username", "Yeshwanth.rachamadugu@raksan.in");
		p.setProperty("Password", "MoolyaAdmin@123");
		p.store(fos, null);
	}

	public static void propRetreive() throws Exception 
	{
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
		// To print Single property
		System.out.println(p.getProperty("Username"));
		// To get all Properties
		p.list(System.out);
	}

}


