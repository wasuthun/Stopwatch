
/**

 *  Stopwatch class use measures passing time between a starting and stopping times, or to this time.


 * @author Wasuthun Wanaphongthipakorn

 * @version 1.0

 */

public class Stopwatch {


	/** the time that stopwatch was started. */

	private long start;
	
	/** the time that the stopwatch was stopped. */

	private long stop;

	/** constant for change nanoseconds to seconds. */

	private static final double NANOSEC = 1.0E-9;

	

	/** this boolean use to pinpoints this Stopwath is running or not */

	private boolean running;

	/**

	 * Check stopwatch is running or not.

	 * @return the status of stopwatch. true if it is running and false if it not running.

	 */

	public boolean isRunning() {

		return running;

	}
	
	/**

	 * Setting  stopwatch to initial and start when stopwatch is not running.
	 
	 *  When  stopwatch is already running then start does not do anything.

	 */

	public void start() {

		if (!isRunning()) {

			this.start = System.nanoTime();

			running = true;

		}

	}

	/**

	 * Stop the stopwatch. weather the stopwatch is already stopped, stop does

	 * not do anything.

	 */

	public void stop() {

		if (isRunning()) {

			this.stop = System.nanoTime();

			running = false;

		}

	}

	/**

	 * Return the passing time of the stopwatch. whether the stopwatch is running,

	 * then return the passing time since start to the current time. Whether

	 * stopwatch is stopped,return the time between the start and stop times.

	 * @return the passing time 

	 */

	public double getElapsed() {

		if (isRunning()) {

			return (System.nanoTime() - start) * NANOSEC;

		} else {

			return (stop - start) * NANOSEC;

		}

	}

}