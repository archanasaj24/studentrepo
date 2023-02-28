package Assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=null;
		try
		{
		fis=new FileInputStream("E:\\Demo\\sample.txt");
         System.out.println(fis.available());
         int x=fis.read();
         fis.available();
         byte[] b=new byte[10];
         fis
         .read(b);
         for(byte i:b)
         {
        	 System.out.println(i);
         }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			fis.close();
		}
	}

}
