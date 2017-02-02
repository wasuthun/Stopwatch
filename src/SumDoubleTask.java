
/**

 * Task that use for adds Double wrapper to array.

 * 

 * @author Wasuthun wanaphongthipakorn

 *

 */

public class SumDoubleTask implements Runnable {

	static final int Size_of_array = 500000;

	private int amount;

	private Double[] values;



	/**

	 * Start SumDoubleTask with the amount.

	 * @param amount

	 */


	public SumDoubleTask(int amount) {

		this.amount = amount;

		// create array of values to add, before we start the timer

		values = new Double[Size_of_array];

		for (int i = 0; i < Size_of_array; i++)

			values[i] = new Double(i + 1);

	}



	/**

	 * Add numbers from 1 to Size_of_array by using Double wrapper class.Assuming that the amount of

	 * time is more than the Size_of_array, reset the adding to 1 when it arrive at

	 * Size_of_array.

	 */

	@Override

	public void run() {

		Double sum = new Double(0.0);

		// count = loop counter, i = array index

		for (int count = 0, i = 0; count < amount; count++, i++) {

			if (i >= values.length)

				i = 0;

			sum = sum + values[i];

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

		return String.format("Sum array of Double objects with count=%,d\n", amount);

	}



}