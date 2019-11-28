import java.io.*;
import java.lang.*;
import java.util.*;
public class PcmDecoder
{
	public void man()
	{
		File f=null;
		Scanner sc=null;
		File filewrite=null;
		FileWriter wr=null;
		String arr;
		int j;
		char ch1,ch2,ch3;
		int i,k=0;
		float a;
		try
		{
			f=new File("encoded.txt");
			sc=new Scanner(f);
			//System.out.println("asd");
			filewrite=new File("output1.txt");
			filewrite.createNewFile();
			wr=new FileWriter(filewrite,false);
			System.out.println("FIle written");
			float A_max=sc.nextFloat();
			sc.nextLine();
			float A_min=sc.nextFloat();
			float d=(A_max-A_min)/32;
			//wr.write(A+"\n");
			sc.nextLine();
			//System.out.println("asd");
			while(sc.hasNextLine())
			{
				arr=sc.nextLine();
				j=0;
				int temp,dec_value=0,base=1;
				for(i=4;i>=0;i--)
				{        		
					temp = arr.charAt(i)-48;
					//wr.write(temp+"\n");
					dec_value += temp*base;
					base = base*2;
				}
				//wr.write(dec_value+"\n");
				//wr.write(dec_value+"\n");
				a=((d*(dec_value+1))+A_min);
				//if(k==1)
				System.out.println("zx");
				wr.write(a+"\n");
				k=1;
//				sc.nextLine();

			}
			//System.out.println("zxc");
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("e.getStackTrace()");
		}
		catch(IOException e)
		{
			System.out.println("e.getStackTrace()");
		}
		finally
		{
			try
			{
			//	sc.close();
				wr.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}
