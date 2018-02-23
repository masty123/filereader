package TaskTimer;

import java.util.Scanner;

public class StopWatch {
	Scanner in = new Scanner(System.in);
	/**variables**/
	private boolean Running = false ;
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private double elapsedTime;

	
	/**
	 * start the time.
	 */
	void start(){
		if(!Running) 
		Running = true;
		startTime = System.nanoTime();
	}
	/**
	 * stop the time. set the elapsedTime.
	 */
	void stop(){
		if(Running) 
		Running = false;
		stopTime = System.nanoTime();
		elapsedTime = (stopTime - startTime);
	}	
	/**
	 * check whether the timer is running or not .
	 * @return boolean type of the status.
	 *         false : not running.
	 *         true  : running
	 */
	boolean isRunning(){
		return Running;
	}
	/**
	 * get the elapsed time
	 * @return elapsed time
	 */
	double getElapsed(){
		if (Running) return (System.nanoTime()-startTime)*NANOSECONDS;
		return elapsedTime*NANOSECONDS;	
	}
}
