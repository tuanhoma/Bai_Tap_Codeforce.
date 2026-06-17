#include <math.h>
#include <stdio.h>
int main(){
	int t;
	scanf("%d", &t);
	while(t > 0){
		int n;
		scanf("%d", &n);
		printf("%d\n", n / 2);
		t--;
	}
	return 0;
}