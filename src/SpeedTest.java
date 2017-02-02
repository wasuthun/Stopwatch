
import java.io.IOException;

import java.math.BigDecimal;



/**

 * Task file for Stopwatch.


 * This methods present some common tasks holding strings and doubles,

 * into parallel speed by using different data types.

 *

 * This class has a lot of copy code.

 * Each task method holds the same code to start stopwatch,

 * stop stopwatch, print passing time, and tell about task

 * (even though picture each task is different).

 * 

 * Your position is to split the code which is the same in method

 * from the code its different  , and revamp the code so you can reuse the task-timer code that it is the same.

 * When you well-done you will have 7 classes.

 * TaskTimer class (the recyclable code) that can show any task

 * 5 task classes that appliance Runnable. Each task has a toString that call the task.

 * Main class (application) to run the tasks by using TaskTimer.

 * You can identify the 5 task classes in the same source file as

 * Main class or paste them in divide files.

 * To identify multiple classes in one source file, only one class

 * is announced "public" and other classes neglect the "public".

 */

public class SpeedTest {

	// size of this array used in floating point tasks.

	// Don't make to avert hanging up the test with paging

	// or possible out of memory error.

	static final int Size_of_array = 500000;

	

	

	 // 1st task affix chars to string.

	 

	public static void testAppendToString(int count) {

		final char CHAR = 'a';

		System.out.printf("Append %,d chars to String\n", count);

		Stopwatch time = new Stopwatch();

		time.start();

		String result = ""; 

		int m = 0;

		while(m++ < count) {

			result = result + CHAR;

		}

		System.out.println("final string length = " + result.length());

		

		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

	

	

	  //2nd task affix chars to a StringBuilder

	 

	public static void testAppendToStringBuilder(int count ) {

		final char CHAR = 'a';

		System.out.printf("Append %,d chars to StringBuilder\n", count);

		Stopwatch time = new Stopwatch();



		time.start();

		StringBuilder builder = new StringBuilder(); 

		int m = 0;

		while(m++ < count) {

			builder = builder.append(CHAR);

		}

		// now create a String from the result, to be appropriate with task 1.

		String result = builder.toString();

		System.out.println("final string length = " + result.length());

		

		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

	

	

	 //3rd task add double primitives from an array.

	

	public static void testSumDoublePrimitive(int counter) {

		System.out.printf("Sum array of double primitives with count=%,d\n", counter);

		Stopwatch time = new Stopwatch();

		// create array of values to add before we start the time

		double[] values = new double[Size_of_array];

		for(int m=0; m<Size_of_array; m++) values[m] = m+1;

		

		time.start();

		double sum = 0.0;

		// count = loop counter, j = array index value

		for(int count=0, j=0; count<counter; count++, j++) {

			if (j >= values.length) j = 0;  // reuse the array when get to last value

			sum = sum + values[j];

		}

		System.out.println("sum = " + sum);

		

		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

	

	

	

	 //4th task add Double objects from an array.

	 

	public static void testSumDouble(int counter) {

		System.out.printf("Sum array of Double objects with count=%,d\n", counter);

		Stopwatch time = new Stopwatch();

		// create array of values for add, before we start the time

		Double[] values = new Double[Size_of_array];

		for(int i=0; i<Size_of_array; i++) values[i] = new Double(i+1);

		

		time.start();

		Double sum = new Double(0.0);

		// count = loop counter, j = array index

		for(int count=0, j=0; count<counter; count++, j++) {

			if (j >= values.length) j = 0;

			sum = sum + values[j];

		}

		System.out.println("sum = " + sum);



		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

	

	

	

	 // 5th add BigDecimal objects from an array.

	 

	public static void testSumBigDecimal(int counter) {

		System.out.printf("Sum array of BigDecimal with count=%,d\n", counter);

		Stopwatch time = new Stopwatch();

		// create array of values for add, before we start the time

		BigDecimal[] values = new BigDecimal[Size_of_array];

		for(int j=0; j<Size_of_array; j++) values[j] = new BigDecimal(j+1);

		

		time.start();

		BigDecimal sum = new BigDecimal(0.0);

		for(int count=0, j=0; count<counter; count++, j++) {

			if (j >= values.length) j = 0;

			sum = sum.add( values[j] );

		}

		System.out.println("sum = " + sum);

		

		time.stop();

		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());

	}

	

	

	 // Run  tasks.

	 

	public static void main(String[] args) throws IOException {



		SpeedTest.testAppendToString(50000);

		// same task but have a larger string size (affix more chars)

		SpeedTest.testAppendToString(100000);

		// do the same by using StringBuilder.

		

		SpeedTest.testAppendToStringBuilder(100000);

		

		// Use a large loop count for floating point tests in order to get definite times

		int counter = 1000000000; 

		

		SpeedTest.testSumDoublePrimitive(counter);

		SpeedTest.testSumDouble(counter);

		SpeedTest.testSumBigDecimal(counter);

	}

}