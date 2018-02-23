package TaskTimer;


public class TaskTimer  {
	
	public static void prompt(Runnable out){
		StopWatch timer = new StopWatch();
		timer.start();
		out.run();
		System.out.print(out.toString());
		timer.stop();
		System.out.printf(" in %.6f sec\n\n",timer.getElapsed());
	}
	
}
