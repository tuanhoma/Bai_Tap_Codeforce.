#include<stdio.h>
#include<math.h>
int main(){
	long long n, m, a;
	long long tong1, tong2;
	scanf("%lld %lld %lld", &n, &m, &a);
	tong1 = (n + a - 1)/a;//phuong phap lam tron so len trong code
	tong2 = (m + a - 1)/a;
	printf("%lld", tong1 * tong2);
}