package bcsd_test;

import java.util.Scanner;

public class main1 {
	// 124 ������ ������ �ڿ� ���ӵǴ� 0�� ���� ���ϴ� �޼���
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		if(num <= 0 && num >= 125)
			sum = -1;
		sum += 	num / 125+num/25 + num/5;
		System.out.println(sum);
	}
}
