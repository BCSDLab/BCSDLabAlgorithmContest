#include <stdio.h>
#pragma warning(disable:4996)

int n;
int num1;
int num2;
int test;

int main() {
	scanf("%d", &n);

	test = n;	

	for (int i = 2; i < n; i++) {
		if (test%i == 0) {
			while (test%i == 0) {
				test /= i;
				num2++;
			}
		}
	}

	printf("%d %d", 2, num2);
	return 0;
}