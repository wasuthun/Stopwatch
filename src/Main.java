
import java.math.BigDecimal;



/**

 * Main class, operate some tasks linking strings and doubles, to measure speed by using different data types.

 * @author Wasuthun Wanaphongthipakorn

 */

public class Main {



	/**

	 * Run the tasks.

	 */

	public static void main(String[] args) {

		// Runnable[] tasks = { new AppendStringTask(50000), new

		// AppendStringTask(100000),

		// new AppendStringBuilderTask(100000), new

		// SumDoublePrimitiveTask(1000000000),

		// new SumDoubleTask(1000000000), new SumBigDecimalTask(1000000000) };

		// TaskTimer taskTimer = new TaskTimer();

		// for (Runnable task : tasks) {

		// taskTimer.runTask(task);

		// }



		TaskTimer taskTimer = new TaskTimer();

		taskTimer.measureAndPrint(new AppendStringTask(50000));

		taskTimer.measureAndPrint(new AppendStringTask(100000));

		taskTimer.measureAndPrint(new AppendStringTask(200000));



		taskTimer.measureAndPrint(new AppendStringBuilderTask(50000));

		taskTimer.measureAndPrint(new AppendStringBuilderTask(100000));

		taskTimer.measureAndPrint(new AppendStringBuilderTask(200000));



		taskTimer.measureAndPrint(new SumDoublePrimitiveTask(500000000));

		taskTimer.measureAndPrint(new SumDoublePrimitiveTask(1000000000));

		taskTimer.measureAndPrint(new SumDoublePrimitiveTask(2000000000));



		taskTimer.measureAndPrint(new SumDoubleTask(500000000));

		taskTimer.measureAndPrint(new SumDoubleTask(1000000000));

		taskTimer.measureAndPrint(new SumDoubleTask(2000000000));



		taskTimer.measureAndPrint(new SumBigDecimalTask(500000000));

		taskTimer.measureAndPrint(new SumBigDecimalTask(1000000000));

		taskTimer.measureAndPrint(new SumBigDecimalTask(2000000000));



	}

}
