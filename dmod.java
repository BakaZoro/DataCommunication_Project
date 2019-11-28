import java.util.*;
import java.io.*;
public class dmod{
	public static man(){
		String s;
		double d,a=0,b=0,x;
		File f=null;
		Scanner sc=null;
		int c=0;
		String s1="";
		ArrayList<Double> al=new ArrayList<>();
		try{
			f=new File("output3.txt");
			sc=new Scanner(f);
			while(sc.hasNext()){
				s=sc.next();
				d=Double.parseDouble(s);
				if(c==0){
					a=d;
					al.add(d);
				}
				else if(c==1){
					b=d;
				}
				else{
					if(d==0){
						x=a-b;
						a=x;
						al.add(x);
					}
					else if(d==1){


						x=a+b;
						a=x;
						al.add(x);
					}
				}
				c++;
		}
		}


		catch(FileNotFoundException e){
			System.out.println(e);
		}

		File fw=null;
		FileWriter wr=null;
		try{
		 fw=new File("Out.txt");
		 wr=new FileWriter(fw);
		String str=null;
		for(int i=0;i<al.size();i++){
			x=al.get(i);
			s1=Double.toString(x);
			wr.write(s1+"\n");
		}


		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try{
				wr.close();
			}
			catch(Exception e){
				System.out.println();
			}
		}
		

	}
}




