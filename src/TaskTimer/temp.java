package TaskTimer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class temp {
	public static String readFileToString(String filename){
		InputStream in = null;
		String data = "";
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			while (true) {
				c = reader.read();
				if (c < 0) break;
				data += (char) c;
			}
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		if (in != null) try{
			in.close();
		}catch (IOException ioe) {/*ignore*/};
		
		return data;	
	}
	
	public static String readFileToStringBuilder(String filename){
		InputStream in = null;
		StringBuilder data = new StringBuilder();
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			
			int c;
			while (true) {
				c = reader.read();
				if (c < 0) break;
				data = data.append((char) c);
			}
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		if (in != null) try{
			in.close();
		}catch (IOException ioe) {/*ignore*/};
		
		return data.toString();
	}
	
	//without scanner.
		public static String readFileBufferedReader(String filename){
			BufferedReader in = null;
		//create a string for the data to read
			String data = "";
			String line;
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
			
			return data;
		}
	
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		StopWatch sw2 = new StopWatch();
		StopWatch sw3 = new StopWatch();

		sw.start();
		String alice = readFileToString("Alice-In-Wonderland.txt");
		sw2.start();
		String alice2 = readFileToStringBuilder("Alice-In-Wonderland.txt");
		sw3.start();
		String alice3 = readFileBufferedReader("Alice-In-Wonderland.txt");

		System.out.println("Reading Alice-In-Wonderland.txt using FileReader, append to String");
		
		System.out.printf("Read %d chars in %.6f sec\n",alice.length(),sw.getElapsed());
		
		System.out.println("Reading Alice-In-Wonderland.txt using FileReader, append to StringBuilder");
		
		System.out.printf("Read %d chars in %.6f sec\n",alice2.length(),sw2.getElapsed());
		
		System.out.println("Reading Alice-In-Wonderland.txt using BufferedReader, append lines to String");

		System.out.printf("Read %d chars in %.6f sec\n",alice3.length(),sw3.getElapsed());
	}
}
