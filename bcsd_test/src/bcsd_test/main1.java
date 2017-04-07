package bcsd_test;

public class main1 {
	// 124 이하의 수에서 뒤에 연속되는 0의 수를 구하는 메서드
	public static void main(String[] args) {
		int num = 100;
		if(num <= 0 && num >= 125)
			System.out.println("-1");
		System.out.println(num/25 + num/5);
	}
}
