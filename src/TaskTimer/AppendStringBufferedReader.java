package TaskTimer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppendStringBufferedReader implements Runnable {
	BufferedReader in = null;
	//create a string for the data to read
	String data = "";
	String line;
	String filename;
	
	public AppendStringBufferedReader(String filename){
		this.filename = filename;
	}
	
	
	@Override
	public void run() {
		
			// open the file.
	try {
		in = new BufferedReader(new FileReader(filename));
		while(( line = in.readLine()) != null){
			data = data + line + "\n";
			}
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
			
		if (in != null)
		try {
				in.close();
		 } catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString(){
		return String.format("Read %d chars",data.length());
	}
	

}
