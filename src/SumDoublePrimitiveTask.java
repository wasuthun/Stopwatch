
/**

 * Task that use for adds primitive double to array.

 * 

 * @author Wasuthun wanaphongthipakorn

 *

 */

public class SumDoublePrimitiveTask implements Runnable {

	static final int Size_of_array = 500000;

	private int amount;

	private double[] values;



	/**

	 * Start SumDoublePrimitiveTask with the amount.

	 * @param amount

	 */

	public SumDoublePrimitiveTask(int amount) {

		this.amount = amount;

		// create array of values to add before we start the timer

		values = new double[Size_of_array];

		for (int j = 0; j < Size_of_array; j++)

			values[j] = j + 1;

	}



	/**

	 * Add numbers from 1 to Size_of_array by using primitive double.Assuming that the amount of

	 * time is more than the Size_of_array, reset the adding to 1 when it arrive at

	 * Size_of_array.

	 */

	@Override

	public void run() {

		double sum = 0.0;

		// count = loop counter, j = array index value

		for (int count = 0, j = 0; count < amount; count++, j++) {

			if (j >= values.length)

				j = 0; 



			sum = sum + values[j];

		}

		System.out.println("sum = " + sum);

	}



	/**

	 * Return the Task's detail.

	 * 

	 * @return the detail of the task

	 */

	@Override

	public String toString() {

		return String.format("Sum array of double primitives with count=%,d\n", amount);



	}



}