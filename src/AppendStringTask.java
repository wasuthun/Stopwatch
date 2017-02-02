

/**

 Task that affix char to StringBuilder.

 * @author Wasuthun Wanaphongthipakorn

 */

public class AppendStringTask implements Runnable {

	private int size;

	private final char CHAR = 'a';



	/**

	 * Start the AppendStringTask by a specific size. The size is final length of the String.

	 * @param size

	 */

	public AppendStringTask(int size) {

		this.size = size;

	}



	//Add char 'a' to the String to it reaches final size and print the result length.

	@Override

	public void run() {

		String result = "";

		int k = 0;

		while (k++ < size) {

			result = result + CHAR;

		}

		System.out.println("final string length = " + result.length());

	}



	/**

	 * Return the Task's detail.

	 * 

	 * @return the detail of the task

	 */

	@Override

	public String toString() {

		return String.format("Append %,d chars to String\n", size);

	}

}