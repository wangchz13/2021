import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(Math.PI / 2);
		System.out.println("������ʵ��x:");
		double x = scanner.nextDouble();

		if (-Math.PI / 2 < x && x < Math.PI / 2) {
			double ans;
			ans = 1 + (5.0 / 21) * Math.pow(x, 3) + (59.0 / 240) * Math.pow(x, 6) + (261.0 / 1780) * Math.pow(x, 9);
			System.out.println(ans);
		} else {
			System.out.println("�������");
		}
		scanner.close();
	}

}
