import java.util.Scanner;

/*
 * 二维数组最大子数组
 * 设二维数组行最小值为m，列最小值为n
 * 则最大公共子数组最大为m*n,最小为0*0 即没有公共元素
 * 
 */

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("输入两组数据，每组数据由数组行数、列数、数组元素构成");

		// 输入第一个数组
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int[][] A = new int[x1][y1];
		for (int i = 0; i < x1; i++) {
			for (int j = 0; j < y1; j++) {
				A[i][j] = scanner.nextInt();
			}
		}

		// 输入第二个数组
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int[][] B = new int[x2][y2];
		for (int i = 0; i < x2; i++) {
			for (int j = 0; j < y2; j++) {
				B[i][j] = scanner.nextInt();
			}
		}

		int m = Math.min(x1, x2);
		int n = Math.min(y1, y2);

		/*
		 * 暴力求解法 将子数组由m*n一直降到1*1 遍历两个数组中的子数组，得到的第一个相同的子数组即为最大子数组
		 */
		for (int x = m; x != 1; x--) {
			for (int y = n; y != 1; y--) {
				// 代码复杂度过高，
			}
		}

		scanner.close();
	}

}
