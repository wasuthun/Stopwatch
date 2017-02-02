
/**

 Task that affix char to StringBuilder.

 * @author Wasuthun Wanaphongthipakorn

 */

public class AppendStringBuilderTask implements Runnable {

	private int size;

	private final char CHAR = 'a';


	 //Add char 'a' to the StringBuilder to it reaches final size and print the result length.

	 

	@Override

	public void run() {

		StringBuilder builder = new StringBuilder();

		int i = 0;

		while (i++ < size) {

			builder = builder.append(CHAR);

		}

		// now create a String from the result, to be cooperate with task 1.

		String result = builder.toString();

		System.out.println("final string length = " + result.length());

	}

	/**

	 * Start the AppendStringBuilderTask by a specific size. The size is final length of the String.

	 * @param size

	 */

	public AppendStringBuilderTask(int size) {

		this.size = size;

	}

	/**

	 * Return the Task's detail.

	 * 

	 * @return the detail of the task

	 */

	@Override

	public String toString() {

		return String.format("Append %,d chars to StringBuilder\n", size);



	}



}