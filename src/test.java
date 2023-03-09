import java.util.Scanner;
import java.util.Random;

class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int InputNumber = -1;
		Random random = new Random();
		int[] arrs;

		// Enter InputNumber and press Enter
		System.out.println("Enter InputNumber");
		InputNumber = myObj.nextInt();
		arrs = new int[InputNumber];
		if (InputNumber <= 10000) {
			System.out.println("Input number should be greater than 10000.. try again");
			return;

		}

		double total = 0;
		int max1 = arrs[0];
		for (int i = 0; i < InputNumber; i++) {
			// System.out.println(random.nextInt(999)+1);
			arrs[i] = random.nextInt(999) + 1;
			total += arrs[i];
			if (arrs[i] > max1) {
				max1 = arrs[i];
			}
			if (i == arrs.length - 1) {
				System.out.print(arrs[i]);
			} else {
				System.out.print(arrs[i] + ",");
			}
		}
		System.out.println();
		System.out.println("*total is " + total);
		double avg = (total / arrs.length);
		System.out.println("*average is " + avg);
		System.out.println("*max1 is " + max1);
		int max2 = arrs[0];
		for (int i = 0; i < arrs.length; i++) {
			// System.out.println(random.nextInt(999)+1);

			if (arrs[i] > max2 && max1 > max2 && arrs[i] != max1) {
				max2 = arrs[i];
			}
		}
		System.out.println("*max2 is " + max2);

		int max3 = arrs[0];
		for (int i = 0; i < arrs.length; i++) {
			// System.out.println(random.nextInt(999)+1);

			if (arrs[i] > max3 && max1 > max3 && max2 > max3 && arrs[i] != max1 && arrs[i] != max2) {
				max3 = arrs[i];
			}
		}
		System.out.println("*max3 is " + max3);
	}

}
