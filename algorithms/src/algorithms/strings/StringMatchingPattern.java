package algorithms.strings;

/*
 * https://www.youtube.com/watch?v=GTJr8OvyEVQ
 */
public class StringMatchingPattern {

	public static void main(String[] args) {
		String source = "abcabyadaaaa";
		String target = "abcaby";

		// 2 stages - Prefex matching table
		// algorithm

		// stage- 1
		int[] matrix = buildPrefixMatchingMatrix(target);
		int i = 0, j = 0;
		while (i < source.length()) {
			if (source.charAt(i) == target.charAt(j)) {
				i++;
				j++;
			} else {

				if (j == 0)
					i++;
				else {
					j = matrix[j - 1];
				}
			}
			if (j == target.length()) {
				System.out.println("Found substring index at " + (i - j));
				break;
			}
		}
	}

	private static int[] buildPrefixMatchingMatrix(String target) {
		int matrix[] = new int[target.length()];
		int i = 1, j = 0;
		matrix[j] = 0; // first element always got 0 prefix
		int k = 1; // matrix index
		while (i < target.length()) {

			if (target.charAt(i) == target.charAt(j)) {
				matrix[k] = j + 1;
				j++;
				i++;
			} else {
				i++;
				if (j > 0) {
					j = matrix[j - 1];
				} else {
					j = 0;
					matrix[k] = j;
					k++;
					continue;
				}
			}
			k++;
		}
		return matrix;
	}
}
