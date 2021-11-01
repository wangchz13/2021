import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("请输入三个数字和一个品牌名，空格隔开：");
		Scanner scanner = new Scanner(System.in);
		int memsize = scanner.nextInt();
		int stosize = scanner.nextInt();
		int scrsize = scanner.nextInt();
		String brand = scanner.next();
		Mobile mobile = new Mobile(memsize, stosize, scrsize, brand);
		mobile.displayField();
		scanner.close();
	}

}

interface Device {
	void displayField();
}

abstract class Computer implements Device {

	public Computer() {
	}

	@Override
	public void displayField() {

	}

}

class Mobile extends Computer {

	public Mobile() {
	}

	public Mobile(int memorySize, int storageSize, int screenSize, String brand) {
		super();
		this.memorySize = memorySize;
		this.storageSize = storageSize;
		this.screenSize = screenSize;
		this.brand = brand;
	}

	@Override
	public void displayField() {
		super.displayField();
		System.out.println("memorySize: " + memorySize + "GB");
		System.out.println("storageSize: " + storageSize + "GB");
		System.out.println("screenSize: " + screenSize + "寸");
		System.out.println("brand: " + brand);
	}

	protected int memorySize;
	protected int storageSize;
	protected int screenSize;
	protected String brand;
}