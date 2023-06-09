package ClassProblems;

public class IsMinHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < (a.length / 2) - 1; i++) {
			if (a[i] != 0 && a[2 * i + 1] != 0 && a[2 * i + 2] != 0) {
				boolean left = false;
				boolean right = false;

				if (a[i] < a[2 * i + 1]) {
					left = true;
				}
				if (a[i] < a[2 * i + 2]) {
					right = true;
				}
				if (i == (a.length / 2) - 2 && left == true && right == true) {
					System.out.println("Min heap");
					return;
				}
				if (left == true && right == true) {
					continue;
				} else {
					System.out.println("Not a min heap");
					return;
				}
			} else {
				System.out.println("Not a min heap");
				return;
			}
		}
	}

}
