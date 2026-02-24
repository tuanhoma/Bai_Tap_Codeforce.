#include<stdio.h>
#include <math.h>
int main(){
	long long count = 0, count1 = 0;
	long long i;
	long long n, a, b;
	scanf("%lld %lld %lld", &n, &a, &b);
	for( i = 0; i <= n; i += 3){
		count++;
	}
	long long tong = count * ( a + b); 
	for( i; i <= n; i++){
		count1++;
	}
	long long tong2 = count1 * a;
	long long sum = tong + tong2;
	printf("%lld", sum);
	return 0;
}