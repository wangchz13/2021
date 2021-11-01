import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pay {

	public Pay(float basePay, float postPay, float meritPay) {
		super();
		this.basePay = basePay;
		this.postPay = postPay;
		this.meritPay = meritPay;
	}

	public float allPay() {
		return basePay + postPay + meritPay;
	}

	public int kind() {
		int ans = 0;
		if (basePay != 0)
			ans++;
		if (postPay != 0)
			ans++;
		if (meritPay != 0)
			ans++;
		return ans;
	}

	public float basePay;
	public float postPay;
	public float meritPay;
}

public class Exercise5 {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 暂时不考虑文件格式异常的情况
	public static void readFile() throws IOException {

		Map<Integer, Pay> payMap = new HashMap<>();
		
		try (Scanner sc = new Scanner(new FileReader("a.txt"))) {
			while (sc.hasNextLine()) { // 按行读取字符串
				String line = sc.nextLine();
				var temp = line.split(" ");
				int id = Integer.parseInt(temp[0]);
				float basepay = temp.length > 1 ? Float.parseFloat(temp[1]) : 0;

				if (!payMap.containsKey(id)) {
					Pay pay = new Pay(basepay, 0, 0);
					payMap.put(id, pay);
				} else {
					payMap.get(id).basePay = basepay;
				}
			}
		}

		try (Scanner sc = new Scanner(new FileReader("b.txt"))) {
			while (sc.hasNextLine()) { // 按行读取字符串
				String line = sc.nextLine();
				var temp = line.split(" ");
				int id = Integer.parseInt(temp[0]);
				float postpay = temp.length > 1 ? Float.parseFloat(temp[1]) : 0;

				if (!payMap.containsKey(id)) {
					Pay pay = new Pay(0, postpay, 0);
					payMap.put(id, pay);
				} else {
					payMap.get(id).postPay = postpay;
				}
			}
		}

		try (Scanner sc = new Scanner(new FileReader("c.txt"))) {
			while (sc.hasNextLine()) { // 按行读取字符串
				String line = sc.nextLine();
				var temp = line.split(" ");
				int id = Integer.parseInt(temp[0]);
				float merit = temp.length > 1 ? Float.parseFloat(temp[1]) : 0;

				if (!payMap.containsKey(id)) {
					Pay pay = new Pay(0, 0, merit);
					payMap.put(id, pay);
				} else {
					payMap.get(id).meritPay = merit;
				}
			}
		}

		FileWriter writer1 = new FileWriter("d.txt");
		FileWriter writer2 = new FileWriter("e.txt");

		for (Map.Entry<Integer, Pay> entry : payMap.entrySet()) {
			int id = entry.getKey();
			Pay pay = entry.getValue();
			if(pay.kind()==3) {
				writer1.write(""+id+" "+pay.allPay()+" "+pay.kind()+"\n");
			}else if(pay.kind() == 2) {
				writer2.write(""+id+" "+pay.allPay()+" "+pay.kind()+"\n");
			}
		}
		writer1.close();
		writer2.close();
	}
}
