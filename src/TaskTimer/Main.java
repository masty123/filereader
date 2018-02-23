package TaskTimer;

public class Main {
	public static void main(String[]args){
		System.out.println("Reading Alice-In-Wonderland.txt using FileReader, append to String");
		TaskTimer.prompt(new AppendStringTask("Alice-In-Wonderland.txt"));
		System.out.println("Reading Alice-In-Wonderland.txt using FileReader, append to StringBuilder");
		TaskTimer.prompt(new AppendStringBuilder("Alice-In-Wonderland.txt"));
		System.out.println("Reading Alice-In-Wonderland.txt using BufferedReader, append lines to String");
		TaskTimer.prompt(new AppendStringBufferedReader("Alice-In-Wonderland.txt"));

	}
}
