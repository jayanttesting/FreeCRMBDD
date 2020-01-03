import org.apache.bcel.generic.RETURN;

public class Array {

	static int equilibrium(int arr[], int n) {
		int leftsum, rightsum;

		for (int i = 0; i < n; ++i) {
			leftsum = 0;
			for (int j = 0; j < i; j++)
				leftsum = leftsum + arr[j];

			rightsum = 0;
			for (int j = i + 1; j < n; j++)
				rightsum = rightsum + arr[j];

			if (leftsum == rightsum)
				return i;

		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
		int arr_size = arr.length;
		System.out.println("Equilibrium Index:");
		System.out.println(equilibrium(arr, arr_size));

	}

}
