#include <stdio.h>
#include <math.h>
int main(){
	int n, a, b;
	scanf("%d", &n);
	if(n >= 0){
		printf("%d", n);
		return 0;
	}
	else if(n < 0){
		a = n / 10;
		b = (n / 100) * 10 + (n % 10);
	}
	if(a >= b)
	printf("%d", a);
	else if(b >= a)
	printf("%d", b);
	return 0;
}