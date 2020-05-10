package swingdemo;

import java.io.*;

public class charclass {

	public static void main(String[] args) 
	{
		String input="V:\\JAVA\\swingdemo\\src\\swingdemo\\input1.txt";
		String output="V:\\JAVA\\swingdemo\\src\\swingdemo\\output1.txt";
		FileReader in = null;
		FileOutputStream out = null;
		
		try
		{
			in = new FileReader(input);
        	out = new FileOutputStream(output); 
			
			int temp;
			while( (temp = in.read())!= -1 )
				out.write( (byte)temp );
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if(in !=null)
			
				 in.close();
			if(out != null)
				out.close();
			}
			catch(IOException ex){
			ex.printStackTrace();
			}
			
		}
	
}
}
