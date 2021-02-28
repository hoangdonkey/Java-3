import java.util.Scanner;
public class ReadPrintArray {
	public static void main(String[] args) {
		int numItems;
		int[] items;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of items: ");
		numItems = Integer.parseInt(input.nextLine());

		items = new int[numItems];

		if (items.length > 0) {
			System.out.println("Enter the value of all items (separated by spaces): ");
			for (int i=0; i < items.length; ++i) {
				if (i == 0) {
					System.out.println(items[0]);
				}
				else {
					System.out.println(", " + items[i]);
				}
			}
			System.out.println("]");
			// input.Close();
		}
	}
}