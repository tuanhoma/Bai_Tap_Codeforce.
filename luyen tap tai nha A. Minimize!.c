#include <stdio.h>
#include <math.h>
int main(){
	int t;
	scanf("%d", &t);
	while( t > 0){
		int a, b;
		scanf("%d %d", &a, &b);
		int c = b - a;
		printf("%d\n", c);
		t--;
	}
	return 0;
}