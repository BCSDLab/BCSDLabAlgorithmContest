package bcsd_test;

import java.util.Scanner;

public class main1 {
	// 124 이하의 수에서 뒤에 연속되는 0의 수를 구하는 메서드
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		if(num <= 0 && num >= 125)
			sum = -1;
		sum +=num/1220703125+num/244140625+num/48828125+num/9765625+ num / 1953125+num/390625  + num/78125 + num / 15625 +num / 3125 + num / 125 + num / 625 + num/25 + num/5;
		System.out.println(sum);
	}
}
