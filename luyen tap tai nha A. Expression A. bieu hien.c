#include<stdio.h>
#include<math.h>
int main(){
	int a, b, c;
	scanf("%d", &a);
	scanf("%d", &b);
	scanf("%d", &c);
	int sum = (a + b) * c;
	int sum1 = a * (b + c);
	int sum2 = a + b + c;
	int sum3 = a * b * c;
	if((sum > sum1) && (sum > sum2) && (sum > sum3))
	printf("%d", sum);
	else if((sum1 > sum) && (sum1 > sum2) && (sum1 > sum3))
	printf("%d", sum1);
	else if((sum2 > sum) && (sum2 > sum1) && (sum2 > sum3))
	printf("%d", sum2);
	else if((sum3 > sum1) && (sum3 > sum2) && (sum3 > sum))
	printf("%d", sum3);
	return 0;
}
//CACH LAM THU 2
#include <stdio.h>

int max(int a, int b) {//liệt kê hàn so sánh ở ngoài trc
    return (a > b) ? a : b;//sử dụng toán tử so sánh 3 ngôi
}

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    
    int maxValue = max(max(a + b + c, a * b * c), max((a + b) * c, a * (b + c)));
    //áp dụng toán tử so sánh 3 ngôi int maxvalue = max(max(a, b), max(a, b) <=> int maxvalue = max(a, b)
    printf("%d\n", maxValue);
    return 0;
}

