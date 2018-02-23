package TaskTimer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable {
	InputStream in = null;
	String data = "";
	String filename ; 
	
	public AppendStringTask(String filename){
		this.filename = filename;
	}
	@Override
	public void run() {
		
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
	}
	
	public String toString(){
		return String.format("Read %d chars",data.length());

	}
	
	
	

}
