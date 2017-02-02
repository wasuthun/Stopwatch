
/**

 * TaskTimer uses for measure the passing time in seconds of definite task.

 * @author Wasuthun wanaphongthipakorn

 *

 */

public class TaskTimer {

	private Stopwatch time;



	/**

	 * Initialize the TaskTimer.

	 */

	public TaskTimer() {

		this.time = new Stopwatch();

	}



	/**

	 * Run the task and measure the passing time. Later finished the task, it will print the passing time.

	 * @param task

	 */

	public void measureAndPrint(Runnable task) {

		System.out.print(task.toString());

		time.start();

		task.run();

		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

}
