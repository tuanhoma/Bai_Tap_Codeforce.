#include<stdio.h>
#include<math.h>
int main(){
	long long n, tong = 0;
	scanf("%lld", &n);
	tong += (n % 2 == 0) ? (n / 2): -(n + 1) / 2;//toan tu 3 ngoi '?' "biểu_thức_điều_kiện ? giá_trị_nếu_đúng : giá_trị_nếu_sai";
	printf("%lld", tong);//ko dung den vong lap vi no se loi vi mat tg
	return 0;
}