package swingdemo;

import java.io.*;

public class byteclass {
public static void main(String args[]) {
	
	String input="V:\\JAVA\\swingdemo\\src\\swingdemo\\input.txt";
	String output="V:\\JAVA\\swingdemo\\src\\swingdemo\\output.txt";
	FileInputStream in=null;
	FileOutputStream out= null;
	
	try {
		in= new FileInputStream(input);
		out= new FileOutputStream(output);
		
		int bytes;
		while((bytes=in.read()) !=-1) {
			out.write(bytes);
		}
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
