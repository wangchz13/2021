import java.util.Scanner;

/*
 * ��ά�������������
 * ���ά��������СֵΪm������СֵΪn
 * ����󹫹����������Ϊm*n,��СΪ0*0 ��û�й���Ԫ��
 * 
 */

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�����������ݣ�ÿ����������������������������Ԫ�ع���");

		// �����һ������
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int[][] A = new int[x1][y1];
		for (int i = 0; i < x1; i++) {
			for (int j = 0; j < y1; j++) {
				A[i][j] = scanner.nextInt();
			}
		}

		// ����ڶ�������
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
		 * ������ⷨ ����������m*nһֱ����1*1 �������������е������飬�õ��ĵ�һ����ͬ�������鼴Ϊ���������
		 */
		for (int x = m; x != 1; x--) {
			for (int y = n; y != 1; y--) {
				// ���븴�Ӷȹ��ߣ�
			}
		}

		scanner.close();
	}

}
