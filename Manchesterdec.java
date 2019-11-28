import java.io.*;
import java.lang.*;
import java.util.*;
class Manchesterdec
{
	public void man()
	{
		File f=null;
		Scanner sc=null;
		File filewrite=null;
		FileWriter wr=null;
		String arr;
		int j;
		char ch;
		int i;
		try
		{
			f=new File("pencoded.txt");
			sc=new Scanner(f);
			filewrite=new File("encoded.txt");
			filewrite.createNewFile();
			wr=new FileWriter(filewrite,false);
			int c=0;
			arr=sc.nextLine();
			wr.write(arr+"\n");
			arr=sc.nextLine();
			wr.write(arr+"\n");
			while(sc.hasNextLine())
			{	c++;
				arr=sc.nextLine();
				j=0;
				for(i=0;i<arr.length();i++)
				{
					ch=arr.charAt(i);
					if((int)ch-48==1)
						wr.write("1");
					else 
						wr.write("0");
					i=i+2;
				}
				if(c%5==0)
					wr.write("\n");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error");
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		finally
		{
			try
			{
				sc.close();
				wr.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}



