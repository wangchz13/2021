import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO Auto-generated method stub
		Complex c1 = new Complex();
		Complex c2 = new Complex();

		System.out.println("请输入4个数字: ");
		c1.setReal(scanner.nextDouble());
		c1.setImg(scanner.nextDouble());
		c2.setReal(scanner.nextDouble());
		c2.setImg(scanner.nextDouble());

		Complex c3 = Complex.add(c1, c2);
		System.out.println("c3:");
		c3.print();
		System.out.println("" + "c3的模为: " + (float) c3.mod());

		scanner.close();
	}
}

class Complex {

	public Complex() {
		this.real = 0;
		this.img = 0;
	}

	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
	}

	public static Complex add(Complex a, Complex b) {
		double newReal = a.real + b.real;
		double newImg = a.img + b.img;
		return new Complex(newReal, newImg);
	}

	public double mod() {
		return Math.sqrt(this.real * this.real + this.img * this.img);
	}

	public void print() {
		System.out.println("" + this.real + "+" + this.img + "i");
	}

	double real;
	double img;
}
