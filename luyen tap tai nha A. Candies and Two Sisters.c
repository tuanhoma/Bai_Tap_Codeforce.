#include <stdio.h>
#include <math.h>
void input(long long t){
	long long a, b;
	while(t--){
	int n;
	scanf("%d", &n);
	long long count = 0;
	for(a = n - 1, b = 1; b < a; a--, b++){
		count++;
	}
	printf("%lld\n", count);
	}
}


int main(){
	long long t;
	scanf("%lld", &t);
	input(t);
	return 0;
}