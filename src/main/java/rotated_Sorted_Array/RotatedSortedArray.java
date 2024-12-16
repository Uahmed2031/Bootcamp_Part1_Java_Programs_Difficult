package rotated_Sorted_Array;

public class RotatedSortedArray {

	public static void main(String[] args) {

		int[] S = { 9, 7, 5, 3, 2, 6, 8 };
		System.out.println(rotatedSortedArray(S, 1));
	}

	public static int rotatedSortedArray(int[] a, int target) {
		int L = 0, H = a.length - 1, M = 0;
		while (L <= H) {
			M = (L + H) / 2;
			if (target == a[M]) {
				return M;
			}

			else if (a[L] <= a[M]) {
				if (target >= a[L] && target < a[M]) {
					H = M - 1;
				} else {
					L = M + 1;
				}
			} else {
				if (target > a[M] && target <= a[H]) {
					L = M + 1;
				} else {
					H = M - 1;
				}
			}

		}
		return -1;
	}

}
